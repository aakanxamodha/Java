//Servlet to demonstrate the usage of GET method.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gm")
public class GetMethod extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String fn=req.getParameter("fname");
		String ln=req.getParameter("lname");
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(fn);
		printWriter.println(ln);
		
	}

	
	

}
