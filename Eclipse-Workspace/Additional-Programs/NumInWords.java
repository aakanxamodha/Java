/*Write a java program to print the given number in words.
Example- Input number: 123, Output: One hundred Twenty Three. */

//Aakanxa Modha
//February 25, 2024

import java.util.*;

class NumInWords
{
	String[] OneToNine = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	String[] teen = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public String NumtoWords(int num)
	{
		if(num==0)
		{
			return "Zero";
		}
		return Words(num);
	}

	public String Words(int num)
	{
		String str = "";
		if(num < 10)
		{
			str = OneToNine[num];
		}
		else
			if(num < 20)
			{
		    	str = teen[num - 10];
		    }
		    else
		    	if(num < 100)
		    	{
		            str = tens[num / 10] + " " + OneToNine[num % 10];
		        }
		        else
		        	if(num < 1000)
		        	{
		            	str = OneToNine[num / 100] + " Hundred " + Words(num % 100);
		        	}
		        	else
		        		if(num < 10000)
		        		{
		            		str = OneToNine[num / 1000] + " Thousand " + Words(num % 1000);
		        		}
		        		else
		        			if(num < 100000)
		        			{
		            			str = Words(num / 1000) + " Thousand " + Words(num % 1000);
        					}
		return str.trim();
	}

	public static void main(String args[])
	{
		int no;

		System.out.println("Enter a number (up to 10k): ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();

		NumInWords niw = new NumInWords();
		System.out.println(no + " in words: " + niw.Words(no));
	}
}


