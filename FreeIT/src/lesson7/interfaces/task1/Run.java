package lesson7.interfaces.task1;

import lesson7.interfaces.task1.hands.*;
import lesson7.interfaces.task1.heads.*;
import lesson7.interfaces.task1.legs.*;

/*
 * Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand,
 * ILeg) Класс SonyHead является примером реализацией головы от Sony. Создайте 3
 * робота с разными комплектующими. Например у робота голова и нога от Sony а,
 * рука от Samsung. У всех роботов вызовите метод action. Среди 3-х роботов
 * найдите самого дорогого.
 */
public class Run {

	public static void main(String[] args) {

		Robot one = new Robot(new SonyHead(1), new SamsungHand(7), new SonyLeg(9));
		Robot two = new Robot(new SamsungHead(5), new ToshibaHand(11), new ToshibaLeg(8));
		Robot three = new Robot(new ToshibaHead(2), new SonyHand(9), new SamsungLeg(7));
		one.action();
		two.action();
		three.action();
		if (one.getPrice() > two.getPrice()) {
			if (one.getPrice() > three.getPrice()) {
				System.out.println("Robot one is the most expensive. His price is " + one.getPrice());
			} else {
				System.out.println("Robot three is the most expensive. His price is " + three.getPrice());
			}
		} else if (two.getPrice() > three.getPrice()) {
			System.out.println("Robot two is the most expensive. His price is " + two.getPrice());
		} else {
			System.out.println("Robot three is the most expensive. His price is " + three.getPrice());

		}

	}
}