package lesson5;

public class Task20 {

//	Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

	public static void main(String[] args) {
		String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
		char symbol, symbolPrev;
		for (int i = 1; i < str.length(); i++) {
			symbol = str.charAt(i);
			symbolPrev = str.charAt(i - 1);
			if (symbol == ',' || symbol == '.' || symbol == ':' || symbol == ';' || symbol == '!' || symbol == '?'
					|| symbol == ' ' || symbol == ')' || symbol == '"') {
				if ((symbol == ' ' || symbol == ')' || symbol == '"' || symbol == '.' || symbol == '-')
						&& (symbolPrev == ' ' || symbolPrev == ',' || symbolPrev == '.' || symbolPrev == ':'
								|| symbolPrev == ';' || symbolPrev == '!' || symbolPrev == '?' || symbolPrev == ')'
								|| symbol == '"' || symbolPrev == '-')) {
					continue;
				}
				System.out.print(symbolPrev);
			}
		}
	}

}
