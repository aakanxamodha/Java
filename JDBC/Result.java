/*Java code to demonstrate the ResultSet interface.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Result 
{

	public static void main(String[] args) 
	{
		try 
		{
			Statement stmt;
			ResultSet rs;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded..!");
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="system";
			String password="syshjd";
			String select="";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection done..!");
			
			stmt = conn.createStatement();
			select = "select * from student";
			rs = stmt.executeQuery(select);
			
			rs.next();
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getDate(4) + rs.getString(5));
			
			
			
		} 
		catch (Exception e) 
		{
				
			System.out.println("Error..!" + e.toString());
		
		}
	}
}