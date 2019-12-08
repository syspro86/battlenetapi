package net.zsoo.bnet.profile.wow.character;

import net.zsoo.bnet.wow.SimpleID;

public class CharacterProfileResp {
	private int id;
	private String name;
	private SimpleID gender;
	private SimpleID faction;
	private SimpleID race;
	private SimpleID character_class;
	private SimpleID active_spec;
	private SimpleID realm;
	private SimpleID guild;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SimpleID getGender() {
		return gender;
	}

	public void setGender(SimpleID gender) {
		this.gender = gender;
	}

	public SimpleID getFaction() {
		return faction;
	}

	public void setFaction(SimpleID faction) {
		this.faction = faction;
	}

	public SimpleID getRace() {
		return race;
	}

	public void setRace(SimpleID race) {
		this.race = race;
	}

	public SimpleID getCharacter_class() {
		return character_class;
	}

	public void setCharacter_class(SimpleID character_class) {
		this.character_class = character_class;
	}

	public SimpleID getActive_spec() {
		return active_spec;
	}

	public void setActive_spec(SimpleID active_spec) {
		this.active_spec = active_spec;
	}

	public SimpleID getRealm() {
		return realm;
	}

	public void setRealm(SimpleID realm) {
		this.realm = realm;
	}

	public SimpleID getGuild() {
		return guild;
	}

	public void setGuild(SimpleID guild) {
		this.guild = guild;
	}
}
