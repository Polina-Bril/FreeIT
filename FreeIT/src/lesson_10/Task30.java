package lesson_10;

import java.util.HashSet;
import java.util.Set;

/*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.**/

public class Task30 {

	public static void main(String[] args) {
		Set<Integer> collection = new HashSet<>();
		for (int i = 1; i <= 100; i++) {
			collection.add((int)(Math.random() * 11));
		}
		System.out.println(collection);

	}

}
