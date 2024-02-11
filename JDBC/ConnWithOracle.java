/* Develop code to define JDBC Connections to Oracle Database.*/

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnWithOracle 
{

	public static void main(String[] args) 
	{
		
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded..!");
				
				String url="jdbc:oracle:thin:@localhost:1521:orcl";
				String user="system";
				String password="syshjd";
				
				Connection conn = DriverManager.getConnection(url, user, password);
				System.out.println("Connection done..!");
				
				
				
			} 
			catch (Exception e) 
			{
					
				System.out.println("Error..!" + e.toString());
			
			}
			
			

	}

}
