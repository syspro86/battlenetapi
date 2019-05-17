package net.zsoo.bnet.wow;

import java.util.HashMap;

public class CharacterProfileItem {
	private int id;
	private String name;
	private String icon;
	private int quality;
	private int itemLevel;
	private HashMap tooltipParams;
	private Stats[] stats;
	private int armor;
	private HashMap weaponInfo;
	private String context;
	private int[] bonusLists;
	private int artifactId;
	private int displayInfoId;
	private int artifactAppearanceId;
	private int[] artifactTraits;
	private int[] relics;
	private HashMap appearance;
	private AzeriteItem azeriteItem;
	private AzeriteEmpoweredItem azeriteEmpoweredItem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public HashMap getTooltipParams() {
		return tooltipParams;
	}

	public void setTooltipParams(HashMap tooltipParams) {
		this.tooltipParams = tooltipParams;
	}

	public Stats[] getStats() {
		return stats;
	}

	public void setStats(Stats[] stats) {
		this.stats = stats;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public HashMap getWeaponInfo() {
		return weaponInfo;
	}

	public void setWeaponInfo(HashMap weaponInfo) {
		this.weaponInfo = weaponInfo;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int[] getBonusLists() {
		return bonusLists;
	}

	public void setBonusLists(int[] bonusLists) {
		this.bonusLists = bonusLists;
	}

	public int getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(int artifactId) {
		this.artifactId = artifactId;
	}

	public int getDisplayInfoId() {
		return displayInfoId;
	}

	public void setDisplayInfoId(int displayInfoId) {
		this.displayInfoId = displayInfoId;
	}

	public int getArtifactAppearanceId() {
		return artifactAppearanceId;
	}

	public void setArtifactAppearanceId(int artifactAppearanceId) {
		this.artifactAppearanceId = artifactAppearanceId;
	}

	public int[] getArtifactTraits() {
		return artifactTraits;
	}

	public void setArtifactTraits(int[] artifactTraits) {
		this.artifactTraits = artifactTraits;
	}

	public int[] getRelics() {
		return relics;
	}

	public void setRelics(int[] relics) {
		this.relics = relics;
	}

	public HashMap getAppearance() {
		return appearance;
	}

	public void setAppearance(HashMap appearance) {
		this.appearance = appearance;
	}

	public AzeriteItem getAzeriteItem() {
		return azeriteItem;
	}

	public void setAzeriteItem(AzeriteItem azeriteItem) {
		this.azeriteItem = azeriteItem;
	}

	public AzeriteEmpoweredItem getAzeriteEmpoweredItem() {
		return azeriteEmpoweredItem;
	}

	public void setAzeriteEmpoweredItem(AzeriteEmpoweredItem azeriteEmpoweredItem) {
		this.azeriteEmpoweredItem = azeriteEmpoweredItem;
	}
}
