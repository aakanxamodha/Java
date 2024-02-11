/* Develop code to define JDBC Connections to MySQL Database.*/

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnWithMysql 
{
	

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class loaded..!");
			
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Connection done..!");
		}
		catch(Exception e)
		{
			System.out.println("Error..!" + e.toString());
		}

	}

}
