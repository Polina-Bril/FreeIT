package lesson_10;

import java.util.ArrayList;

public class ApplicationRunner {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		Book book1 = new Book("Atlant", "Roman");
		Book book2 = new Book("Puaro", "Detective");
		Book book3 = new Book("Nlo", "Fantasy");
		book.add(book1);
		book.add(book2);
		book.add(book3);
		Library lib = new Library(book);

		Application abc = new Application(lib);
		abc.start();
	}

}
