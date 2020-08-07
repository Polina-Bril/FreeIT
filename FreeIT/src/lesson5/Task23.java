package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {

//	Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//	которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//			абзацев <p>.

	public static void main(String[] args) {
		String s = "lj 0x9BAD <p id=\"p1\"> gjdlleri <p idiol> 0x7FFF fviridkk";
		System.out.println(s.replaceAll("<p .*?>", "<p>"));

	}

}
