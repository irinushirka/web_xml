package parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import parser.interfaces.*;


public final class SimpleSAX implements SimpleSAXInterface {
    private ArrayList<String> results = new ArrayList<>();

    DefaultHandler handler;
    @Override
    public ArrayList<String> start(String tag, String file_name) {
        handler = new DefaultHandler() {
            boolean tagOn = false;

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                tagOn = qName.equalsIgnoreCase(tag);
            }

            @Override
            public void characters(char ch[], int start, int length) throws SAXException {
                if (tagOn) {
                    results.add(new String(ch, start, length));
                    tagOn = false;
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException
            {
                super.endElement(uri, localName, qName);
            }
        };

        try {
            SAXParserFactory factory;
            factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(file_name, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}
