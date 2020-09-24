package lesson_14.task2;
/*
 * Написать клиент для работы обменника. Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО. 
 * Количество долларов и ЕВРО в обменнике не должно превышать какого-то заранее заданного предела и не должно 
 * оказаться меньше нуля. Каждый человек так же не может купить или продать долларов или ЕВРО больше, чем какое-то
 *  определенное значение. В нашей программе, имитирующей торговый центр, работает несколько обменников. 
 *  Одновременно в одном обменнике может находится только один человек. Человек может как покупать или продавать
 *   валюту так и делать обе эти операции одновременно (покупать доллары и продавать ЕВРО).
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import lesson_14.task1.Book;

public class CurrencyExchangeRunner {

	public static void main(String[] args)
			throws InterruptedException, ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("FreeIT//src//lesson_14//task2//DataForCurrencyExchangeXML.xml"));
		NodeList curExchElements = document.getDocumentElement().getElementsByTagName("CurrencyExchange");
		Queue<CurrencyExchange> currencyExchanges = new ArrayDeque<>();
		for (int i = 0; i < curExchElements.getLength(); i++) {
			Node curExchNode = curExchElements.item(i);
			NodeList curExchChildNodes = curExchNode.getChildNodes();
			int id = Integer.parseInt(curExchChildNodes.item(1).getTextContent());
			int quantityOfUSD = Integer.parseInt(curExchChildNodes.item(3).getTextContent());
			int quantityOfEUR = Integer.parseInt(curExchChildNodes.item(5).getTextContent());
			CurrencyExchange currencyExchange = new CurrencyExchange(id, quantityOfUSD, quantityOfEUR);
			currencyExchanges.add(currencyExchange);
		}

		List<Thread> threads = Stream
				.of(new Buyer(currencyExchanges), new Buyer(currencyExchanges), new Buyer(currencyExchanges),
						new Buyer(currencyExchanges), new Buyer(currencyExchanges), new Buyer(currencyExchanges),
						new Buyer(currencyExchanges), new Buyer(currencyExchanges))
				.peek(Thread::start).collect(Collectors.toList());

		for (Thread thread : threads) {
			thread.join();
		}
	}

}
