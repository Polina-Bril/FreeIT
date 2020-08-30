package lesson_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Application {

	private Library libr;

	public Application() {
		super();
		ArrayList<Book> book = new ArrayList<>();
		Book book1 = new Book(123, "Atlant", "Roman");
		Book book2 = new Book(345, "Puaro", "Detective");
		Book book3 = new Book(567, "NLO", "Fantasy");
		book.add(book1);
		book.add(book2);
		book.add(book3);
		Library lib = new Library(book);
		libr = lib;
	}

	public void start() {
		menu();
	}

	private void menu() {
		System.out.println(
				"Выберите действие (введите число, соответствующее действию): \n1. Вывод всех книг.\n2. Добавление книги.\n3. Удаление книги.\n4. Редактирование книги.\n5. Выход.");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Вы должны ввести число! Попробуйте еще раз!");
			menu();
			return;
		}
		switch (choice) {
		case 1:
			printAllBooks();
			menu();
			break;
		case 2:
			addingBook();
			menu();
			break;
		case 3:
			deletingBook();
			menu();
			break;
		case 4:
			correctingBook();
			menu();
			break;
		case 5:
			System.out.println("До свиданья!");
			break;
		default:
			System.out.println("Число введено неверно. Попробуйте еще раз!");
			menu();
		}

	}

	private void printAllBooks() {
		if (libr.getBooks() == null) {
			System.out.println("В библиотеке нет книг. Нечего выводить!");
		} else {
			System.out.println(
					"Выберите желаемую сортировку при выводе (введите число, соответствующее желаемой сортировке): \n1. По алфавиту по названию книги.\n2. По добавлению(сначала новые, потом более старые).\n3. По добавлению(сначала старые, потом новые).");
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Вы должны ввести число! Попробуйте еще раз!");
				printAllBooks();
				return;
			}
			switch (choice) {
			case 1:
				sort1();
				System.out.println("Вывод книг прошел успешно!");
				menu();
				break;
			case 2:
				sort2();
				System.out.println("Вывод книг прошел успешно!");
				menu();
				break;
			case 3:
				sort3();
				System.out.println("Вывод книг прошел успешно!");
				menu();
				break;
			default:
				System.out.println("Число введено неверно. Попробуйте еще раз!");
				printAllBooks();
			}
		}

	}

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

	private void sort2() {
		System.out.println(libr);
	}

	private void sort3() {
		ListIterator<Book> iter1 = libr.getBooks().listIterator();
		ArrayList<Book> b1 = new ArrayList<>();
		while (iter1.hasNext()) {
			iter1.next();
		}
		while (iter1.hasPrevious()) {
			b1.add(iter1.previous());
		}
		System.out.println(b1);
	}

	private void addingBook() {
		System.out.println("Сейчас будем вводить данные для создания новой книги. Введите id (целое число):");
		Scanner sc = new Scanner(System.in);
		int id = 1;
		try {
			id = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Вы должны ввести число! Попробуйте еще раз!");
			addingBook();
			return;
		}
		ListIterator<Book> iter = libr.getBooks().listIterator();
		while (iter.hasNext()) {
			Book b = iter.next();
			if (b.getId() == id) {
				System.out.println("В библиотеке уже есть книга с таким id. Поменяйте id!");
				addingBook();
				return;
			}
		}
		sc.nextLine();
		System.out.println("Введите название книги");
		String name = sc.nextLine();
		System.out.println("Введите жанр книги");
		String genre = sc.nextLine();
		Book book = new Book(id, name, genre);
		libr.addBook(book);
		System.out.println("Книга успешно добавлена в библиотеку!");
	}

	private void deletingBook() {
		if (libr.getBooks() == null) {
			System.out.println("В библиотеке нет книг. Нечего удалять!");
		} else {
			System.out.println("Введите id (целое число) книги, которую надо удалить");
			Scanner sc = new Scanner(System.in);
			int id = 1;
			try {
				id = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Вы должны ввести число! Попробуйте еще раз!");
				deletingBook();
				return;
			}
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
			System.out.println("Сейчас будем вводить данные для корректировки книги. Введите id (целое число):");
			Scanner sc = new Scanner(System.in);
			int id = 1;
			try {
				id = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Вы должны ввести число! Попробуйте еще раз!");
				correctingBook();
				return;
			}
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
				sc.nextLine();
				System.out.println("Введите название книги");
				String name = sc.nextLine();
				System.out.println("Введите жанр книги");
				String genre = sc.nextLine();
				Book book = new Book(id, name, genre);
				libr.correctBook(book);
				System.out.println("Книга успешно отредактирована!");
			}
		}
	}
}
