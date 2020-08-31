package lesson7.task24;

/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
 */

public class Task24 {

	public static void main(String[] args) {
		TimeInterval one = new TimeInterval(1254);
		TimeInterval two = new TimeInterval(4, 8, 15);
		System.out.println(two.timeInSeconds());
		System.out.println(one.compareTo(two));
		one.printTime();

	}

}
