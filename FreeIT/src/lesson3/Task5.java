package lesson3;

public class Task5 {

//	5)Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 
//	1 дюйм = 2,54 см

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println("В " + i + " дюйме " + 2.54 * i + " см");
		}

	}

}
