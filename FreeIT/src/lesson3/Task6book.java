package lesson3;

public class Task6book {

//	Создайте число. Определите, является ли число трехзначным. Определите, является
//	ли его последняя цифра семеркой. Определите, является ли число четным.

	public static void main(String[] args) {

		int x = 580;
		if (x / 100 >= 1 && x / 100 <= 9) {
			System.out.println("Число трехзначное");
		} else {
			System.out.println("Число нетрехзначное");
		}
		if (x % 10 == 7) {
			System.out.println("Число оканчивается на 7");
		} else {
			System.out.println("Число не оканчивается на 7");
		}
		if (x % 2 == 0) {
			System.out.println("Число четное");
		} else {
			System.out.println("Число нечетное");
		}
	}

}
