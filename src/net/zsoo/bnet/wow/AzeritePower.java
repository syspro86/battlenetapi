package net.zsoo.bnet.wow;

public class AzeritePower {
	private int id;
	private int tier;
	private Spell spell_tooltip;
	private boolean is_display_hidden;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public Spell getSpell_tooltip() {
		return spell_tooltip;
	}

	public void setSpell_tooltip(Spell spell_tooltip) {
		this.spell_tooltip = spell_tooltip;
	}

	public boolean isIs_display_hidden() {
		return is_display_hidden;
	}

	public void setIs_display_hidden(boolean is_display_hidden) {
		this.is_display_hidden = is_display_hidden;
	}
}
