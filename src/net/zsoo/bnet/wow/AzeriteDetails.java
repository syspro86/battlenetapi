package net.zsoo.bnet.wow;

public class AzeriteDetails {
	private AzeritePower[] selected_powers;
	private AzeriteEssence[] selected_essences;
	private String selected_powers_string;
	private float percentage_to_next_level;
	private SimpleValue level;

	public AzeritePower[] getSelected_powers() {
		return selected_powers;
	}

	public void setSelected_powers(AzeritePower[] selected_powers) {
		this.selected_powers = selected_powers;
	}

	public AzeriteEssence[] getSelected_essences() {
		return selected_essences;
	}

	public void setSelected_essences(AzeriteEssence[] selected_essences) {
		this.selected_essences = selected_essences;
	}

	public String getSelected_powers_string() {
		return selected_powers_string;
	}

	public void setSelected_powers_string(String selected_powers_string) {
		this.selected_powers_string = selected_powers_string;
	}

	public float getPercentage_to_next_level() {
		return percentage_to_next_level;
	}

	public void setPercentage_to_next_level(float percentage_to_next_level) {
		this.percentage_to_next_level = percentage_to_next_level;
	}

	public SimpleValue getLevel() {
		return level;
	}

	public void setLevel(SimpleValue level) {
		this.level = level;
	}
}
