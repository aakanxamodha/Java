//Servlet to Servlet config and Servlet context.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestInitParam extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String s = getServletConfig().getInitParameter("conf1");
		pw.println("<h1> Testing config init param </h1>");
		pw.println("<h3> Value of config init param :" +s+ "</h3>");
		
		pw.println("<hr>");
		s = getServletContext().getInitParameter("cont1");
		pw.println("<h1> Testing context init param </h1>");
		pw.println("<h3> Value of context init param :" +s+ "</h3>");
	}

}
