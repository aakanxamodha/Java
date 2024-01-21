//Program to calculate the increasing fees by 5% every year for the next 10 years.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Uni_Fees
{
	public static void main(String args[])
	{
		int i;
		double fees, percent;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount of the fees: ");
		fees = sc.nextDouble();

		percent = fees * 0.05;

		for(i=1; i<=10; i++)
		{
			fees += percent;
			System.out.println("The fee after " +i+ " year = " + fees);
		}
	}
}