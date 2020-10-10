package lesson_14.task1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LibraryRunner {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("FreeIT//src//lesson_14//task1//DataForLibraryXML.xml"));
		NodeList bookElements = document.getDocumentElement().getElementsByTagName("Book");
		CopyOnWriteArrayList<Book> booksForRead = new CopyOnWriteArrayList<>();
		CopyOnWriteArrayList<Book> booksForHome = new CopyOnWriteArrayList<>();
		for (int i = 0; i < bookElements.getLength(); i++) {
			Node bookNode = bookElements.item(i);
			NodeList bookChildNodes = bookNode.getChildNodes();
			String name = bookChildNodes.item(1).getTextContent();
			String author = bookChildNodes.item(3).getTextContent();
			String genre = bookChildNodes.item(5).getTextContent();
			boolean isSoftCover = new Boolean(bookChildNodes.item(7).getTextContent());
			int yearOfPublishing = Integer.parseInt(bookChildNodes.item(9).getTextContent());
			int forTakingHome = Integer.parseInt(bookChildNodes.item(11).getTextContent());
			int quantityOfThisBooks = Integer.parseInt(bookChildNodes.item(13).getTextContent());
			Book book = new Book(name, author, genre, isSoftCover, yearOfPublishing, forTakingHome,
					quantityOfThisBooks);
			if (book.getForTakingHome() == 0) {
				booksForHome.add(book);
			} else {
				booksForRead.add(book);
			}
		}
		Library library = new Library(booksForRead, booksForHome);

		Customer customer1 = new Customer(library);
		Customer customer2 = new Customer(library);
		Customer customer3 = new Customer(library);
		Customer customer4 = new Customer(library);
		Customer customer5 = new Customer(library);
		Customer customer6 = new Customer(library);
		Customer customer7 = new Customer(library);
		Customer customer8 = new Customer(library);

		customer1.start();
		customer2.start();
		customer3.start();
		customer4.start();
		customer5.start();
		customer6.start();
		customer7.start();
		customer8.start();
	}
}
