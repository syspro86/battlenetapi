package net.zsoo.bnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;

import com.google.gson.Gson;

import net.zsoo.bnet.profile.wow.character.CharacterEquipmentResp;
import net.zsoo.bnet.profile.wow.character.CharacterMediaResp;
import net.zsoo.bnet.profile.wow.character.CharacterProfileResp;
import net.zsoo.bnet.wow.CharacterProfile;
import net.zsoo.bnet.wow.Dungeon;
import net.zsoo.bnet.wow.Item;
import net.zsoo.bnet.wow.LeaderboardResult;
import net.zsoo.bnet.wow.Realm;
import net.zsoo.bnet.wow.SeasonIndex;
import net.zsoo.bnet.wow.SimpleID;
import net.zsoo.bnet.wow.Specialization;
import net.zsoo.bnet.wow.data.DungeonIndex;
import net.zsoo.bnet.wow.data.RealmIndex;

public class BNAPI {

	final String urlPrefix;

	public WOWApi wow = new WOWApi();

	private String region;
	private String apiId;
	private String apiSecret;
	private String apiToken;

	public BNAPI(String apiId, String apiSecret) {
		this(apiId, apiSecret, "kr");
	}

	public BNAPI(String apiId, String apiSecret, String region) {
		this.apiId = apiId;
		this.apiSecret = apiSecret;
		this.region = region;

		urlPrefix = "https://" + this.region + ".api.blizzard.com:443";

		apiToken = getToken();
	}

	private String locale() {
		switch (region) {
		case "us":
			return "en_US";
		case "eu":
			return "en_GB";
		case "kr":
			return "ko_KR";
		case "tw":
			return "zh_TW";
		}
		return null;
	}

	private String regionParameter(String namespace) {
		StringBuilder sb = new StringBuilder();
		sb.append("region=");
		sb.append(region);
		if (namespace != null) {
			sb.append("&namespace=");
			sb.append(namespace);
			sb.append("-");
			sb.append(this.region);
		}
		sb.append("&locale=");
		sb.append(locale());
		return sb.toString();
	}

	private String tokenParameter() {
		return "&access_token=" + apiToken;
	}

	private String postfixParameter(String namespace) {
		return regionParameter(namespace) + tokenParameter();
	}

