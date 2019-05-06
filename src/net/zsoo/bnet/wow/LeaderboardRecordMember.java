package net.zsoo.bnet.wow;

import java.util.HashMap;

public class LeaderboardRecordMember {
	private LeaderboardRecordMemberProfile profile;
	private HashMap faction;
	private IdAndName specialization;

	public LeaderboardRecordMemberProfile getProfile() {
		return profile;
	}

	public void setProfile(LeaderboardRecordMemberProfile profile) {
		this.profile = profile;
	}

	public HashMap getFaction() {
		return faction;
	}

	public void setFaction(HashMap faction) {
		this.faction = faction;
	}

	public IdAndName getSpecialization() {
		return specialization;
	}

	public void setSpecialization(IdAndName specialization) {
		this.specialization = specialization;
	}

}
