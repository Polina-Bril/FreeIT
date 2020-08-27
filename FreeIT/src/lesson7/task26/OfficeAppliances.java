package lesson7.task26;

public class OfficeAppliances extends HouseholdAppliances {

	private int weight;
	private int size;

	public OfficeAppliances() {
		super();
	}

	public OfficeAppliances(int weight, int size) {
		super();
		this.weight = weight;
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
