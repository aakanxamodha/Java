/*Input two strings (S1 and S2) and two integers (N1 and N2). Perform the following string operations.
--> Display the upper-case equivalent of S1.
--> Display the lower-case equivalent of S2.
--> Extract a substring of length N2 from S1 starting at position N1.
--> Insert S2 into S1 at position N1.
--> Append S2 to S1. */
//Aakanxa Modha
//230970031
//February 12, 2024

import java.util.*;

class StrMethods
{
	public static void main(String args[])
	{
		String S1, S2, upperS1, lowerS2, substr, insertstr, appendstr;
		int N1, N2;

		System.out.println("Input two strings ");
		Scanner sc = new Scanner(System.in);
		S1 = sc.next();
		S2 = sc.next();

		System.out.println("Input position: ");
		N1 = sc.nextInt();

		System.out.println("Input length: ");
		N2 = sc.nextInt();

		//Upper-case equivalent of S1
		upperS1 = S1.toUpperCase();
		System.out.println("Uppercase of " + S1 + " is " + upperS1);

		//Lower-case equivalent of S2
		lowerS2 = S2.toLowerCase();
		System.out.println("Lowercase of " + S2 + " is " + lowerS2);

		//Extract a substring of length N2 from S1 starting at position N1
		if(N1 >= 0 && N2 <= S1.length())
		{
			substr = S1.substring(N1, N1 + N2);
			System.out.println("Substring of " + S1 + " from position " + N1 + " with length " + N2 + " = " + substr);
		}
		else
			System.out.println("Invalid number..!");

		//Insert S2 into S1 at position N1
		if(N1 >= 0 && N1 <= S1.length())
		{
			insertstr = S1.substring(0, N1) + S2 + S1.substring(N1);
			System.out.println("After inserting " + S2 + " into " + S1 + " at position " + N1 + " = " + insertstr);
		}
		else
			System.out.println("Invalid number..!");

		//Append S2 to S1
		appendstr = S1 + S2;
		System.out.println("After appending " + S2 + " to " + S1 + " = " + appendstr);
	}
}
