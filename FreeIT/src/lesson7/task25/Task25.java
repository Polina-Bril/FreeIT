package lesson7.task25;

/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 **/

public class Task25 {

	public static void main(String[] args) {
		ATM atm = new ATM(8, 5, 2);
		System.out.println(atm.withdrawMoney(1060));
		System.out.println("Kolichestvo kupyur v ATM nominalov 100 = "+atm.getQuantityOf100());
		System.out.println("Kolichestvo kupyur v ATM nominalov 50 = "+atm.getQuantityOf50());
		System.out.println("Kolichestvo kupyur v ATM nominalov 20 = "+atm.getQuantityOf20());

	}

}
