package lesson3;

public class Task11book {

//	Имеется целое число, определить является ли это число простым, т.е.	делится без остатка только на 1 и себя.

	public static void main(String[] args) {
		int x = 4;
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Число не простое");
		} else {
			System.out.println("Число простое");
		}

	}

}
