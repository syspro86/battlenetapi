package net.zsoo.bnet.wow;

import com.google.gson.annotations.SerializedName;

public class CharacterProfile {
	private long lastModified;
	private String name;
	private String realm;
	private String battlegroup;
	@SerializedName("class")
	private int class_;
	private int race;
	private int gender;
	private int level;
	private int achievementPoints;
	private String thumbnail;
	private String calcClass;
	private int faction;
	private CharacterProfileFeed[] feed;
	private CharacterProfileItems items;
	private CharacterProfileTalent[] talents;

	public long getLastModified() {
		return lastModified;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getBattlegroup() {
		return battlegroup;
	}

	public void setBattlegroup(String battlegroup) {
		this.battlegroup = battlegroup;
	}

	public int getClass_() {
		return class_;
	}

	public void setClass_(int class_) {
		this.class_ = class_;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAchievementPoints() {
		return achievementPoints;
	}

	public void setAchievementPoints(int achievementPoints) {
		this.achievementPoints = achievementPoints;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getCalcClass() {
		return calcClass;
	}

	public void setCalcClass(String calcClass) {
		this.calcClass = calcClass;
	}

	public int getFaction() {
		return faction;
	}

	public void setFaction(int faction) {
		this.faction = faction;
	}

	public CharacterProfileFeed[] getFeed() {
		return feed;
	}

	public void setFeed(CharacterProfileFeed[] feed) {
		this.feed = feed;
	}

	public CharacterProfileItems getItems() {
		return items;
	}

	public void setItems(CharacterProfileItems items) {
		this.items = items;
	}

	public CharacterProfileTalent[] getTalents() {
		return talents;
	}

	public void setTalents(CharacterProfileTalent[] talents) {
		this.talents = talents;
	}
}
