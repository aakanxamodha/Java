/*Java code to demonstrate CallableStatement for insert, update and delete.*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallStat
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			String url="jdbc:oracle:thin:@localhost:1521:system";
			String user="system";
			String pass="syshjd";
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			//Insertion
			//CallableStatement c = conn.prepareCall
		   //			(" {CALL insertSTUD(?, ?)}");
			//c.setInt(1, 1);
			//c.setString(2, "Aakanxa");
			
			//c.executeUpdate();
			//System.out.println("Insertion done...!");
			
			//Updation
			//CallableStatement c = conn.prepareCall
		   //			(" {CALL updateSTUD(?, ?)}");
			//c.setInt(1, 1);
			//c.setString(2, "Aria");
			
			//c.executeUpdate();
			//System.out.println("Updation done...!");
			
			//Deletion
			CallableStatement c = conn.prepareCall
					(" {CALL deleteSTUD(?)}");
			c.setInt(1, 1);	
			int n = c.executeUpdate();
			System.out.println("Record deleted...!");
			
		} 
		
		catch (Exception e) 
		{
			
			System.out.println("Error...!" +e.toString());
			
		}

	}

}
