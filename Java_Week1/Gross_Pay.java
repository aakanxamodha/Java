//Program to calculate the total pay from number of hours worked and hourly rate according to given conditions for hours worked.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Gross_Pay
{
	public static void main(String args[])
	{
		int hrs;
		double rate, gross_pay;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No. of hrs worked: ");
		hrs = sc.nextInt();

		System.out.println("Enter the hourly rate: ");
		rate = sc.nextDouble();

		if(hrs <= 40)
		{
			gross_pay = hrs*rate;
			System.out.println("The total pay = " + gross_pay);
		}
		else
		{
			int routine = 40;
			double extra_hrs = hrs - routine;
			double extra_rate = rate * 1.5;
			gross_pay = (routine*rate) + (extra_hrs*extra_rate);
			System.out.println("The total pay = " + gross_pay);
		}
	}
}