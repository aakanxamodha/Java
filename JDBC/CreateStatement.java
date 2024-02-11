/*Develop Java code to demonstrate the CreateStatement interface to insert, update, and delete records in an oracle table. */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStatement
{


	public static void main(String[] args)
	{
				
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="system";
			String password="syshjd";
			String create="";
			String insert="";
			String update="";
			String delete="";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			
			
			//Table creation
			create="create table student(sno number(2), sname varchar2(20), scity varchar2(20))";
			stmt.execute(create);
			System.out.println("Table created..!");
			
			//Insertion into table
			insert="insert into student values(1, 'Aakanxa', 'Jamnagar')";
			stmt.execute(insert);
			System.out.println("Records inserted..!");
			
			//Updation of records
			//update="update student set sname='Aria' where sno=1";
			//stmt.executeUpdate(update);
			//System.out.println("Record updated..!");
			
			//Deletion of records
			delete="drop table student";
			stmt.execute(delete);
			System.out.println("Table deleted..!");
			
		} 
		catch (Exception e) 
		{
				
			System.out.println("Error..!" + e.toString());
		}
		
	}

}
