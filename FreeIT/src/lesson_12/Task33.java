package lesson_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 **/

public class Task33 {

	public static void main(String[] args) throws IOException {
		int countWords = 0;
		int countMarks = 0;
		char[] marks = { ',', '.', '!', '?', ':', ';', '-' };
		File file = new File("FreeIT\\src\\lesson_12\\text.txt");
		try (Scanner forWords = new Scanner(file); FileReader forMarks = new FileReader(file)) {
			while (forWords.hasNext()) {
				countWords++;
				forWords.next();
			}
			int charFromFile = forMarks.read();
			while (charFromFile != -1) {
				for (char ch : marks) {
					if (ch == (char) charFromFile) {
						countMarks++;
					}
				}
				charFromFile = forMarks.read();
			}
			System.out.println("Количество слов в тексте = " + countWords + ". Количество знаков препинания в тексте = "
					+ countMarks);
		}
	}

}
