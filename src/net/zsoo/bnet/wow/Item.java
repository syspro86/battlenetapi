package net.zsoo.bnet.wow;

import com.google.gson.Gson;

public class Item {
	private int id;
	private String name;
	private SimpleID quality;
	private int level;
	private int required_level;
	private SimpleID media;
	private SimpleID item_class;
	private SimpleID item_subclass;
	private SimpleID inventory_type;
	private int purchase_price;
	private int sell_price;
	private int max_count;
	private boolean is_equippable;
	private boolean is_stackable;
	private String description;

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

	public SimpleID getQuality() {
		return quality;
	}

	public void setQuality(SimpleID quality) {
		this.quality = quality;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRequired_level() {
		return required_level;
	}

	public void setRequired_level(int required_level) {
		this.required_level = required_level;
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

	public SimpleID getInventory_type() {
		return inventory_type;
	}

	public void setInventory_type(SimpleID inventory_type) {
		this.inventory_type = inventory_type;
	}

	public int getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}

	public int getSell_price() {
		return sell_price;
	}

	public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
	}

	public int getMax_count() {
		return max_count;
	}

	public void setMax_count(int max_count) {
		this.max_count = max_count;
	}

	public boolean isIs_equippable() {
		return is_equippable;
	}

	public void setIs_equippable(boolean is_equippable) {
		this.is_equippable = is_equippable;
	}

	public boolean isIs_stackable() {
		return is_stackable;
	}

	public void setIs_stackable(boolean is_stackable) {
		this.is_stackable = is_stackable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
