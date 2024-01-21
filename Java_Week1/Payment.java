//Program to calculate interest as per given requirements.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Payment
{
	public static void main(String args[])
	{
		double amount, interest_rate, monthly_pay, monthlyIntRate, total_pay;
		int yrs;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the loan amount: ");
		amount = sc.nextFloat();

		System.out.println("Enter the loan period in number of years: ");
		yrs = sc.nextInt();

		System.out.println("Interest Rate\t\t" + "Montly Payment\t\t" + "Total Payment");
		for(interest_rate=5.0; interest_rate <= 8.0; interest_rate = interest_rate + 0.125)
		{
			monthlyIntRate = interest_rate/100/12;
			monthly_pay = (float)((amount*monthlyIntRate)/(1-(1/Math.pow(1+monthlyIntRate, yrs*12))));
			total_pay = monthly_pay*yrs*12;
			//System.out.println(interest_rate + "\t\t\t" + monthly_pay + "\t\t" + total_pay);
			System.out.printf("%.2f%%\t\t\t%.2f\t\t\t%.2f\n", interest_rate, monthly_pay, total_pay);
		}
	}
}






