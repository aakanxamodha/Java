//Java code to demonstrate five methods of DatabaseMetaData.

import java.sql.*;  
class Dbmd
{  
	public static void main(String args[])
	{  
		try
		{  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
  
				String url="jdbc:oracle:thin:@localhost:1521:system";
				String user="scott";
				String password="tiger";
				Connection con=DriverManager.getConnection(url, user,password);  
				DatabaseMetaData dbmd=con.getMetaData();  
  
				System.out.println("Driver Name: " + dbmd.getDriverName());  
				System.out.println("Driver Version: " + dbmd.getDriverVersion());  
				System.out.println("UserName: " + dbmd.getUserName());  
				System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());  
				System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());  
  
				con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  