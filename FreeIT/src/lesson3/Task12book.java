package lesson3;

public class Task12book {

//	Найдите сумму первых n целых чисел, которые делятся на 3.

	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				n++;
			}
			if (n == 3) {
				break;
			}
		}
		System.out.println(sum);
	}

}
