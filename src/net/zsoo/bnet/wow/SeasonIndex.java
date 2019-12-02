package net.zsoo.bnet.wow;

public class SeasonIndex {
	private IdAndName[] seasons;
	private IdAndName current_season;

	public IdAndName[] getSeasons() {
		return seasons;
	}

	public void setSeasons(IdAndName[] seasons) {
		this.seasons = seasons;
	}

	public IdAndName getCurrent_season() {
		return current_season;
	}

	public void setCurrent_season(IdAndName current_season) {
		this.current_season = current_season;
	}
}
