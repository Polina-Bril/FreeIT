package lesson3;

public class Task9book {

//	Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а 	произведение, т.е. факториал числа.

	public static void main(String[] args) {

		double factorial = 1;
		int x = (int) (Math.random() * 20);

		if (x != 0) {
			for (int i = 1; i <= x; i++) {
				factorial *= i;
			}
		} else {
			factorial = 0;
		}
		System.out.println("Факториал " + x + " равен " + factorial);
	}

}
