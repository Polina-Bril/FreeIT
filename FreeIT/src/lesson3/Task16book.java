package lesson3;

import java.util.Random;

public class Task16book {

//	Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.

	public static void main(String[] args) {
		int[] arr = new int[20];
		int max = 1;
		int min = 10;
		int sum = 0;
		int indexMax = 0;
		int indexMin = 0;
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
		}
		if (indexMin < indexMax) {
			for (int i = indexMin + 1; i < indexMax; i++) {
				sum += arr[i];
			}
		} else {
			for (int i = indexMax + 1; i < indexMin; i++) {
				sum += arr[i];
			}
		}
		System.out.println("\nМаксимальная оценка " + max + " с индексом " + indexMax + ". Минимальная оценка " + min
				+ " с индексом " + indexMin);
		System.out.println("Сумма чисел между ними = "+sum);

	}

}
