package lesson7.task27;

/*Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 **/

public class Task27 {

	public static void main(String[] args) {
		Visa visa = new Visa();
		Maestro maestro = new Maestro();
		GoldCard gold = new GoldCard();
		PlatinumCard plat = new PlatinumCard();
		visa.getExpireDate();
		maestro.getPercent();
		gold.isPriorityPass();
		plat.getLimitPerDay();

	}

}
