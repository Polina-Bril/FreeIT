package lesson_12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
**/
public class Task34 {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		ArrayList<Character> textToCharList = new ArrayList<>();
		try (FileReader fileReader = new FileReader(new File("FreeIT\\src\\lesson_12\\text.txt"))) {
			int charFromFile = fileReader.read();
			while (charFromFile != -1) {
				textToCharList.add((char) charFromFile);
				charFromFile = fileReader.read();
			}
			int chislo = -1;
			Set<Integer> withoutDoubles = new LinkedHashSet<>();
			for (int i = 0; i < textToCharList.size(); i++) {
				if (Character.isDigit(textToCharList.get(i)) && chislo == -1) {
					chislo = Character.getNumericValue(textToCharList.get(i));
				} else if (Character.isDigit(textToCharList.get(i)) && chislo != -1) {
					chislo = chislo * 10 + Character.getNumericValue(textToCharList.get(i));
				} else if (chislo != -1) {
					sum += chislo;
					System.out.print(chislo + " ");
					withoutDoubles.add(chislo);
					chislo = -1;
				}
			}
			System.out.println("\nСумма всех чисел в файле = " + sum);
			System.out.println("Числа без повторов: " + withoutDoubles);
		}
	}
}
