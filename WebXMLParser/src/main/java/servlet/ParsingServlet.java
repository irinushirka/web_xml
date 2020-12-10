package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import parser.SimpleDOM;
import parser.SimpleSAX;


@WebServlet("/parse")
public class ParsingServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
    public ParsingServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String file_content = request.getParameter("file");
		String pars_type = request.getParameter("parse-option");
		String tag_name = request.getParameter("tag_name");
		
		System.out.print("\n\n\n" + file_content + "\n" + tag_name + "\n" + pars_type + "\n\n\n");
		
        switch(pars_type) {
        case "SAX":
        	SimpleSAX sax = new SimpleSAX();
        	request.setAttribute("results", sax.start(tag_name, file_content));
        	break;
        case "DOM":
        	SimpleDOM dom = new SimpleDOM();
        	try {
				request.setAttribute("results", dom.parse(file_content));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	break;
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
