package lesson_13;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class ValidateXML {

	public static void main(String[] args) {
		boolean answer = validateXMLSchema("FreeIT//src//lesson_13//DevicesValidator.xsd", "FreeIT//src//lesson_13//Devices.xml");
		System.out.println("Result: " + answer);
	}

	public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
		return true;
	}
}