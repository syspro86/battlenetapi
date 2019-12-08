package net.zsoo.bnet.profile.wow.character;

import net.zsoo.bnet.wow.CharacterSpecialization;
import net.zsoo.bnet.wow.SimpleID;

public class CharacterSpecializationResp {
	private SimpleID active_specialization;
	private CharacterSpecialization[] specializations;

	public SimpleID getActive_specialization() {
		return active_specialization;
	}

	public void setActive_specialization(SimpleID active_specialization) {
		this.active_specialization = active_specialization;
	}

	public CharacterSpecialization[] getSpecializations() {
		return specializations;
	}

	public void setSpecializations(CharacterSpecialization[] specializations) {
		this.specializations = specializations;
	}
}
