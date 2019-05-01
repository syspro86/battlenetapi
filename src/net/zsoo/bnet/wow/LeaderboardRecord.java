package net.zsoo.bnet.wow;

public class LeaderboardRecord {
	private int ranking;
	private int duration;
	private long completed_timestamp;
	private int keystone_level;
	private LeaderboardRecordMember[] members;

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public long getCompleted_timestamp() {
		return completed_timestamp;
	}

	public void setCompleted_timestamp(long completed_timestamp) {
		this.completed_timestamp = completed_timestamp;
	}

	public int getKeystone_level() {
		return keystone_level;
	}

	public void setKeystone_level(int keystone_level) {
		this.keystone_level = keystone_level;
	}

	public LeaderboardRecordMember[] getMembers() {
		return members;
	}

	public void setMembers(LeaderboardRecordMember[] members) {
		this.members = members;
	}
}
