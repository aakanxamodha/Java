//Program to demonstrate array of objects, constructors and member functions.
//Aakanxa Modha
//January 29, 2024
//230970031

import java.util.*;

class Customer
{
		int cust_id, bill_num, num_of_calls;
		double bill_amt;
		String cust_name, phn_num;

		Customer(int cust_id, String cust_name, String phn_num)
		{
			this.cust_id=cust_id;
			this.cust_name=cust_name;
			this.phn_num=phn_num;

			System.out.println("Customer ID(using ctor): " + cust_id);
			System.out.println("Customer name(using ctor): " + cust_name);
			System.out.println("Phone number(using ctor): " + phn_num);

		}

		Scanner sc = new Scanner(System.in);

		void getData()
		{
		//	System.out.println("Enter the number of customers: ");
		//	n = sc.nextInt();
			System.out.println("Enter customer ID: ");
			cust_id = sc.nextInt();
			System.out.println("Enter customer name: ");
			cust_name = sc.next();
			System.out.println("Enter phone number: ");
			phn_num = sc.next();
			System.out.println("Enter bill number: ");
			bill_num = sc.nextInt();
			System.out.println("Enter number of calls: ");
			num_of_calls = sc.nextInt();
		}

		void Calculate_bill_amt()
		{
			if(num_of_calls <= 100)
				bill_amt=100;
			else
				if(num_of_calls > 100 && num_of_calls <= 150)
					bill_amt=100 + 0.60*(num_of_calls-100);
				else
					if(num_of_calls > 150 && num_of_calls <= 200)
						bill_amt=100 + 0.60*50 + 0.50*(num_of_calls-150);
					else
						bill_amt=100 + 0.60*50 + 0.50*50 + 0.40*(num_of_calls - 200);
		}

		void displayData()
		{
			System.out.println("Customer ID: " + cust_id);
			System.out.println("Customer name: " + cust_name);
			System.out.println("Phone number: " + phn_num);
			System.out.println("Bill number: " + bill_num);
			System.out.println("Number of calls: " + num_of_calls);
			System.out.println("Bill amount: " + bill_amt);
		}

		public static void main(String args[])
		{
			//Customer n[] = new Customer[100];
			Customer c = new Customer(1, "Aakanxa", "284994");

			ArrayList<Object> n = new ArrayList<>();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the number of customers: ");
			int no = sc.nextInt();

			for(int i=0; i<no; i++)
			{
				c.getData();
				c.Calculate_bill_amt();
				c.displayData();
			}
		}
}
