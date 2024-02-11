//Servlet to fetch all HTML elements from page and display it.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HtmlElementsDemo")
public class HtmlElementsDemo extends HttpServlet 
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<html>");
		pw.println("<body>");
		
		
		pw.println("<h1>Those HTML elements are fetched from Servlet</h1>");
		pw.println("<br/>");
		pw.println("===================================================================");
		
		pw.println("<h1>This is h1 tag.</h1>");
		pw.println("<h2>This is h2 tag.</h2>");
		pw.println("<h3>This is h3 tag.</h3>");
		pw.println("<h4>This is h4 tag.</h4>");
		pw.println("<h5>This is h5 tag.</h5>");
		pw.println("<h6>This is h6 tag.</h6>");
		pw.println("<h3><p>This is paragraph tag.</p></h3>");
		
		pw.println("<h3>Textbox: <input type='text'/></h3>");
		pw.println("<h3>Button: <input type='submit'/></h3>");
		pw.println("<h3>Radio Button: <input type='radio' value='Radio button'/></h3>");
		
		
		
		
		pw.println("</body>");
		pw.println("</html>");
		
		
		
		
	}

}
