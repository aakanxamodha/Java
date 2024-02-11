/* Develop Java code that print multiplication table of a number (use command line  arguments to accept number.) */

public class Table 
{
	public static void main (String a[])
	{
		int num = Integer.parseInt(a[0]);
			
		System.out.println("Table of " + num + ":-");
		System.out.println();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " X " + i + " = " +(num*i));
		}
	}
}