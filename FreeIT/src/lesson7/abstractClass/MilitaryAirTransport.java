package lesson7.abstractClass;

public class MilitaryAirTransport extends AirTransport {

	private boolean isEjectionPossible;
	private int missileQuantity;

	public MilitaryAirTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength,
			boolean isEjectionPossible, int missileQuantity) {
		super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
		this.isEjectionPossible = isEjectionPossible;
		this.missileQuantity = missileQuantity;
	}

	@Override
	public String description() {
		return "MilitaryAirTransport Description: power in Horsepower= " + getPower() + " horsepower; power in KVatt = "
				+ powerInKVatt() + " KVatt; maximal speed = " + getMaxSpeed() + " km/h; weight = " + getWeight()
				+ " kg; brand name = " + getBrand() + "; wingspan = " + getWingspan()
				+ " meters; minimal runway length = " + getMinRunwayLength() + " meters; the possibility of ejection = "
				+ isEjectionPossible() + "; quantity of missile = " + getMissileQuantity();
	}

	public void shot() {
		if (missileQuantity > 0) {
			System.out.println("The missile went!");
			missileQuantity--;
		} else {
			System.out.println("No ammunition!");
		}
	}

	public void ejection() {
		if (isEjectionPossible) {
			System.out.println("The ejection was successful");
		} else {
			System.out.println("You don't have such a system");
		}
	}

	public boolean isEjectionPossible() {
		return isEjectionPossible;
	}

	public void setEjectionPossible(boolean isEjectionPossible) {
		this.isEjectionPossible = isEjectionPossible;
	}

	public int getMissileQuantity() {
		return missileQuantity;
	}

	public void setMissileQuantity(int missileQuantity) {
		this.missileQuantity = missileQuantity;
	}

}
