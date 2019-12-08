package net.zsoo.bnet.wow;

public class CharacterEquipmentItem {
	private SimpleID item;
	private Enchantment[] enchantments;
	private Socket[] sockets;
	private SimpleID slot;
	private int quantity;
	private int context;
	private int[] bonus_list;
	private SimpleID quality;
	private String name;
	private int modified_appearance_id;
	private AzeriteDetails azerite_details;
	private SimpleID media;
	private SimpleID item_class;
	private SimpleID item_subclass;
	private SimpleID incentory_type;
	private SimpleID binding;
	private String unique_equipped;
	private SimpleValue armor;
	private SimpleValue[] stats;
	private Spell[] spells;
	private SimpleValue sell_price;
	private Requirement requirements;
	private SimpleValue level;
	private Transmog transmog;
	private SimpleValue durability;
	private boolean is_subclass_hidden;
	private SimpleValue name_description;

	public SimpleID getItem() {
		return item;
	}

	public void setItem(SimpleID item) {
		this.item = item;
	}

	public Enchantment[] getEnchantments() {
		return enchantments;
	}

	public void setEnchantments(Enchantment[] enchantments) {
		this.enchantments = enchantments;
	}

	public Socket[] getSockets() {
		return sockets;
	}

	public void setSockets(Socket[] sockets) {
		this.sockets = sockets;
	}

	public SimpleID getSlot() {
		return slot;
	}

	public void setSlot(SimpleID slot) {
		this.slot = slot;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getContext() {
		return context;
	}

	public void setContext(int context) {
		this.context = context;
	}

	public int[] getBonus_list() {
		return bonus_list;
	}

	public void setBonus_list(int[] bonus_list) {
		this.bonus_list = bonus_list;
	}

	public SimpleID getQuality() {
		return quality;
	}

	public void setQuality(SimpleID quality) {
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModified_appearance_id() {
		return modified_appearance_id;
	}

	public void setModified_appearance_id(int modified_appearance_id) {
		this.modified_appearance_id = modified_appearance_id;
	}

	public AzeriteDetails getAzerite_details() {
		return azerite_details;
	}

	public void setAzerite_details(AzeriteDetails azerite_details) {
		this.azerite_details = azerite_details;
	}

	public SimpleID getMedia() {
		return media;
	}

	public void setMedia(SimpleID media) {
		this.media = media;
	}

	public SimpleID getItem_class() {
		return item_class;
	}

	public void setItem_class(SimpleID item_class) {
		this.item_class = item_class;
	}

	public SimpleID getItem_subclass() {
		return item_subclass;
	}

	public void setItem_subclass(SimpleID item_subclass) {
		this.item_subclass = item_subclass;
	}

	public SimpleID getIncentory_type() {
		return incentory_type;
	}

	public void setIncentory_type(SimpleID incentory_type) {
		this.incentory_type = incentory_type;
	}

	public SimpleID getBinding() {
		return binding;
	}

	public void setBinding(SimpleID binding) {
		this.binding = binding;
	}

	public String getUnique_equipped() {
		return unique_equipped;
	}

	public void setUnique_equipped(String unique_equipped) {
		this.unique_equipped = unique_equipped;
	}

	public SimpleValue getArmor() {
		return armor;
	}

	public void setArmor(SimpleValue armor) {
		this.armor = armor;
	}

	public SimpleValue[] getStats() {
		return stats;
	}

	public void setStats(SimpleValue[] stats) {
		this.stats = stats;
	}

	public Spell[] getSpells() {
		return spells;
	}

	public void setSpells(Spell[] spells) {
		this.spells = spells;
	}

	public SimpleValue getSell_price() {
		return sell_price;
	}

	public void setSell_price(SimpleValue sell_price) {
		this.sell_price = sell_price;
	}

	public Requirement getRequirements() {
		return requirements;
	}

	public void setRequirements(Requirement requirements) {
		this.requirements = requirements;
	}

	public SimpleValue getLevel() {
		return level;
	}

	public void setLevel(SimpleValue level) {
		this.level = level;
	}

	public Transmog getTransmog() {
		return transmog;
	}

	public void setTransmog(Transmog transmog) {
		this.transmog = transmog;
	}

	public SimpleValue getDurability() {
		return durability;
	}

	public void setDurability(SimpleValue durability) {
		this.durability = durability;
	}

	public boolean isIs_subclass_hidden() {
		return is_subclass_hidden;
	}

	public void setIs_subclass_hidden(boolean is_subclass_hidden) {
		this.is_subclass_hidden = is_subclass_hidden;
	}

	public SimpleValue getName_description() {
		return name_description;
	}

	public void setName_description(SimpleValue name_description) {
		this.name_description = name_description;
	}
}
