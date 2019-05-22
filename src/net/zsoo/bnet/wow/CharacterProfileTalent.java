package net.zsoo.bnet.wow;

public class CharacterProfileTalent {
	private boolean selected;
	// private HashMap[] talents;
	private Spec spec;
	private String calcTalent;
	private String calcSpec;

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Spec getSpec() {
		return spec;
	}

	public void setSpec(Spec spec) {
		this.spec = spec;
	}

	public String getCalcTalent() {
		return calcTalent;
	}

	public void setCalcTalent(String calcTalent) {
		this.calcTalent = calcTalent;
	}

	public String getCalcSpec() {
		return calcSpec;
	}

	public void setCalcSpec(String calcSpec) {
		this.calcSpec = calcSpec;
	}
}
