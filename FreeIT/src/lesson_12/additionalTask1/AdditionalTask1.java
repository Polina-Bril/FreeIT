package lesson_12.additionalTask1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
**/

public class AdditionalTask1 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> wordsList = new ArrayList<>();
		try (Scanner scan = new Scanner(new File("FreeIT\\src\\lesson_12\\additionalTask1\\Palindrom.txt"))) {
			while (scan.hasNext()) {
				String word = scan.next();
				wordsList.add(word);
			}
			for (String word : wordsList) {
				writeIfPalindrom(word);

			}
		}
	}

	private static String doViseVersa(String word) {
		char[] wordInCharViseVersa = new char[word.length()];
		int n = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			wordInCharViseVersa[n++] = word.toCharArray()[i];
		}
		return new String(wordInCharViseVersa);
	}

	public static void writeIfPalindrom(String word) throws IOException {
		try (BufferedWriter out = new BufferedWriter(new FileWriter("FreeIT\\src\\lesson_12\\additionalTask1\\PalindromOnly.txt", true))) {
			String wordViseVersa = doViseVersa(word);
			if (word.equals(wordViseVersa)&&word.length()>1) {
				out.write(word+"\n");
			}

		}
	}
}