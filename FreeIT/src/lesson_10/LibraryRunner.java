package lesson_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class LibraryRunner {

	public static void main(String[] args) {

		Library pushkina = new Library();
		Book book1 = new Book(123, "Atlant", "Roman");
		Book book2 = new Book(345, "Puaro", "Detective");
		Book book3 = new Book(567, "NLO", "Fantasy");

		pushkina.addBook(book1);
		pushkina.addBook(book2);
		pushkina.addBook(book3);
		List<Book> a = pushkina.getAll();
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
		pushkina.delBook(567);
		System.out.println(pushkina);

		ListIterator<Book> iter1 = pushkina.getBooks().listIterator();
		ArrayList<Book> b1 = new ArrayList<>();
		while (iter1.hasNext()) {
			iter1.next();
		}
		while (iter1.hasPrevious()) {
			b1.add(iter1.previous());
		}
		pushkina.setBooks(b1);
		System.out.println(pushkina);
		pushkina.correctBook(new Book(345, "Kapital", "Science"));
		System.out.println(pushkina);

	}

}
