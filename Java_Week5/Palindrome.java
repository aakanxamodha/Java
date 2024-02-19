/* Input a string. Reverse it. Check whether it is a palindrome or not.
Note: Write a separate function for reversing the string. */
//Aakanxa Modha
//230970031
//February 12, 2024

import java.util.*;

class Palindrome
{
	String str, rev="";
	int i, length;

	public void getString()
	{
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
	}

	public void reverse()
	{
		length = str.length();

		for(i = length - 1; i>= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
	}

	public void palindrome()
	{
		if(str.equals(rev))
			System.out.println(str + " is a palindrome string.");
		else
			System.out.println(str + " is not a palindrome string.");
	}

	public static void main(String args[])
	{
		Palindrome p = new Palindrome();
		p.getString();
		p.reverse();
		p.palindrome();
	}
}
