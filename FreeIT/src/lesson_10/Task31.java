package lesson_10;

import java.util.ArrayList;
import java.util.Iterator;

/*Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
**/
public class Task31 {

	public static void main(String[] args) {
		ArrayList<Integer> estimation = new ArrayList<>();
		for (int i = 1; i < 30; i++) {
			estimation.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(estimation);
		Iterator<Integer> iterator = estimation.listIterator();
		int max = estimation.get(0);
		int n;
		while(iterator.hasNext()) {
		  n=iterator.next();
			if(n>=max) {
				max=n;
			}
			
		}
		System.out.println(max);
	}

}
