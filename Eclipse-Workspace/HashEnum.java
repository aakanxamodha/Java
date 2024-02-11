/*Develop java code to demonstrate Hashtable, accept at least 5 proper 
 values from user, display them using enumeration. */

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner; 

public class HashEnum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		Hashtable h = new Hashtable();		
		
		System.out.println("Total number of elements: ");
		n=sc.nextInt();
		
		System.out.println("Insert those elements: ");
		for(i=0;i<n;i++)
		{
			h.put(i,sc.nextInt());		
		}
		
		Enumeration obj = h.elements();
		System.out.println("Inserted elements: ");
		while(obj.hasMoreElements())
		{
			System.out.println(obj.nextElement());	
		}

	}

}
