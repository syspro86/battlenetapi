package net.zsoo.bnet.wow;

public class CharacterSpecialization {
	private SimpleID specialization;
	private Talent[] talents;
	// private Map[] glyphs;
	private TalentSlot[] pvp_talent_slots;

	public SimpleID getSpecialization() {
		return specialization;
	}

	public void setSpecialization(SimpleID specialization) {
		this.specialization = specialization;
	}

	public Talent[] getTalents() {
		return talents;
	}

	public void setTalents(Talent[] talents) {
		this.talents = talents;
	}

	public TalentSlot[] getPvp_talent_slots() {
		return pvp_talent_slots;
	}

	public void setPvp_talent_slots(TalentSlot[] pvp_talent_slots) {
		this.pvp_talent_slots = pvp_talent_slots;
	}
}
