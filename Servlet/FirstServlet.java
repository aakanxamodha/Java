//Servlet to demonstrate the Hidden from fields.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fs")
public class FirstServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("txtuser");
		out.println("<h1>Hello, "+name+"<h1/>");
		out.println("<form action='ss' method='post'>");
		
		out.println("<input type='hidden' value='"+name+"'name='txtUserName'>");
		out.println("<input type='submit' value='OK'");
		
		out.println("</form>");
		
		out.close();
			
	}

}
