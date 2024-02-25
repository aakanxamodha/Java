/*Write a program to find the LCM and GCD of two numbers.*/

//Aakanxa Modha
//February 25, 2024

import java.util.*;

class Calculation
{
	double num1, num2, temp;

	public double GCD(double num1, double num2)
	{
		while(num2!=0)
		{
			temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	public double LCM(double num1, double num2)
	{
		return (Math.abs(num1) / GCD(num1, num2)) * Math.abs(num2);
	}

	public static void main(String args[])
	{
		double num1, num2;

		System.out.println("Enter 1st number: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();

		System.out.println("Enter 2nd number: ");
		num2 = sc.nextDouble();

		Calculation c = new Calculation();

		double AnsGCD = c.GCD(num1, num2);
		double AnsLCM = c.LCM(num1, num2);

		System.out.println("GCD: " + AnsGCD);
		System.out.println("LCM: " + AnsLCM);
	}
}