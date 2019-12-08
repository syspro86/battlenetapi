package net.zsoo.bnet.wow;

public class AzeriteEssence {
	private int slot;
	private int rank;
	private Spell main_spell_tooltip;
	private Spell passive_spell_tooltip;
	private SimpleID essence;
	private SimpleID media;

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Spell getMain_spell_tooltip() {
		return main_spell_tooltip;
	}

	public void setMain_spell_tooltip(Spell main_spell_tooltip) {
		this.main_spell_tooltip = main_spell_tooltip;
	}

	public Spell getPassive_spell_tooltip() {
		return passive_spell_tooltip;
	}

	public void setPassive_spell_tooltip(Spell passive_spell_tooltip) {
		this.passive_spell_tooltip = passive_spell_tooltip;
	}

	public SimpleID getEssence() {
		return essence;
	}

	public void setEssence(SimpleID essence) {
		this.essence = essence;
	}

	public SimpleID getMedia() {
		return media;
	}

	public void setMedia(SimpleID media) {
		this.media = media;
	}
}
