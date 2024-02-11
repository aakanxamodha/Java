//Servlet to demonstrate the cookie.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addCookie1")
public class MyCookie extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String username= request.getParameter("userName");
		pw.println("<h1>Welcome, "+username+"</h1>");
		
		Cookie cookie = new Cookie("user", username);
		response.addCookie(cookie);
		pw.println("<h4> Cookie has been set</h4>");
		
	}
	

}
