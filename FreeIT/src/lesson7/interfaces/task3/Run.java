package lesson7.interfaces.task3;

public class Run {

	public static void main(String[] args) {

		Cosmodrome nlo = new Cosmodrome();
		nlo.launch(new Shuttle());
		nlo.launch(new SpaceX());

	}

}
