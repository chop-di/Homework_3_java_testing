package xml_parsing.saxParser;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser {

    public static void main(String[] args) {

        try {

            File inputFile = new File("./dataForXMLParsing/inputXml.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();


            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
