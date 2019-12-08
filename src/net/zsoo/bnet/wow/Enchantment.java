package net.zsoo.bnet.wow;

public class Enchantment {
	private String display_string;
	private SimpleID source_item;
	private int enchantment_id;
	private SimpleID enchantment_slot;

	public String getDisplay_string() {
		return display_string;
	}

	public void setDisplay_string(String display_string) {
		this.display_string = display_string;
	}

	public SimpleID getSource_item() {
		return source_item;
	}

	public void setSource_item(SimpleID source_item) {
		this.source_item = source_item;
	}

	public int getEnchantment_id() {
		return enchantment_id;
	}

	public void setEnchantment_id(int enchantment_id) {
		this.enchantment_id = enchantment_id;
	}

	public SimpleID getEnchantment_slot() {
		return enchantment_slot;
	}

	public void setEnchantment_slot(SimpleID enchantment_slot) {
		this.enchantment_slot = enchantment_slot;
	}
}
