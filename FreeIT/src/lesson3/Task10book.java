package lesson3;

public class Task10book {

//	Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

	public static void main(String[] args) {
		double factorial = 1;

		for (int x = 10; x <= 15; x++) {
			for (int i = 1; i <= x; i++) {
				factorial *= i;
			}
			System.out.println("Факториал " + x + " равен " + factorial);
		}

	}

}
