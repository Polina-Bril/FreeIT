package lesson7.interfaces.task3;

public class Cosmodrome {

	public Cosmodrome() {
		super();
	}

	public void launch(IStart st) {
		if (st.checkBeforeStart()) {
			st.runEngine();
			for (int i = 10; i >= 0; i--) {
				System.out.println(i);
			}
			st.start();
		} else {
			System.out.println("Check before start failed!");
		}
	}

}
