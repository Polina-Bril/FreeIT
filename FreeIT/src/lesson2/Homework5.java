package lesson2;

//ƒаны 3 целых числа. Ќайти количество положительных и отрицательныхчисел в исходном наборе.

public class Homework5 {

	public static void main(String[] args) {
		
		int a = 546;
		int b = 5;
		int c = -5;
		int n=0;
		int m=0;
		if (a>0) n++; else if (a<0) m++;
		if (b>0) n++; else if (b<0) m++;
		if (c>0) n++; else if (c<0) m++;
		System.out.println("положительных "+n+", отрицательных "+m);

	}

}
