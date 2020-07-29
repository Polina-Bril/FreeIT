package lesson3;

import java.util.Random;

public class Task15book {

//	Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать 
//	(при переворачивании нежелательно создавать еще один массив).

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
