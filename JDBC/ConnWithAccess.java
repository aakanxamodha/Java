/* Develop code to define JDBC Connections to Access Database.*/

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnWithAccess 
{
	public static void main(String[] args) 
	{
		
		try
		{
			String url = "jdbc:ucanaccess://d:/aakanxam/database1.mdb";
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("Driver loaded..!");
			
			
			Connection cn =DriverManager.getConnection(url);
			System.out.println("Connectiond done..!");
			
		}
		catch(Exception e)
		{
			System.out.println("Error...!" +e.toString());
		}
	}

}
