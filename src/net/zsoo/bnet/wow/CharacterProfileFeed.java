package net.zsoo.bnet.wow;

public class CharacterProfileFeed {
	private String type;
	private long timestamp;
	private int itemId;
	private String context;
	private int[] bonusLists;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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
}
