//Login application using servlet & JDBC to validate user.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		 HttpSession session=request.getSession(false);
		 pw.println("User, " +session.getAttribute("userid").toString());
		 session.removeAttribute("userid");
		 session.invalidate();
		 pw.println("<br/><br/>");
		 pw.println("Logged out successfully..!");
		
	}

}
