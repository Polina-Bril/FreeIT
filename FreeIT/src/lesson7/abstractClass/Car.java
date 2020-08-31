package lesson7.abstractClass;

public class Car extends LandTransport {

	private String bodyType;
	private int quantityPassengers;

	public Car(double power, int maxSpeed, int weight, String brand, int wheelsQuantity, int fuelConsumption,
			String bodyType, int quantityPassengers) {
		super(power, maxSpeed, weight, brand, wheelsQuantity, fuelConsumption);
		this.bodyType = bodyType;
		this.quantityPassengers = quantityPassengers;
	}

	@Override
	public String description() {
		return "Car Description: power in Horsepower= " + getPower() + " horsepower; power in KVatt = " + powerInKVatt()
				+ " KVatt; maximal speed = " + getMaxSpeed() + " km/h; weight = " + getWeight() + " kg; brand name = "
				+ getBrand() + "; quantity of wheels = " + getWheelsQuantity() + "; consumption of fuel = "
				+ getFuelConsumption() + " liters/100 km; car's bodytype = " + getBodyType()
				+ "; quantity of passengers = " + getQuantityPassengers();

	}

	public void countKmAndLitersOnMaxSpeed(double timeInHours) {
		double km = getMaxSpeed() * timeInHours;
		double liters = countLiters(km);
		System.out.println("Over the time = " + timeInHours + " hours, car " + getBrand() + " on maximal speed ("
				+ getMaxSpeed() + " km/h) will run " + km + " km and will consume " + liters + " liters of fuel");
	}

	private double countLiters(double distance) {
		return getFuelConsumption() * distance;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getQuantityPassengers() {
		return quantityPassengers;
	}

	public void setQuantityPassengers(int quantityPassengers) {
		this.quantityPassengers = quantityPassengers;
	}

}
