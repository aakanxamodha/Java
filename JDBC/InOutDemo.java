/*Java code to demonstrate CallableStatement for one input parameter and one output parameter.*/


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;


public class InOutDemo {

	public static void main(String[] args) {
		
		try 
		
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:system";
			String user="system";
			String password="syshjd";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			String qry="{call aa(?,?)}";
			
			CallableStatement c = conn.prepareCall(qry);
			c.setInt(1, 1);
			c.registerOutParameter(2, Types.CHAR);
			
			c.execute();
			System.out.println("Name: " +c.getString(2));
		} 
		
		catch (Exception e) {
			
			System.out.println("Error..!" + e.toString());
		}
		
	}

}
