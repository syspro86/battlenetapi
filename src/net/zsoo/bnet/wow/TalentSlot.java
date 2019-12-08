package net.zsoo.bnet.wow;

public class TalentSlot {
	private Talent selected;
	private int slot_number;

	public Talent getSelected() {
		return selected;
	}

	public void setSelected(Talent selected) {
		this.selected = selected;
	}

	public int getSlot_number() {
		return slot_number;
	}

	public void setSlot_number(int slot_number) {
		this.slot_number = slot_number;
	}
}
