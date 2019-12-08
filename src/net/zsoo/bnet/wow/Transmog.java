package net.zsoo.bnet.wow;

public class Transmog {
	private SimpleID item;
	private String display_string;
	private int item_modified_appearance_id;

	public SimpleID getItem() {
		return item;
	}

	public void setItem(SimpleID item) {
		this.item = item;
	}

	public String getDisplay_string() {
		return display_string;
	}

	public void setDisplay_string(String display_string) {
		this.display_string = display_string;
	}

	public int getItem_modified_appearance_id() {
		return item_modified_appearance_id;
	}

	public void setItem_modified_appearance_id(int item_modified_appearance_id) {
		this.item_modified_appearance_id = item_modified_appearance_id;
	}

}
