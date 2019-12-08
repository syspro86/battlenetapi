package net.zsoo.bnet.wow;

public class SimpleID {

	private int id;
	private String name;
	private String type;
	private Href key;
	private String slug;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Href getKey() {
		return key;
	}
	
	public void setKey(Href key) {
		this.key = key;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
}
