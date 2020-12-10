package parser;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class XMLTaskFacade {
    private XMLService xmlService;

    public XMLTaskFacade(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    ArrayList<String> completeXMLTask(String file_name, String tag_name) throws ParserConfigurationException, SAXException, IOException {
        ArrayList<String> results;
        results = xmlService.simpleSaxStart(file_name, tag_name);
        if (!results.isEmpty()) {
            for (String s : results) {
            	results.add(s);
            }
        }
        else {
            results.add("No results.");
        }
        return results;
    }
}
