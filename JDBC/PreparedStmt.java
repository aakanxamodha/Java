/*Java code to demonstrate PreparedStatement for insert, update and delete.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmt 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			String url="jdbc:oracle:thin:@localhost:1521:system";
			String user="system";
			String password="syshjd";
			String insert="";
			String update="";
			String delete="";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pst;
			
			//insertion
			//insert = "insert into forall (sno, sname, scity) values (?, ?, ?)";
			//pst=conn.prepareStatement(insert);
			
			//pst.setInt(1, 1);
			//pst.setString(2, "aakanxa");
			//pst.setString(3, "jamnagar");	
			//System.out.println("Records inserted using PrepStmt..!");
			
			//pst.execute();
			
			//updation
			//update = "update forall set sname=?, scity=? where sno=?";
			//pst=conn.prepareStatement(update);
			
			
			//pst.setString(1, "aria");
			//pst.setString(2, "rajkot");
			//pst.setInt(3, 1);
			//System.out.println("Records updated using PrepStmt..!");
			
			//int i = pst.executeUpdate();
			
			//deletion
			delete="delete from forall where sno=?";
			pst=conn.prepareStatement(delete);
			
			pst.setInt(1, 1);
			int i = pst.executeUpdate();
			
			System.out.println("Records deleted using PrepStat..!");
			
			
			pst.close();
			conn.close();
		} 
		catch (Exception e) 
		{
				
			System.out.println("Error..!" + e.toString());
		
		}

	}

}
