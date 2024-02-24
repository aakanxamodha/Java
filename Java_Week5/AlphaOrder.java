/*Input a string. Rearrange the characters in it in alphabetic order (E.g., COMPUTER should
be written in the form of CEMOPRTU).Rearranging should be done for the two cases:
--> Considering the upper/lower case of alphabets
--> Without considering the upper/lower case of alphabets */
//Aakanxa Modha
//230970031
//February 12, 2024

import java.util.*;

class AlphaOrder
{
	String sorted;
	char ch, strch, lowerch;
	int i, length;

	public String consider(String str)
	{
		sorted = " ";
		length = str.length();
		for(ch='A'; ch<='z'; ch++)
		{
			for(i=0; i<length; i++)
			{
				strch = str.charAt(i);
				if(ch==strch)
					sorted+=strch;
			}
		}
		return sorted;
	}

	public String woutConsider(String str)
	{
		sorted = " ";
		length = str.length();
		for(ch='a'; ch<='z'; ch++)
		{
			for(i=0; i<length; i++)
			{
				strch = str.charAt(i);
				lowerch = Character.toLowerCase(strch);
				if(ch==lowerch)
					sorted+=strch;
			}
		}
		return sorted;
	}

	public static void main(String args[])
	{
		System.out.println("Input a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		AlphaOrder ao = new AlphaOrder();

		String resultCon = ao.consider(str);
		System.out.println("Output String (with Case) = " + resultCon);

		String resultWCon = ao.woutConsider(str);
		System.out.println("Output String (without Case) = " + resultWCon);
	}
}
