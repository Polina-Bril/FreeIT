package lesson7.task26;

public class HomeAppliances extends HouseholdAppliances {

	private int energyConsumed;
	private int noiseLevel;
	private String color;

	public HomeAppliances() {
		super();
	}

	public HomeAppliances(int energyConsumed, int noiseLevel, String color) {
		super();
		this.energyConsumed = energyConsumed;
		this.noiseLevel = noiseLevel;
		this.color = color;
	}

	public int getEnergyConsumed() {
		return energyConsumed;
	}

	public void setEnergyConsumed(int energyConsumed) {
		this.energyConsumed = energyConsumed;
	}

	public int getNoiseLevel() {
		return noiseLevel;
	}

	public void setNoiseLevel(int noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
