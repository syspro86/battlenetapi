package net.zsoo.bnet.wow;

public class SimpleValue {
	private SimpleID type;
	private int value;
	private String display_string;
	private Currency display_strings;
	private boolean is_negated;
	private RGBA color;

	public SimpleID getType() {
		return type;
	}

	public void setType(SimpleID type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDisplay_string() {
		return display_string;
	}

	public void setDisplay_string(String display_string) {
		this.display_string = display_string;
	}

	public Currency getDisplay_strings() {
		return display_strings;
	}

	public void setDisplay_strings(Currency display_strings) {
		this.display_strings = display_strings;
	}

	public boolean isIs_negated() {
		return is_negated;
	}

	public void setIs_negated(boolean is_negated) {
		this.is_negated = is_negated;
	}

	public RGBA getColor() {
		return color;
	}

	public void setColor(RGBA color) {
		this.color = color;
	}
}