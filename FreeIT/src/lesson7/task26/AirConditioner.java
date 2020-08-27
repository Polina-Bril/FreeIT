package lesson7.task26;

public class AirConditioner extends OfficeAppliances {

	private boolean climateControle;

	public AirConditioner(boolean climateControle) {
		super();
		this.climateControle = climateControle;
	}

	public boolean isClimateControle() {
		return climateControle;
	}

}
