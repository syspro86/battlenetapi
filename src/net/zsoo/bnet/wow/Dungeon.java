package net.zsoo.bnet.wow;

public class Dungeon extends IdAndName {

	private IdAndName map;
	private Slug zone;
	private DungeonKeystoneUpagrde[] keystone_upgrades;

	public IdAndName getMap() {
		return map;
	}

	public void setMap(IdAndName map) {
		this.map = map;
	}

	public Slug getZone() {
		return zone;
	}

	public void setZone(Slug zone) {
		this.zone = zone;
	}

	public DungeonKeystoneUpagrde[] getKeystone_upgrades() {
		return keystone_upgrades;
	}

	public void setKeystone_upgrades(DungeonKeystoneUpagrde[] keystone_upgrades) {
		this.keystone_upgrades = keystone_upgrades;
	}

}
