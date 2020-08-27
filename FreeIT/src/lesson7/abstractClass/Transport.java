package lesson7.abstractClass;

public abstract class Transport {

	private double power;
	private int maxSpeed;
	private int weight;
	private String brand;

	public Transport(double power, int maxSpeed, int weight, String brand) {
		super();
		this.power = power;
		this.maxSpeed = maxSpeed;
		this.weight = weight;
		this.brand = brand;
	}

	public abstract String description();

	public double powerInKVatt() {
		return power * 0.74;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
