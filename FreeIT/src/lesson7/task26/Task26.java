package lesson7.task26;

/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
**/

public class Task26 {

	public static void main(String[] args) {
		Iron iron = new Iron(true);
		Teapot teapot = new Teapot(2);
		Ventilyator vent = new Ventilyator("Samsung");
		AirConditioner air = new AirConditioner(false);
		teapot.isOn();
		air.isOn();

	}

}
