package lesson3;

import java.util.Random;

public class Task8book {

//	Имеется целове число (задать с помощью Random rand = new Random(); int x =rand.nextInt() ). Это число – 
//	количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.

	public static void main(String[] args) {

		Random rand = new Random();
		int x = Math.abs(rand.nextInt());
		if ((x % 10) > 1 && x % 10 <= 4 && x % 100 != 12 && x % 100 != 13 && x % 100 != 14) {
			System.out.println(x + " рубля");
		} else if (x % 10 == 1 && x % 100 != 11) {
			System.out.println(x + " рубль");
		} else {
			System.out.println(x + " рублей");
		}

	}

}
