package lesson_10;

public class Book {

	public int id;
	private String title;
	private String genre;
	private static int countForId = 0;

	public Book() {
		super();
	}

	public Book(String title, String genre) {
		super();
		this.id = ++countForId;
		this.title = title;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static int getCountForId() {
		return countForId;
	}

	public static void setCountForId(int countForId) {
		Book.countForId = countForId;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + "]";
	}

}
