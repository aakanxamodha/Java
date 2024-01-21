//Program to determine average fuel economy and based on that fuel and distance estimation.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Estimation
{
	public static void main(String args[])
	{
		int choice=0;
		float kms, litre, kmpl;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the distance(in Km): ");
		kms = sc.nextFloat();

		System.out.println("Enter the fuel consumed(in Litre): ");
		litre = sc.nextFloat();

		kmpl = kms/litre;
		System.out.println("Average fuel economy: " + kmpl + " kmpl");

		do
		{
			System.out.println("1. Dist estimation");
			System.out.println("2. Fuel estimation");
			System.out.println("Enter your choice(0 to stop): ");
			choice = sc.nextInt();

			switch(choice)
			{
					case 1: System.out.println("Enter the fuel consumed(in Litre): ");
							litre = sc.nextFloat();
							float distance = kmpl * litre;
							System.out.println("Estimated distance= "+distance);
							break;

					case 2: System.out.println("Enter the distance(in Km): ");
							kms = sc.nextFloat();
							float fuel = kms / kmpl;
							System.out.println("Estimated fuel= "+fuel);
							break;

					case 0: break;

					default: System.out.println("Please enter either 1, 2 or 0...!"); break;
			}
		}while(choice != 0);
	}
}