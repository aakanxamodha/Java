//Servlet to demonstrate the request dispatcher object.

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("user");  
    String p=request.getParameter("pass");  
          
    if(p.equals("123"))
    {  
        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        rd.forward(request, response);  
    }  
    else
    {  
        out.print("Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  