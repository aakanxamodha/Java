//Login application using servlet & JDBC to validate user.

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/login")
public class Login extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		Connection conn;
		PreparedStatement pst;
		String url, user, pass, QRY="";
		
		url="jdbc:oracle:thin:@localhost:1521:system";
		user="system";
		pass="syshjd";
		
		try
		{
			
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn = DriverManager.getConnection(url, user, pass);
			 
			
			 
			 String username = request.getParameter("txtUsername");
			 String password= request.getParameter("txtPassword");
			 
			 QRY="select *from tbl_users where username=? and password=?";
			 pst = conn.prepareStatement(QRY);
			 pst.setString(1, username);
			 pst.setString(2, password);
			 
			
			 
			 if(pst.executeQuery().next())
			 {
				 HttpSession session=request.getSession();
				 session.setAttribute("userid", username);
				 response.sendRedirect("homepage.html");
//				 pw.println("Welcome user.. "+username);
//				 pw.println("<p><a href='Logout'>Logout here</a></p>");
			 }
			 else
			 {
				 pw.println("Invalid login details");
				 
			 }
				
		}
		
		catch(Exception e)
		{
			System.out.println("Error..!" +e.toString());
		}
	
	}

}
