package net.zsoo.bnet.wow;

public class SeasonIndex {
	private SimpleID[] seasons;
	private SimpleID current_season;

	public SimpleID[] getSeasons() {
		return seasons;
	}

	public void setSeasons(SimpleID[] seasons) {
		this.seasons = seasons;
	}

	public SimpleID getCurrent_season() {
		return current_season;
	}

	public void setCurrent_season(SimpleID current_season) {
		this.current_season = current_season;
	}
}
