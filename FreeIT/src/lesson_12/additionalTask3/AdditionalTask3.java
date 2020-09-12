package lesson_12.additionalTask3;
/*
 Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask3 {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner forWords = new Scanner(new File("FreeIT\\src\\lesson_12\\additionalTask3\\text3.txt"));
				Scanner forBlackList = new Scanner(new File("FreeIT\\src\\lesson_12\\additionalTask3\\blackList.txt"))) {
			ArrayList<String> blackList = new ArrayList<>();
			while (forBlackList.hasNext()) {
				blackList.add(forBlackList.next());
			}
			StringBuilder sb = new StringBuilder("");
			while (forWords.hasNextLine()) {
				sb.append(forWords.nextLine());
			}
			String text = sb.toString();
			String[] sentences = text.split("[\\.\\!\\?]");
			ArrayList<String> wordsInSentence = new ArrayList<>();
			int n = 0;
			boolean flag = false;
			for (String s : sentences) {
				wordsInSentence.clear();
				Scanner wordFromSentence = new Scanner(s);
				while (wordFromSentence.hasNext()) {
					wordsInSentence.add(wordFromSentence.next());
				}
				for (String word : wordsInSentence) {
					if (blackList.contains(word)) {
						flag = true;
						n++;
						System.out.println(s+".");
					}
				}
			wordFromSentence.close();
			}
			if (!flag) {
				System.out.println("Tекст прошёл проверку на цензуру");
			} else {
				System.out.println("Вышеуказанные " + n + " предложений не прошли проверку на цензуру и подлежат исправлению!");
			}
		}
	}
}
