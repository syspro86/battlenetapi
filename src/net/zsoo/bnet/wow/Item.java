package net.zsoo.bnet.wow;

import java.util.HashMap;

public class Item {
	private int id;
	private int disenchantingSkillRank;
	private String description;
	private String name;
	private String icon;
	private int stackable;
	private int itemBind;
	private Stats[] bonusStats;
	private HashMap[] itemSpells;
	private int buyPrice;
	private int itemClass;
	private int itemSubClass;
	private int containerSlots;
	private HashMap weaponInfo;
	private int inventoryType;
	private boolean equippable;
	private int itemLevel;
	private int maxCount;
	private int maxDurability;
	private int minFactionId;
	private int minReputation;
	private int quality;
	private int sellPrice;
	private int requiredSkill;
	private int requiredLevel;
	private int requiredSkillRank;
	private HashMap itemSource;
	private int baseArmor;
	private boolean hasSockets;
	private boolean isAuctionable;
	private int armor;
	private int displayInfoId;
	private String nameDescription;
	private String nameDescriptionColor;
	private boolean upgradable;
	private boolean heroicTooltip;
	private String context;
	private int[] bonusLists;
	private String[] availableContexts;
	private HashMap bonusSummary;
	private int artifactId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDisenchantingSkillRank() {
		return disenchantingSkillRank;
	}

	public void setDisenchantingSkillRank(int disenchantingSkillRank) {
		this.disenchantingSkillRank = disenchantingSkillRank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getStackable() {
		return stackable;
	}

	public void setStackable(int stackable) {
		this.stackable = stackable;
	}

	public int getItemBind() {
		return itemBind;
	}

	public void setItemBind(int itemBind) {
		this.itemBind = itemBind;
	}

	public Stats[] getBonusStats() {
		return bonusStats;
	}

	public void setBonusStats(Stats[] bonusStats) {
		this.bonusStats = bonusStats;
	}

	public HashMap[] getItemSpells() {
		return itemSpells;
	}

	public void setItemSpells(HashMap[] itemSpells) {
		this.itemSpells = itemSpells;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getItemClass() {
		return itemClass;
	}

	public void setItemClass(int itemClass) {
		this.itemClass = itemClass;
	}

	public int getItemSubClass() {
		return itemSubClass;
	}

	public void setItemSubClass(int itemSubClass) {
		this.itemSubClass = itemSubClass;
	}

	public int getContainerSlots() {
		return containerSlots;
	}

	public void setContainerSlots(int containerSlots) {
		this.containerSlots = containerSlots;
	}

	public HashMap getWeaponInfo() {
		return weaponInfo;
	}

	public void setWeaponInfo(HashMap weaponInfo) {
		this.weaponInfo = weaponInfo;
	}

	public int getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(int inventoryType) {
		this.inventoryType = inventoryType;
	}

	public boolean isEquippable() {
		return equippable;
	}

	public void setEquippable(boolean equippable) {
		this.equippable = equippable;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getMaxDurability() {
		return maxDurability;
	}

	public void setMaxDurability(int maxDurability) {
		this.maxDurability = maxDurability;
	}

	public int getMinFactionId() {
		return minFactionId;
	}

	public void setMinFactionId(int minFactionId) {
		this.minFactionId = minFactionId;
	}

	public int getMinReputation() {
		return minReputation;
	}

	public void setMinReputation(int minReputation) {
		this.minReputation = minReputation;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(int requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	public int getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public int getRequiredSkillRank() {
		return requiredSkillRank;
	}

	public void setRequiredSkillRank(int requiredSkillRank) {
		this.requiredSkillRank = requiredSkillRank;
	}

	public HashMap getItemSource() {
		return itemSource;
	}

	public void setItemSource(HashMap itemSource) {
		this.itemSource = itemSource;
	}

	public int getBaseArmor() {
		return baseArmor;
	}

	public void setBaseArmor(int baseArmor) {
		this.baseArmor = baseArmor;
	}

	public boolean isHasSockets() {
		return hasSockets;
	}

	public void setHasSockets(boolean hasSockets) {
		this.hasSockets = hasSockets;
	}

	public boolean isAuctionable() {
		return isAuctionable;
	}

	public void setAuctionable(boolean isAuctionable) {
		this.isAuctionable = isAuctionable;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getDisplayInfoId() {
		return displayInfoId;
	}

	public void setDisplayInfoId(int displayInfoId) {
		this.displayInfoId = displayInfoId;
	}

	public String getNameDescription() {
		return nameDescription;
	}

	public void setNameDescription(String nameDescription) {
		this.nameDescription = nameDescription;
	}

	public String getNameDescriptionColor() {
		return nameDescriptionColor;
	}

	public void setNameDescriptionColor(String nameDescriptionColor) {
		this.nameDescriptionColor = nameDescriptionColor;
	}

	public boolean isUpgradable() {
		return upgradable;
	}

	public void setUpgradable(boolean upgradable) {
		this.upgradable = upgradable;
	}

	public boolean isHeroicTooltip() {
		return heroicTooltip;
	}

	public void setHeroicTooltip(boolean heroicTooltip) {
		this.heroicTooltip = heroicTooltip;
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

	public String[] getAvailableContexts() {
		return availableContexts;
	}

	public void setAvailableContexts(String[] availableContexts) {
		this.availableContexts = availableContexts;
	}

	public HashMap getBonusSummary() {
		return bonusSummary;
	}

	public void setBonusSummary(HashMap bonusSummary) {
		this.bonusSummary = bonusSummary;
	}

	public int getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(int artifactId) {
		this.artifactId = artifactId;
	}
}
