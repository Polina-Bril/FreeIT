package lesson3;

import java.util.Random;

public class Task14book {

//	Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 1;
		int min = 10;
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

		System.out.println("\nМаксимальная оценка " + max + " с индексом " + indexMax + ". Минимальная оценка " + min
				+ " с индексом " + indexMin);

	}

}
