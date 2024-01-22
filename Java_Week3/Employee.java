//Program to calculate net salary and gross salary.
//Aakanxa Modha
//January 22, 2024

import java.util.*;

class Employee
{
	int empCode, basic;
	String empName;
	double HRA, IT = 200, PF, netSal, grossSal;

	Scanner sc = new Scanner(System.in);

	public void inputData()
	{
		System.out.println("Enter employee code: ");
		empCode = sc.nextInt();

		System.out.println("Enter employee name: ");
		empName = sc.next();

		System.out.println("Enter basic salary: ");
		basic = sc.nextInt();
	}

	public void calculation()
	{
		HRA = basic*0.075;
		PF = basic*0.12;
		grossSal = basic + HRA;
		netSal = grossSal - (IT + PF);
		System.out.println("Calculations are done");
	}

	public void displayData()
	{
		System.out.println("Employee code: " + empCode);
		System.out.println("Employee name: " + empName);
		System.out.println("Basic salary: " + basic);
		System.out.println("Gross salary: " + grossSal);
		System.out.println("Net salary: " + netSal);
	}

	public static void main(String args[])
	{
		Employee emp = new Employee();
		int choice;

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Input Data:- ");
			System.out.println("2. Calculate:- ");
			System.out.println("3. Display Data:- ");
			System.out.println("Enter your choice (0 to stop): ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1: emp.inputData();
						break;

				case 2: emp.calculation();
						break;

				case 3: emp.displayData();
						break;

				default: break;
			}
		}while(choice != 0);
	}
}