package lesson3;

import java.util.Random;

public class Task13book {

//	Создать последовательность случайных чисел, найти и вывести наибольшее 	из них.

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = -1000000000;
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt();
			System.out.print(arr[i] + " ");
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("\nМаксимальное значение " + max);

	}

}
