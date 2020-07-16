package lesson2;

//Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то 
//вычесть из него 2. Если нулевым, то заменить его на10. Вывести полученное число

public class Homework3 {

	public static void main(String[] args) {
		int n=0;
		if (n>0) 
			n+=1;
		else if (n<0)
			n-=2;
		else
			n=10;
		System.out.println(n);
	}

}
