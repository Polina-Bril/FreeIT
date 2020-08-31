package lesson7.abstractClass;

public class Truck extends LandTransport {

	private double capacity;

	public Truck(double power, int maxSpeed, int weight, String brand, int wheelsQuantity, int fuelConsumption,
			double capacity) {
		super(power, maxSpeed, weight, brand, wheelsQuantity, fuelConsumption);
		this.capacity = capacity;
	}

	@Override
	public String description() {
		return "Truck Description: power in Horsepower= " + getPower() + " horsepower; power in KVatt = "
				+ powerInKVatt() + " KVatt; maximal speed = " + getMaxSpeed() + " km/h; weight = " + getWeight()
				+ " kg; brand name = " + getBrand() + "; quantity of wheels = " + getWheelsQuantity()
				+ "; consumption of fuel = " + getFuelConsumption() + " liters/100 km; maximal cargo capacity = "
				+ getCapacity() + " tons";
	}

	public void checkCapacity(double cargoWeightInTons) {
		if (capacity >= cargoWeightInTons) {
			System.out.println("Truck loaded");
			capacity -= cargoWeightInTons;
		} else {
			System.out.println("You need a bigger truck");
		}
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
