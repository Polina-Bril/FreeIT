package lesson7.abstractClass;

public class CivilAirTransport extends AirTransport {

	private int quantityPassengers;
	private boolean isBusinessClassAvailable;

	public CivilAirTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength,
			int quantityPassengers, boolean isBusinessClassAvailable) {
		super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
		this.quantityPassengers = quantityPassengers;
		this.isBusinessClassAvailable = isBusinessClassAvailable;
	}

	@Override
	public String description() {
		return "CivilAirTransport Description: power in Horsepower= " + getPower() + " horsepower; power in KVatt = "
				+ powerInKVatt() + " KVatt; maximal speed = " + getMaxSpeed() + " km/h; weight = " + getWeight()
				+ " kg; brand name = " + getBrand() + "; wingspan = " + getWingspan()
				+ " meters; minimal runway length = " + getMinRunwayLength()
				+ " meters; the availability of BusinessClass = " + isBusinessClassAvailable()
				+ "; quantity of passengers = " + getQuantityPassengers();
	}

	public void checkCapacity(int quantityOfPeople) {
		if (quantityPassengers >= quantityOfPeople) {
			System.out.println("All people seated");
			quantityPassengers -= quantityOfPeople;
		} else {
			System.out.println("You need a bigger plane");
		}
	}

	public int getQuantityPassengers() {
		return quantityPassengers;
	}

	public void setQuantityPassengers(int quantityPassengers) {
		this.quantityPassengers = quantityPassengers;
	}

	public boolean isBusinessClassAvailable() {
		return isBusinessClassAvailable;
	}

	public void setBusinessClassAvailable(boolean isBusinessClassAvailable) {
		this.isBusinessClassAvailable = isBusinessClassAvailable;
	}

}
