package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import parser.XMLCreator;

@WebServlet("/generate")
public class GenerateXMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GenerateXMLServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String file_content = XMLCreator.create();
		response.setContentType("text/xml"); // Tell browser what content type the response body represents, so that it can associate it with e.g. MS Excel, if necessary.
		response.setHeader("Content-Disposition", "attachment; filename=sample.xml"); // Force "Save As" dialogue.
		response.getWriter().write(file_content);
	}

}
