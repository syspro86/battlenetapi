package net.zsoo.bnet.wow;

public class LeaderboardResult {
	private SimpleID map;
	private int period;
	private long period_start_timestamp;
	private long period_end_timestamp;
	private LeaderboardRecord[] leading_groups;

	public SimpleID getMap() {
		return map;
	}

	public void setMap(SimpleID map) {
		this.map = map;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public long getPeriod_start_timestamp() {
		return period_start_timestamp;
	}

	public void setPeriod_start_timestamp(long period_start_timestamp) {
		this.period_start_timestamp = period_start_timestamp;
	}

	public long getPeriod_end_timestamp() {
		return period_end_timestamp;
	}

	public void setPeriod_end_timestamp(long period_end_timestamp) {
		this.period_end_timestamp = period_end_timestamp;
	}

	public LeaderboardRecord[] getLeading_groups() {
		return leading_groups;
	}

	public void setLeading_groups(LeaderboardRecord[] leading_groups) {
		this.leading_groups = leading_groups;
	}
}
