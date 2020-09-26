package lesson_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Application {

	private Library libr;
	private boolean exitApplication;

	public Application(Library lib) {
		libr = lib;
	}

	public void start() {
		do {
			menu();
		} while (!exitApplication);
	}

	private void menu() {
		System.out.println(
				"Выберите действие (введите число, соответствующее действию): \n1. Вывод всех книг.\n2. Добавление книги.\n3. Удаление книги.\n4. Редактирование книги.\n5. Выход.");
		Integer choice = inputFromConcole();

		switch (choice) {
		case 1:
			printAllBooks();
			break;
		case 2:
			addingBook();
			break;
		case 3:
			deletingBook();
			break;
		case 4:
			correctingBook();
			break;
		case 5:
			System.out.println("До свиданья!");
			exitApplication = true;
			break;
		default:
			System.out.println("Число введено неверно. Попробуйте еще раз!");
		}

	}

	private void printAllBooks() {
		if (libr.getBooks() == null) {
			System.out.println("В библиотеке нет книг. Нечего выводить!");
		} else {
			boolean exitPrinting = false;
			do {
				System.out.println(
						"Выберите желаемую сортировку при выводе (введите число, соответствующее желаемой сортировке): \n1. По алфавиту по названию книги.\n2. По добавлению(сначала новые, потом более старые).\n3. По добавлению(сначала старые, потом новые).");
				Integer choice = inputFromConcole();

				switch (choice) {
				case 1:
					sort1();
					System.out.println("Вывод книг прошел успешно!");
					exitPrinting = true;
					break;
				case 2:
					sort2();
					System.out.println("Вывод книг прошел успешно!");
					exitPrinting = true;
					break;
				case 3:
					sort3();
					System.out.println(libr.getAll());
					System.out.println("Вывод книг прошел успешно!");
					exitPrinting = true;
					break;
				default:
					System.out.println("Число введено неверно. Необходимо ввести 1 или 2 или 3. Попробуйте еще раз!");
					exitPrinting = false;
				}
			} while (!exitPrinting);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sort1() {
		List<Book> a = libr.getAll();
		a.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				String s1 = b1.getTitle();
				return s1.compareTo(b2.getTitle());
			}
		});
		System.out.println(a);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sort3() {
		List<Book> a = libr.getAll();
		a.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				return Integer.compare(b1.getId(), b2.getId());
			}
		});
	}

	private void sort2() {
		ArrayList<Book> b1 = new ArrayList<>();
		sort3();
		b1.add(libr.getBooks().get(libr.getBooks().size() - 1));
		ListIterator<Book> iter1 = libr.getBooks().listIterator(libr.getBooks().size() - 1);
		while (iter1.hasPrevious()) {
			b1.add(iter1.previous());
		}
		System.out.println(b1);
	}

	private void addingBook() {
		System.out.println("Сейчас будем вводить данные для создания новой книги.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название книги");
		String name = sc.nextLine();
		ListIterator<Book> iter = libr.getBooks().listIterator();
		while (iter.hasNext()) {
			Book b = iter.next();
			if (b.getTitle().equals(name)) {
				System.out.println("В библиотеке уже есть книга с таким названием. Поменяйте название!");
				return;
			}
		}

		System.out.println("Введите жанр книги");
		String genre = sc.nextLine();
		Book book = new Book(name, genre);
		libr.addBook(book);
		System.out.println("Книга успешно добавлена в библиотеку!");

	}

	private void deletingBook() {
		if (libr.getBooks() == null) {
			System.out.println("В библиотеке нет книг. Нечего удалять!");
		} else {
			Integer id = 1;
			do {
				System.out.println("Введите id (целое число) книги, которую надо удалить");
				id = inputFromConcole();
			} while (id == null);
			int count = 0;
			ListIterator<Book> iter = libr.getBooks().listIterator();
			while (iter.hasNext()) {
				Book b = iter.next();
				if (b.getId() == id) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("В библиотеке нет книги с таким id. Нечего удалять!");
			} else {
				libr.delBook(id);
				System.out.println("Книга успешно удалена из библиотеки!");
			}
		}
	}

	private void correctingBook() {
		if (libr.getBooks() == null) {
			System.out.println("В библиотеке нет книг. Нечего редактировать!");
		} else {
			System.out.println("Сейчас будем вводить данные для корректировки книги.");

			Integer id = 1;
			do {
				System.out.println("Введите id (целое число):");
				id = inputFromConcole();
			} while (id == null);

			int count = 0;
			ListIterator<Book> iter = libr.getBooks().listIterator();
			while (iter.hasNext()) {
				Book b = iter.next();
				if (b.getId() == id) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("В библиотеке нет книги с таким id. Нечего редактировать!");
			} else {
				Scanner sc = new Scanner(System.in);
				System.out.println("Введите название книги");
				String name = sc.nextLine();
				System.out.println("Введите жанр книги");
				String genre = sc.nextLine();
				Book book = new Book(name, genre);
				book.setId(id);
				libr.correctBook(book);
				int counForIdBecameAdecvate = Book.getCountForId() - 1;
				Book.setCountForId(counForIdBecameAdecvate);
				System.out.println("Книга успешно отредактирована!");
			}
		}
	}

	private Integer inputFromConcole() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			choice = sc.nextInt();
			return choice;
		} catch (InputMismatchException e) {
			System.out.println("Вы должны ввести число! Попробуйте еще раз!");
			return null;
		}
	}
}
