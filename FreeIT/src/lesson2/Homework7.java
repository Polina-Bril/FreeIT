package lesson2;

// ¬ переменную записываете количество программистов. ¬ зависимости от количества программистов 
//необходимо вывести правильно окончание. Ќапр.: Х 2 программиста Х 1 программист Х 10 программистов Х и т.д.

public class Homework7 {

	public static void main(String[] args) {
		
		int n=9;
		if (n%10==1&&n!=11)
			System.out.println(n+" программист");
		else if(n%10>=2&&n%10<=4&&n!=11&&n!=13&&n!=14)
			System.out.println(n+" программиста");
		else 
			System.out.println(n+" программистов");

	}

}
