package lesson3;

public class Task4 {

//	4)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

	public static void main(String[] args) {

		int a = 15;
		int b = 10;
		int proizvedenie = 0;

		for (int i = 1; i <= b; i++) {
			proizvedenie += a;
		}
		System.out.println(proizvedenie);

	}

}
