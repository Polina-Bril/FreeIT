package lesson2;
//������� 4500 ������. ������� �� �������:
//1. ����� +������
//2. �����+�.1
//3. ����+�.2
//4. ������ +�.3

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
		
		System.out.println(min+" ����� � "+sec+" ������");
		System.out.println(hours+" �����, "+min+" ����� � "+sec+" ������");
		System.out.println(days+" ����, "+hours+" �����, "+min+" ����� � "+sec+" ������");
		System.out.println(w+" ������, "+days+" ����, "+hours+" �����, "+min+" ����� � "+sec+" ������");

	}

}
