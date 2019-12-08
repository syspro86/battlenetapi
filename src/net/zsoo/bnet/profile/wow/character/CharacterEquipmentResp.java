package net.zsoo.bnet.profile.wow.character;

import net.zsoo.bnet.wow.CharacterEquipmentItem;

public class CharacterEquipmentResp {
	private CharacterEquipmentItem[] equipped_items;

	public CharacterEquipmentItem[] getEquipped_items() {
		return equipped_items;
	}

	public void setEquipped_items(CharacterEquipmentItem[] equipped_items) {
		this.equipped_items = equipped_items;
	}
}
