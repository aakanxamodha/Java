//Reverse n number of array elements and put them in an another array.
//Aakanxa Modha
//January 15, 2024

import java.util.*;

class Reverse
{
	public static void main(String args[])
	{
		int num, i;
		int original[] = new int[50];
		int reversed[] = new int[50];
		int temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements: ");
		num = sc.nextInt();

		System.out.println("Enter " + num + " array elements: ");
		for(i=0; i<num; i++)
		{
			original[i] = sc.nextInt();
		}

		for(i=0; i<num;i++)
		{
			int curNum = original[i];
			int revNum = 0;

			while(curNum!=0)
			{
				temp = curNum%10;
				revNum = revNum*10+temp;
				curNum = curNum/10;
			}
			reversed[i] = revNum;
		}

		System.out.println("Original Array: ");
		for(i=0; i<num; i++)
			System.out.println(original[i]);

		System.out.println("Reversed Array: ");
		for(i=0; i<num; i++)
			System.out.println(reversed[i]);
	}
}

