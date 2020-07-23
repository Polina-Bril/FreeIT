package lesson3;

//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2 {

	public static void main(String[] args) {
		int kletki = 1;
		for (int i = 3; i <= 24; i += 3) {
			kletki *= 2;
			System.out.println(kletki);
		}
	}

}
