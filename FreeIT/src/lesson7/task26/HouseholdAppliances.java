package lesson7.task26;

public class HouseholdAppliances {

	private boolean isOn;

	public HouseholdAppliances() {
		super();
		this.isOn = false;
	}

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
	}

	public boolean isOn() {
		return isOn;
	}

}