	private String getToken() {
		try {
			String url = "https://" + region + ".battle.net/oauth/token";
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			String auth = apiId + ':' + apiSecret;
			auth = new String(Base64.getEncoder().encode(auth.getBytes()));
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", "Basic " + auth);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setDoOutput(true);

			OutputStream os = conn.getOutputStream();
			os.write("grant_type=client_credentials".getBytes());
			os.flush();

			int code = conn.getResponseCode();
			if (code != 200) {
				System.err.println("getToken failed. resp code = " + code);
				Gson gson = new Gson();
				InputStream is = conn.getErrorStream();
				HashMap<?, ?> obj = gson.fromJson(new InputStreamReader(is), HashMap.class);
				System.err.println(gson.toJson(obj));
				return null;
			}

			InputStream is = conn.getInputStream();

			Gson gson = new Gson();
			HashMap<?, ?> obj = gson.fromJson(new InputStreamReader(is), HashMap.class);
			return (String) obj.get("access_token");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private <T> T request(String uri, Class<T> clazz) {
		try {
			String url = urlPrefix + uri;
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			int code = conn.getResponseCode();
			if (code != 200) {
				return null;
			}

			InputStream is = conn.getInputStream();

			Gson gson = new Gson();
			T obj = gson.fromJson(new InputStreamReader(is), clazz);
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public class WOWApi {
		public RealmApi realm = new RealmApi();
		public DungeonApi dungeon = new DungeonApi();
		public SpecializationApi specialization = new SpecializationApi();
		public LeaderboardApi leaderboard = new LeaderboardApi();
		public CharacterApi character = new CharacterApi();
		public ItemApi item = new ItemApi();
		public SeasonApi season = new SeasonApi();

		public class RealmApi {
			public Realm[] index() {
				RealmIndex result = request("/data/wow/realm/index?" + postfixParameter("dynamic"), RealmIndex.class);
				return result.getRealms();
			}
		}

		public class DungeonApi {
			public Dungeon[] index() {
				DungeonIndex result = request("/data/wow/mythic-keystone/dungeon/index?" + postfixParameter("dynamic"), DungeonIndex.class);

				SimpleID[] dungeons = result.getDungeons();
				return Arrays.stream(dungeons).map(dungeon -> {
					return request("/data/wow/mythic-keystone/dungeon/" + dungeon.getId() + "?" + postfixParameter("dynamic"), Dungeon.class);
				}).filter(dg -> dg != null).toArray(Dungeon[]::new);
			}
		}

		public class SpecializationApi {
			public class SpecializationIndexResult {
				private SimpleID[] character_specializations;

				public SimpleID[] getCharacter_specializations() {
					return character_specializations;
				}

				public void setCharacter_specializations(SimpleID[] character_specializations) {
					this.character_specializations = character_specializations;
				}
			}

			public SimpleID[] index() {
				SpecializationIndexResult result = request("/data/wow/playable-specialization/index?" + postfixParameter("static"),
						SpecializationIndexResult.class);

				return result.getCharacter_specializations();
			}

			public Specialization byId(int id) {
				Specialization result = request("/data/wow/playable-specialization/" + id + "?" + postfixParameter("static"), Specialization.class);
				return result;
			}
		}

		public class LeaderboardApi {
			public LeaderboardResult list(int realmId, int dungeonId, int period) {
				return request(
						"/data/wow/connected-realm/" + realmId + "/mythic-leaderboard/" + dungeonId + "/period/" + period + "?" + postfixParameter("dynamic"),
						LeaderboardResult.class);

			}
		}

		public class CharacterApi {
			public CharacterProfile get(String realm, String name) {
				try {
					CharacterProfileResp profileResp = request("/profile/wow/character/" + URLEncoder.encode(realm, "UTF-8") + "/"
							+ URLEncoder.encode(name, "UTF-8") + "?" + postfixParameter("profile"), CharacterProfileResp.class);

					if (profileResp == null) {
						return null;
					}
					
					CharacterEquipmentResp equipmentResp = request("/profile/wow/character/" + URLEncoder.encode(realm, "UTF-8") + "/"
							+ URLEncoder.encode(name, "UTF-8") + "/equipment?" + postfixParameter("profile"), CharacterEquipmentResp.class);

					CharacterMediaResp mediaResp = request("/profile/wow/character/" + URLEncoder.encode(realm, "UTF-8") + "/"
							+ URLEncoder.encode(name, "UTF-8") + "/character-media?" + postfixParameter("profile"), CharacterMediaResp.class);

					CharacterProfile profile = new CharacterProfile();
					profile.setId(profileResp.getId());
					profile.setName(profileResp.getName());
					profile.setGender(profileResp.getGender());
					profile.setFaction(profileResp.getFaction());
					profile.setRace(profileResp.getRace());
					profile.setCharacter_class(profileResp.getCharacter_class());
					profile.setActive_spec(profileResp.getActive_spec());
					profile.setRealm(profileResp.getRealm());
					profile.setGuild(profileResp.getGuild());
					profile.setEquipped_items(equipmentResp.getEquipped_items());
					profile.setAvatar_url(mediaResp.getAvatar_url());
					profile.setBust_url(mediaResp.getBust_url());
					profile.setRender_url(mediaResp.getRender_url());
					return profile;
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
		}

		public class ItemApi {
			public Item get(int itemId) {
				return request("/data/wow/item/" + itemId + "?" + postfixParameter("static"), Item.class);
			}
		}

		public class SeasonApi {
			public SeasonIndex index() {
				SeasonIndex result = request("/data/wow/mythic-keystone/season/index?" + postfixParameter("dynamic"), SeasonIndex.class);
				return result;
			}
		}
	}
}
