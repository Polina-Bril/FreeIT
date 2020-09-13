package lesson_12;

import java.io.File;

/*
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */
public class Task36 {

	public static void main(String[] args) {

		File srcDirectory = new File("FreeIT\\src");
		checkDirectory(directoryOrNot(srcDirectory));
	}

	public static void checkDirectory(File[] files) {
		if (files != null) {
			for (File f : files) {
				directoryOrNot(f);
			}
		}
	}

	public static File[] directoryOrNot(File file) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				if (f.isDirectory()) {
					System.out.println("Папка " + f.getName() + ":");
					checkDirectory(directoryOrNot(f));
				}
			}

			return file.listFiles();
		} else {
			System.out.println("---Файл: " + file.getName());
			return null;
		}
	}
}