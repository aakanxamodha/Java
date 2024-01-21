//Program to convert speed from km/hr to m/sec and vice-versa.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Speed_Converter
{
	public static void main(String args[])
	{
		int hrs, choice = 0;
		float kmph, mps;

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("1. km_per_hr to mtr_per_sec");
			System.out.println("2. mtr_per_sec to km_per_hr.");
			System.out.println("Enter your choice(0 to stop): ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1: System.out.println("Enter the speed in km_per_hr: ");
						kmph = sc.nextFloat();
						mps = (kmph * 1000) / 3600;
						System.out.println("Speed in mtr_per_sec= " + mps);
						break;

				case 2: System.out.println("Enter the speed in mtr_per_sec: ");
						mps = sc.nextFloat();
						kmph = (mps * 3600) / 1000;
						System.out.println("Speed in km_per_hr= " + kmph);
						break;

				case 0: break;

				default: System.out.println("Please enter either 1, 2 or 0...!"); break;
			}
		}while(choice != 0);
	}
}
