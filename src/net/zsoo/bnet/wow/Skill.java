package net.zsoo.bnet.wow;

public class Skill {
	private SimpleID profession;
	private int level;
	private String display_string;

	public SimpleID getProfession() {
		return profession;
	}

	public void setProfession(SimpleID profession) {
		this.profession = profession;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDisplay_string() {
		return display_string;
	}

	public void setDisplay_string(String display_string) {
		this.display_string = display_string;
	}
}
