package lesson_10;

import java.util.HashMap;
import java.util.Map;

/*Имеется текст. Следует составить для него частотный словарь.
 **/

public class Task32 {

	public static void main(String[] args) {
		String s = "Имеется текст. Следует составить для него частотный словарь.";
		char[] sToChar = s.toCharArray();
		Map<Character, Integer> dictionary = new HashMap<>();
		for (char ch : sToChar) {
			if (dictionary.containsKey(ch)) {
				dictionary.put(ch, dictionary.get(ch) + 1);
			} else {
				dictionary.put(ch, 1);
			}
		}
		System.out.println(dictionary);
	}
}
