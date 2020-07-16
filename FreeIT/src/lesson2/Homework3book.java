package lesson2;
//Имеется 4500 секунд. Вывести на консоль:
//1. минут +секунд
//2. часов+п.1
//3. дней+п.2
//4. недель +п.3

public class Homework3book {

	public static void main(String[] args) {
	
		int s = 4500;
		int sec = s%60;
		int m = (s-sec)/60;
		int min = m%60;
		int h=(m-min)/60;
		int hours=h%24;
		int d=(h-hours)/24;
		int days = d%7;
		int w=(d-days)/7;
		
		System.out.println(min+" минут и "+sec+" секунд");
		System.out.println(hours+" часов, "+min+" минут и "+sec+" секунд");
		System.out.println(days+" дней, "+hours+" часов, "+min+" минут и "+sec+" секунд");
		System.out.println(w+" недель, "+days+" дней, "+hours+" часов, "+min+" минут и "+sec+" секунд");

	}

}
