/*Develop java code to demonstrate vector class, accept at least 5
 vector values from user, display them using enumeration. */

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectEnum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		Vector<Integer> v = new Vector<Integer>();		
		
		System.out.println("Total number of elements: ");
		n=sc.nextInt();
		
		System.out.println("Insert those elements: ");
		for(i=0;i<n;i++)
		{
			v.addElement(sc.nextInt());		
		}
		
		Enumeration obj = v.elements();
		System.out.println("Inserted elements: ");
		while(obj.hasMoreElements())
		{
			System.out.println(obj.nextElement());	
		}
	}
}