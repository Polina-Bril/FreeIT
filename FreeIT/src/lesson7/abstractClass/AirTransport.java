package lesson7.abstractClass;

public abstract class AirTransport extends Transport {

	private int wingspan;
	private int minRunwayLength;

	public AirTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
		super(power, maxSpeed, weight, brand);
		this.wingspan = wingspan;
		this.minRunwayLength = minRunwayLength;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public int getMinRunwayLength() {
		return minRunwayLength;
	}

	public void setMinRunwayLength(int minRunwayLength) {
		this.minRunwayLength = minRunwayLength;
	}

}
