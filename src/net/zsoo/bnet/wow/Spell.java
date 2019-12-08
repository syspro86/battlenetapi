package net.zsoo.bnet.wow;

public class Spell {
	private SimpleID spell;
	private String description;
	private String cast_time;
	private String range;

	public SimpleID getSpell() {
		return spell;
	}

	public void setSpell(SimpleID spell) {
		this.spell = spell;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCast_time() {
		return cast_time;
	}

	public void setCast_time(String cast_time) {
		this.cast_time = cast_time;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
}
