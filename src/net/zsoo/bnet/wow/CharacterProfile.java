package net.zsoo.bnet.wow;

public class CharacterProfile {
	private int id;
	private String name;
	private SimpleID gender;
	private SimpleID faction;
	private SimpleID race;
	private SimpleID character_class;
	private SimpleID active_spec;
	private SimpleID realm;
	private SimpleID guild;

	// equipment
	private CharacterEquipmentItem[] equipped_items;

	// specialization
	private SimpleID active_specialization;
	private CharacterSpecialization[] specializations;

	// media
	private String avatar_url;
	private String bust_url;
	private String render_url;

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

	public CharacterEquipmentItem[] getEquipped_items() {
		return equipped_items;
	}

	public void setEquipped_items(CharacterEquipmentItem[] equipped_items) {
		this.equipped_items = equipped_items;
	}

	public SimpleID getActive_specialization() {
		return active_specialization;
	}

	public void setActive_specialization(SimpleID active_specialization) {
		this.active_specialization = active_specialization;
	}

	public CharacterSpecialization[] getSpecializations() {
		return specializations;
	}

	public void setSpecializations(CharacterSpecialization[] specializations) {
		this.specializations = specializations;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getBust_url() {
		return bust_url;
	}

	public void setBust_url(String bust_url) {
		this.bust_url = bust_url;
	}

	public String getRender_url() {
		return render_url;
	}

	public void setRender_url(String render_url) {
		this.render_url = render_url;
	}
}
