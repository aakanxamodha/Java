/*Write a java program that takes date as input, adds a specified number of days to it, and then displays the resulting date.*/

//Aakanxa Modha
//February 25, 2024

import java.util.*;

class MyDate
{
	int day, month, year, num;

	public void getDate()
	{
		System.out.println("Enter date (dd/mm/yyyy): ");
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		System.out.println("Entered date: " + day + "/" + month + "/" + year);
	}

	public void addDays()
	{
		System.out.println("Enter the number of days to add in the given date: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	}

	public void adding()
	{
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, day);

		c.add(Calendar.DAY_OF_MONTH, num);

		int updateYear = c.get(Calendar.YEAR);
		int updateMon = c.get(Calendar.MONTH) + 1;
		int updateDay = c.get(Calendar.DAY_OF_MONTH);


		System.out.println("Date after adding the days: " + updateDay + "/" + updateMon + "/" + updateYear);
	}

	public static void main(String args[])
	{
		MyDate md = new MyDate();
		md.getDate();
		md.addDays();
		md.adding();
	}
}
