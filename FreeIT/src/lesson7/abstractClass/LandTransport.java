package lesson7.abstractClass;

public abstract class LandTransport extends Transport {

	private int wheelsQuantity;
	private int fuelConsumption;
	
	
	public LandTransport(double power, int maxSpeed, int weight, String brand, int wheelsQuantity,
			int fuelConsumption) {
		super(power, maxSpeed, weight, brand);
		this.wheelsQuantity = wheelsQuantity;
		this.fuelConsumption = fuelConsumption;
	}

	public int getWheelsQuantity() {
		return wheelsQuantity;
	}

	public void setWheelsQuantity(int wheelsQuantity) {
		this.wheelsQuantity = wheelsQuantity;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

}
