package net.zsoo.bnet.wow;

public class Dungeon extends SimpleID {

	private SimpleID map;
	private SimpleID zone;
	private DungeonKeystoneUpagrde[] keystone_upgrades;

	public SimpleID getMap() {
		return map;
	}

	public void setMap(SimpleID map) {
		this.map = map;
	}

	public SimpleID getZone() {
		return zone;
	}

	public void setZone(SimpleID zone) {
		this.zone = zone;
	}

	public DungeonKeystoneUpagrde[] getKeystone_upgrades() {
		return keystone_upgrades;
	}

	public void setKeystone_upgrades(DungeonKeystoneUpagrde[] keystone_upgrades) {
		this.keystone_upgrades = keystone_upgrades;
	}

}
