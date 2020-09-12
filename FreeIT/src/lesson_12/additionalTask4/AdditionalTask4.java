package lesson_12.additionalTask4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
**/

public class AdditionalTask4 {

	public static void main(String[] args) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FreeIT\\src\\lesson_12\\additionalTask4\\Car.dat"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("FreeIT\\src\\lesson_12\\additionalTask4\\Car.dat"))) {
			Car car = new Car("Volvo", 280, 55500);
			out.writeObject(car);
			Car newCar = (Car) in.readObject();
			System.out.println(newCar.getSpeed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
