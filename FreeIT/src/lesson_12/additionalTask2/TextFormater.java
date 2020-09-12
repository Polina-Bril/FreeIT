package lesson_12.additionalTask2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
 Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
**/
public class TextFormater {

	public static void main(String[] args) throws IOException {
		File file = new File("FreeIT\\src\\lesson_12\\additionalTask2\\text2.txt");
		try (BufferedReader fileRead = new BufferedReader(new FileReader(file));BufferedWriter out = new BufferedWriter(new FileWriter("FreeIT\\src\\lesson_12\\additionalTask2\\text2_copy.txt", true))) {
			String str = fileRead.readLine();
			StringBuilder sb = new StringBuilder("");
			while (str != null) {
				sb.append(str);
				str=fileRead.readLine();
			}
			String text = sb.toString();
			String[] sentences = text.split("[\\.\\!\\?]");
			for (String s : sentences) {
				if(isPalindromConsist(s)||(quantityOfWords(s)>=3&&quantityOfWords(s)<=5)){
				out.write(s+".\n");
				}
			}
		}
	}

	public static int quantityOfWords(String sentence) throws FileNotFoundException {
		int countWords = 0;
		try (Scanner forWords = new Scanner(sentence)) {
			while (forWords.hasNext()) {
				countWords++;
				forWords.next();
			}
			return countWords;
		}

	}

	public static boolean isPalindromConsist(String sentence) throws FileNotFoundException {
		Scanner sc = new Scanner(sentence);
		while (sc.hasNext()) {
			String word = sc.next();
			char[] wordInCharViseVersa = new char[word.length()];
			int n = 0;
			for (int i = word.length() - 1; i >= 0; i--) {
				wordInCharViseVersa[n++] = word.toCharArray()[i];
			}
			if (word.equals(new String(wordInCharViseVersa))&&word.length()>1) {
				return true;
			}
		}
		;
		return false;
	}
}