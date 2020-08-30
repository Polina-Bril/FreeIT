package lesson_10;
/*
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.List;

public class Task29 {

	public static void main(String[] args) {
		ArrayList<Integer> estimation = new ArrayList<>();
		for (int i = 1; i < 30; i++) {
			estimation.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(estimation);
		for (int i = 0; i < estimation.size(); i++) {
			if (estimation.get(i) <= 3) {
				estimation.remove(i);
			}
		}
		System.out.println(estimation);

	}

}
