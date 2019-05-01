package net.zsoo.bnet.wow;

import com.google.gson.Gson;

public class IdAndSlug extends Slug {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
