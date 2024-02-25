/*Define a class IntArr which holds an array of integers as its data members. Provide the following methods:
--> A default constructor.
--> A parameterized constructor which initializes the array of the object.
--> A method called display to display the array contents.
--> A method called search to search for an element in the array.
--> A method called compare which compares 2 IntArr objects for equality.*/

//Aakanxa Modha
//February 25, 2024

import java.util.*;

class IntArr
{
	int arr[];

	public IntArr()
	{
		this.arr = new int[0];
	}

	public IntArr(int[] array)
	{
		this.arr = array;
	}

	public void display()
	{
		System.out.println("Array elements: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public boolean search(int ele)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == ele)
			{
				return true;
			}
		}
		return false;
	}

	public boolean compare(IntArr other)
	{
		if(this.arr.length != other.arr.length)
		{
			return false;
		}
		for(int i=0; i<this.arr.length; i++)
		{
			if(this.arr[i] != other.arr[i])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		int size1, size2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array: ");
		size1 = sc.nextInt();
		int[] arr1 = new int[size1];

		System.out.println("Enter elements for 1st array: ");
		for(int i=0; i<size1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		IntArr ia1 = new IntArr(arr1);

		System.out.println("Enter the size of 2nd array: ");
		size2 = sc.nextInt();
		int[] arr2 = new int[size2];

		System.out.println("Enter elements for 2nd array: ");
		for(int i=0; i<size2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		IntArr ia2 = new IntArr(arr2);

		ia1.display();
		ia2.display();

		System.out.println("Enter an element to search: ");
		int ele = sc.nextInt();
		if(ia1.search(ele))
		{
			System.out.println(ele + " found in the first array.");
		}
		else
		{
			System.out.println(ele + "not found in the first array.");
		}

		System.out.println("Comparing arrays:- ");
		if(ia1.compare(ia2))
		{
			System.out.println("Arrays are equal.");
		}
		else
		{
			System.out.println("Arrays are not equal.");
		}
	}
}


