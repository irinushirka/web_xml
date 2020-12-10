package parser.interfaces;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public interface SimpleDomInterface {
    public ArrayList<String> parse(String file_name) throws IOException, ParserConfigurationException, SAXException;
}