package lesson7.interfaces.task3;

public class Shuttle implements IStart {

	public Shuttle() {
		super();
	}

	@Override
	public boolean checkBeforeStart() {
		System.out.println("Checking Shuttle before start");

		double rand = Math.random() * 10;
		return rand > 3;
	}

	@Override
	public void runEngine() {
		System.out.println("Shuttle's engines are running. All systems are OK!");
	}

	@Override
	public void start() {
		System.out.println("Shuttle start!");
	}
}
