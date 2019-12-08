package net.zsoo.bnet.wow;

import com.google.gson.Gson;

public class Href {

	private String href;
	
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
