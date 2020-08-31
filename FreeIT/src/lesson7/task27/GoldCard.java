package lesson7.task27;

public class GoldCard extends DebetCard {

	private boolean isPriorityPass;

	public GoldCard() {
		super();
	}

	public GoldCard(boolean isPriorityPass) {
		super();
		this.isPriorityPass = isPriorityPass;
	}

	public boolean isPriorityPass() {
		return isPriorityPass;
	}

	public void setPriorityPass(boolean isPriorityPass) {
		this.isPriorityPass = isPriorityPass;
	}

}
