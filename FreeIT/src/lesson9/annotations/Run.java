package lesson9.annotations;

import java.lang.reflect.*;

/*Написать программу, которая будет анализировать присутствие аннотации над классом MyService и 
если она присутствует - создавать экземпляр этого класса, задавать значения его полям и вызывать 
метод thisClassInfo (использовать возможности пакета reflection).
**/
public class Run {

	public static void main(String[] args) throws SecurityException, ReflectiveOperationException {

		inspection(MyService.class);
	}

	public static void inspection(Class<?> cls) throws ReflectiveOperationException, SecurityException {
		if (cls.isAnnotationPresent(Version.class)) {
			MyService myS = new MyService("Changing keyboard", 70);
			Method m = MyService.class.getDeclaredMethod("thisClassInfo");
			m.setAccessible(true);
			m.invoke(myS);
		}
	}
}
