//Program to calculate total bill amount and according to that, give discount.
//Aakanxa Modha
//January 22, 2024

import java.util.*;

class Shop
{
	int itemId = 0, quantity = 0, unitPrice = 0, totAmount = 0;
	String itemName = "default";
	float discount=0;

	public void getData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Item Id: ");
		itemId = sc.nextInt();

		System.out.println("Enter Item Name: ");
		itemName = sc.next();

		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();

		System.out.println("Enter unit price: ");
		unitPrice = sc.nextInt();
	}

	public void calculation()
	{
		totAmount = quantity*unitPrice;

		if(totAmount < 500)
			System.out.println("No discount");
		else
			if(totAmount >= 500 && totAmount <=1000)
			{
				discount = totAmount - ((totAmount*10)/100);
				System.out.println("10% discount: " + discount);
			}
			else
				if(totAmount > 1000 && totAmount <= 2000)
				{
					discount = totAmount - ((totAmount*20)/100);
					System.out.println("20% discount: " + discount);
				}
				else
				{
					discount = totAmount - ((totAmount*30)/100);
					System.out.println("30% discount: " + discount);
				}
	}

	public void displayData()
	{
				System.out.println("Item Id: " + itemId);
				System.out.println("Item name: " + itemName);
				System.out.println("Quantity: " + quantity);
				System.out.println("Unit Price: " + unitPrice);
	}

	public static void main(String args[])
	{
		Shop sh = new Shop();
		int choice;

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Input Data:- ");
			System.out.println("2. Display Data:- ");
			System.out.println("3. Discount:- ");
			System.out.println("Enter your choice (0 to stop): ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1: sh.getData();
						break;

				case 2: sh.displayData();
						break;

				case 3: sh.calculation();
						break;

				default: break;
			}
		}while(choice != 0);
	}
}