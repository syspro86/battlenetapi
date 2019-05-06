package net.zsoo.bnet.wow;

import java.util.ArrayList;
import java.util.HashMap;

public class Specialization extends IdAndName {
	private IdAndName playable_class;
	private HashMap gender_description;
	private HashMap media;
	private TypeAndName role;
	private ArrayList talent_tiers;
	private ArrayList pvp_talents;

	public IdAndName getPlayable_class() {
		return playable_class;
	}

	public void setPlayable_class(IdAndName playable_class) {
		this.playable_class = playable_class;
	}

	public HashMap getGender_description() {
		return gender_description;
	}

	public void setGender_description(HashMap gender_description) {
		this.gender_description = gender_description;
	}

	public HashMap getMedia() {
		return media;
	}

	public void setMedia(HashMap media) {
		this.media = media;
	}

	public TypeAndName getRole() {
		return role;
	}

	public void setRole(TypeAndName role) {
		this.role = role;
	}

	public ArrayList getTalent_tiers() {
		return talent_tiers;
	}

	public void setTalent_tiers(ArrayList talent_tiers) {
		this.talent_tiers = talent_tiers;
	}

	public ArrayList getPvp_talents() {
		return pvp_talents;
	}

	public void setPvp_talents(ArrayList pvp_talents) {
		this.pvp_talents = pvp_talents;
	}
}
