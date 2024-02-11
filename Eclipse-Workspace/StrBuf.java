/* Develop Java code that creates & initialize an array of character & append to a string buffer object. */

import java.util.Scanner;

public class StrBuf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb + " : before append ");
		sb.append('!');
		System.out.println(sb + " : after append");	

	}

}
