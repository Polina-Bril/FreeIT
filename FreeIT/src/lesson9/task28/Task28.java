package lesson9.task28;
/*		Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
**/

public class Task28 {

	public static void main(String[] args) {

		Integer[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] str = { "Hello", "How are u", "What's your name" };
		ArrayBox<Integer> box1 = new ArrayBox<>(ints);
		ArrayBox<String> box2 = new ArrayBox<>(str);
		System.out.println(box1.get(5));
		System.out.println(box2.get(2));
		System.out.println(box2);

	}

}
