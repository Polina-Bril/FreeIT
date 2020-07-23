package lesson3;

public class Task7book {

//	Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//	полностью закрыть круглой картонкой радиусом r.

	public static void main(String[] args) {
		double a = 5;
		int b = 7;
		int r = 7;
		if (2 * r >= Math.sqrt(a * a + b * b))
			System.out.println("Можно");
		else
			System.out.println("Нельзя");

	}

}
