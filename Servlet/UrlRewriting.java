//Servlet to demonstrate the URL rewriting.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UrlRewriting")
public class UrlRewriting extends HttpServlet 
{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("txtusername");
		pw.println("<h1> Welcome, " +name+ "<h1/>");	
		pw.println("<a href='servlet2?userName="+name+"'>");	
	}
}
