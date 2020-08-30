package lesson_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Library {

	private ArrayList<Book> books;

	public Library() {
		super();
			}

	public Library(ArrayList<Book> books) {
		super();
		this.books = books;
	}

	public void addBook(Book book) {

		int count = 0;
		if (books != null) {
			Iterator<Book> iter = books.listIterator();
			while (iter.hasNext()) {
				Book b = iter.next();
				if (b.getId() == book.getId()) {
					count++;
				}
			}
			if (count == 0) {
				books.add(book);
			}
		} else {
			ArrayList<Book> b = new ArrayList<>();
			b.add(book);
			this.books = b;
		}
	}

	public List<Book> getAll() {
		return books;
	}

	public void delBook(int id) {
		if (books != null) {
			Iterator<Book> iter = books.listIterator();
			while (iter.hasNext()) {
				Book b = iter.next();
				if (b.getId() == id) {
					iter.remove();
				}
			}
		}
	}

	public void correctBook(Book book) {
		if (books != null) {
			ListIterator<Book> iter = books.listIterator();
			while (iter.hasNext()) {
				Book b = iter.next();
				if (b.getId() == book.getId()) {
					iter.set(book);
				}
			}
		}
		
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}

}