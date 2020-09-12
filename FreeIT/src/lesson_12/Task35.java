package lesson_12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/*
  Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
**/

public class Task35 {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("FreeIT\\src\\lesson_12\\hello.dat")));
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			out.writeInt(rand.nextInt(100));
		}
		out.close();

		DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream("FreeIT\\src\\lesson_12\\hello.dat")));
		double sum = 0;
		int count = 0;
		int res = in.readInt();
		while (true) {
			sum += res;
			count++;
			System.out.print(res + " ");
			try {
				res = in.readInt();
			} catch (EOFException e) {
				break;
			}
		}
		in.close();
		System.out.println("\n"+sum / count);
	}
}
