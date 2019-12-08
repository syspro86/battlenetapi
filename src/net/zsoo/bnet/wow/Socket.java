package net.zsoo.bnet.wow;

public class Socket {
	private SimpleID socket_type;
	private SimpleID item;
	private String display_string;
	private SimpleID media;

	public SimpleID getSocket_type() {
		return socket_type;
	}

	public void setSocket_type(SimpleID socket_type) {
		this.socket_type = socket_type;
	}

	public SimpleID getItem() {
		return item;
	}

	public void setItem(SimpleID item) {
		this.item = item;
	}

	public String getDisplay_string() {
		return display_string;
	}

	public void setDisplay_string(String display_string) {
		this.display_string = display_string;
	}

	public SimpleID getMedia() {
		return media;
	}

	public void setMedia(SimpleID media) {
		this.media = media;
	}
}
