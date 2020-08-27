package lesson7.interfaces.task2;

import lesson7.interfaces.task2.jackets.*;
import lesson7.interfaces.task2.pants.*;
import lesson7.interfaces.task2.shoes.*;

public class Run {

	public static void main(String[] args) {

		Person sergei = new Person ("Sergei", new Coat(), new Tights(), new Sneakers());
		Person polina = new Person ("Polina", new Blazer(), new Trouthers(), new Sandals());
		sergei.putOffAll();
		polina.putOnAll();
	}

}
