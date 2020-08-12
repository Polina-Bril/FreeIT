package lesson5;

public class Task21nanoTime {

//	Напишите три цикла выполняющих многократное сложение строк, один с
//	помощью оператора сложения и String, другой с помощью StringBuilder и метода
//	append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

	public static void main(String[] args) {
		String s = "Напишите три цикла выполняющих многократное сложение строк. ";
		String s1 = "";

		long operatorStart = System.nanoTime();
		for (int i = 1; i < 100; i++) {
			s1 += s;
		}
		long operatorEnd = System.nanoTime();
		System.out.println(s1);
		long operatorTime = operatorEnd - operatorStart;
		System.out.println("Время работы оператора сложения (в наносекундах) = " + operatorTime);

		StringBuilder sb = new StringBuilder();
		long builderStart = System.nanoTime();
		for (int i = 1; i < 100; i++) {
			sb.append(s);
		}
		long builderEnd = System.nanoTime();
		System.out.println(sb);
		long builderTime = builderEnd - builderStart;
		System.out.println("Время работы StringBuilder (в наносекундах) = " + builderTime);

		StringBuffer sbf = new StringBuffer();
		long bufferStart = System.nanoTime();
		for (int i = 1; i < 100; i++) {
			sbf.append(s);
		}
		long bufferEnd = System.nanoTime();
		System.out.println(sbf);
		long bufferTime = bufferEnd - bufferStart;
		System.out.println("Время работы StringBuffer (в наносекундах) = " + bufferTime);

		System.out.println("StringBuffer быстрее оператора сложения на " + (operatorTime - bufferTime) + " наносекунд");
		System.out.println("StringBuffer быстрее StringBuilder на " + (builderTime - bufferTime) + " наносекунд");
	}

}
