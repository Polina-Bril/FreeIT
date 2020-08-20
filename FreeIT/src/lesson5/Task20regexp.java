package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20regexp {
	
//	Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
	
	public static void main(String[] args) {

		String s = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
		Pattern p = Pattern.compile("[a-zA-Zа-яА-я]+");
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.print(s.substring(m.end() - 1, m.end()));
		}
	}
}