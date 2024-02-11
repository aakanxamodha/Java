//Java code to demonstrate five methods of ResultSetMetaData.

import java.sql.*; 

class Rsmd
{  
			public static void main(String args[])
			{  
					try
					{  
							Class.forName("oracle.jdbc.driver.OracleDriver");  
							
							String url="jdbc:oracle:thin:@localhost:1521:system";
							String user="scott";
							String password="tiger";
							Connection con=DriverManager.getConnection(url, user, password);
  
							PreparedStatement ps=con.prepareStatement("select * from emp");  
							ResultSet rs=ps.executeQuery();  
							ResultSetMetaData rsmd=rs.getMetaData();  
  
							System.out.println("Total columns: " + rsmd.getColumnCount());  
							System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));  
							System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
							System.out.println("3rd column is Case sensitive or not: " + rsmd.isCaseSensitive(3));
							System.out.println("2nd column is Currency or not: " + rsmd.isCurrency(2));
  
							con.close();  
					}
					
					
					catch(Exception e)
					{
						System.out.println(e);
					
					}  
			}  
}  
