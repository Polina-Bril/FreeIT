package lesson5;

public class Task21 {

//	Напишите три цикла выполняющих многократное сложение строк, один с
//	помощью оператора сложения и String, другой с помощью StringBuilder и метода
//	append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

	public static void main(String[] args) {
		String s = "Напишите три цикла выполняющих многократное сложение строк. ";
		String s1 = "";

		long operatorStart = System.currentTimeMillis();
		for (int i = 1; i < 100; i++) {
			s1 += s;
		}
		long operatorEnd = System.currentTimeMillis();
		System.out.println(s1);
		System.out.println("Время работы оператора сложения (в миллисекундах) = " + (operatorEnd - operatorStart));

		StringBuilder sb = new StringBuilder();
		long builderStart = System.currentTimeMillis();
		for (int i = 1; i < 100; i++) {
			sb.append(s);
		}
		long builderEnd = System.currentTimeMillis();
		System.out.println(sb);
		System.out.println("Время работы StringBuilder (в миллисекундах) = " + (builderEnd - builderStart));

		StringBuffer sbf = new StringBuffer();
		long bufferStart = System.currentTimeMillis();
		for (int i = 1; i < 100; i++) {
			sbf.append(s);
		}
		long bufferEnd = System.currentTimeMillis();
		System.out.println(sbf);
		System.out.println("Время работы StringBuffer (в миллисекундах) = " + (bufferEnd - bufferStart));

	}

}
