package parser.interfaces;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public interface XMLServiceProtocol {
    public ArrayList<String> simpleSaxStart(String file_name, String tag_name);
    public ArrayList<String> simpleDomParse(String file_name) throws ParserConfigurationException, SAXException, IOException;
}