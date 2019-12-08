package net.zsoo.bnet.wow;

public class Talent {
	private SimpleID talent;
	private Spell spell_tooltip;

	public SimpleID getTalent() {
		return talent;
	}

	public void setTalent(SimpleID talent) {
		this.talent = talent;
	}

	public Spell getSpell_tooltip() {
		return spell_tooltip;
	}

	public void setSpell_tooltip(Spell spell_tooltip) {
		this.spell_tooltip = spell_tooltip;
	}
}
