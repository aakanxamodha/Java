//Servlet to display the client information using HTTP request.

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class S1 extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<p>Context Path : " +request.getContextPath());
		
		
		String newURL = response.encodeURL("http://localhost:8080/RequestObjectDemo/s1");
		pw.println("<p> new url :"+newURL);
		
		pw.println("<br/><br/>");
		pw.println("<a href="+newURL+">Click</a>");
		pw.println(request.getRequestedSessionId());
		
	}
}
