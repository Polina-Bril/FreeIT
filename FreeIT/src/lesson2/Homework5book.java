package lesson2;

//Дано натуральное 4значное число. Верно ли, что все цифры числа различны?

public class Homework5book {

	public static void main(String[] args) {
		
		int n = 1994;
		if ((n/1000)%10==(n/100)%10||(n/1000)%10==(n/10)%10||(n/1000)%10==n%10||(n/100)%10==(n/10)%10||(n/100)%10==n%10||(n/10)%10==n%10)
			System.out.println("В числе есть одинаковые цифры");
		else
			System.out.println("Все цифры числа различны");

	}

}
