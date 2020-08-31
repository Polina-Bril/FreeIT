package lesson7.interfaces.task3;

public class SpaceX implements IStart {

	public SpaceX() {
		super();
	}

	@Override
	public boolean checkBeforeStart() {
		System.out.println("Checking SpaceX before start");
		return (int) (Math.random() * 2) == 0;
	}

	@Override
	public void runEngine() {
		System.out.println("SpaceX's engines are running. All systems are OK!");
	}

	@Override
	public void start() {
		System.out.println("SpaceX start!");
	}
}
