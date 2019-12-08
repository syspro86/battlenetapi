package net.zsoo.bnet.wow;

public class LeaderboardRecordMember {
	private LeaderboardRecordMemberProfile profile;
	private SimpleID faction;
	private SimpleID specialization;

	public LeaderboardRecordMemberProfile getProfile() {
		return profile;
	}

	public void setProfile(LeaderboardRecordMemberProfile profile) {
		this.profile = profile;
	}

	public SimpleID getFaction() {
		return faction;
	}

	public void setFaction(SimpleID faction) {
		this.faction = faction;
	}

	public SimpleID getSpecialization() {
		return specialization;
	}

	public void setSpecialization(SimpleID specialization) {
		this.specialization = specialization;
	}

}
