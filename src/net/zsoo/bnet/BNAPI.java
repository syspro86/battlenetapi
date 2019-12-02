package net.zsoo.bnet;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import net.zsoo.bnet.wow.CharacterProfile;
import net.zsoo.bnet.wow.Dungeon;
import net.zsoo.bnet.wow.IdAndName;
import net.zsoo.bnet.wow.Item;
import net.zsoo.bnet.wow.LeaderboardResult;
import net.zsoo.bnet.wow.Realm;
import net.zsoo.bnet.wow.SeasonIndex;
import net.zsoo.bnet.wow.Specialization;

public class BNAPI {

	static final String urlPrefix = "https://kr.api.blizzard.com:443";

	public WOWApi wow = new WOWApi();

	private String apiId;
	private String apiSecret;
	private String apiToken;

	public BNAPI(String apiId, String apiSecret) {
		this.apiId = apiId;
		this.apiSecret = apiSecret;

		apiToken = getToken();
	}

	private String getToken() {
		try {
			String url = "https://kr.battle.net/oauth/token";
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

	private static <T> T request(String uri, Class<T> clazz) {
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

	private static HashMap<?, ?> request(String uri) {
		return request(uri, HashMap.class);
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
				HashMap<?, ?> result = request(
						"/data/wow/realm/index?region=kr&namespace=dynamic-kr&locale=ko_KR&access_token=" + apiToken);

				List<Map> realms = (List<Map>) result.get("realms");
				ArrayList<Realm> ret = new ArrayList<>();
				realms.forEach(realm -> {
					Realm rm = new Realm();
					rm.setId(((Double) realm.get("id")).intValue());
					rm.setName((String) realm.get("name"));
					ret.add(rm);
				});

				return ret.toArray(new Realm[ret.size()]);
			}
		}

		public class DungeonApi {
			public Dungeon[] index() {
				Map<?, ?> result = request(
						"/data/wow/mythic-keystone/dungeon/index?namespace=dynamic-kr&locale=ko_KR&access_token="
								+ apiToken);

				List<Map> dungeons = (List<Map>) result.get("dungeons");
				ArrayList<Dungeon> ret = new ArrayList<>();
				dungeons.forEach(dungeon -> {
					Dungeon dg = request("/data/wow/mythic-keystone/dungeon/" + ((Double) dungeon.get("id")).intValue()
							+ "?namespace=dynamic-kr&locale=ko_KR&access_token=" + apiToken, Dungeon.class);

					if (dg != null) {
						ret.add(dg);
					}
				});

				return ret.toArray(new Dungeon[ret.size()]);
			}
		}

		public class SpecializationApi {
			public class SpecializationIndexResult {
				private IdAndName[] character_specializations;

				public IdAndName[] getCharacter_specializations() {
					return character_specializations;
				}

				public void setCharacter_specializations(IdAndName[] character_specializations) {
					this.character_specializations = character_specializations;
				}
			}

			public IdAndName[] index() {
				SpecializationIndexResult result = request(
						"/data/wow/playable-specialization/index?namespace=static-kr&locale=ko_KR&access_token="
								+ apiToken,
						SpecializationIndexResult.class);

				return result.getCharacter_specializations();
			}

			public Specialization byId(int id) {
				Specialization result = request("/data/wow/playable-specialization/" + id
						+ "?namespace=static-kr&locale=ko_KR&access_token=" + apiToken, Specialization.class);
				return result;
			}
		}

		public class LeaderboardApi {
			public LeaderboardResult list(int realmId, int dungeonId, int period) {
				return request(
						"/data/wow/connected-realm/" + realmId + "/mythic-leaderboard/" + dungeonId + "/period/"
								+ period + "?namespace=dynamic-kr&locale=ko_KR&access_token=" + apiToken,
						LeaderboardResult.class);

			}
		}

		public class CharacterApi {
			private CharacterProfile requestProfile(String realm, String name, String fields) {
				try {
					return request("/wow/character/" + URLEncoder.encode(realm, "UTF-8") + "/"
							+ URLEncoder.encode(name, "UTF-8") + "?fields=" + URLEncoder.encode(fields, "UTF-8")
							+ "&locale=ko_KR&access_token=" + apiToken, CharacterProfile.class);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}

			public CharacterProfile feedAndItems(String realm, String name) {
				return requestProfile(realm, name, "feed,items");
			}

			public CharacterProfile feedAndItemsAndTalents(String realm, String name) {
				return requestProfile(realm, name, "feed,items,talents");
			}

			public CharacterProfile feed(String realm, String name) {
				return requestProfile(realm, name, "feed");
			}

			public CharacterProfile items(String realm, String name) {
				return requestProfile(realm, name, "items");
			}

			public CharacterProfile talents(String realm, String name) {
				return requestProfile(realm, name, "talents");
			}
		}

		public class ItemApi {
			public Item get(int itemId, int[] bonusLists) {
				try {
					StringBuilder bonusListsStr = new StringBuilder();
					if (bonusLists != null && bonusLists.length > 0) {
						bonusListsStr.append("bl=");
						bonusListsStr.append(URLEncoder.encode(
								String.join(",",
										Arrays.stream(bonusLists).mapToObj(String::valueOf).toArray(String[]::new)),
								"UTF-8"));
						bonusListsStr.append("&");
					}
					return request("/wow/item/" + itemId + "?" + bonusListsStr.toString() + "locale=ko_KR&access_token="
							+ apiToken, Item.class);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		public class SeasonApi {
			public SeasonIndex index() {
				SeasonIndex result = request(
						"/data/wow/mythic-keystone/season/index?namespace=dynamic-kr&locale=ko_KR&access_token="
								+ apiToken, SeasonIndex.class);
				return result;
			}
		}
	}
}
