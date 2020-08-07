package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {

//	Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//	записаных по правилам Java, с помощью регулярных выражений и вывести их на
//	страницу.

	public static void main(String[] args) {
		String s = "lj 0x9BAD gjdlleri 0x7FFF fviridkk";
		Pattern p = Pattern.compile("0x[0-9A-Fa-f]{1,4}");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}

	}

}
