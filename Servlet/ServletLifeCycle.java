//Servlet to demonstrate the life cycle methods of servlet.

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class ServletLifeCycle extends GenericServlet 
{
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init() method called...!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() method called...!");
		
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy() method called...!");
	}

}
