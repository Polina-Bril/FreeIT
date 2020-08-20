package lesson5;

public class Task18 {

//	Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//	общее их количество.

	public static void main(String[] args) {
		String str = " Строковый? литерал...  это! - последовательность; символов, заключенных: в (двойные) \"кавычки\". ";
		double n = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ',' || symbol == '.' || symbol == '-' || symbol == ':' || symbol == ';' || symbol == '!'
					|| symbol == '?') {
				n++;
			}
			if (symbol == '"' || symbol == '(' || symbol == ')') {
				n = n + 0.5;
			}
			if (str.charAt(i) == '.' && str.charAt(i - 1) == '.' && str.charAt(i - 2) == '.') {
				n -= 2;
			}
		}
		System.out.println("У нас есть " + n + " знаков препинания");

	}

}
