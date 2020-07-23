package lesson3;

//1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждыйдень он увеличивал дневную норму на 10% нормы 
//предыдущего дня. Какойсуммарный путь пробежит спортсмен за 7 дней?

public class Task1 {

	public static void main(String[] args) {
		float dayProbeg = 10f;
		float probeg = dayProbeg;
		for (int i = 2; i <= 7; i++) {
			dayProbeg *= 1.1;
			probeg += dayProbeg;
		}
		System.out.println(probeg);

	}

}
