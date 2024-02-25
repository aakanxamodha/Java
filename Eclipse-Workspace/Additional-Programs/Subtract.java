/*Write a program to subtract each element of the given array from the mean value of the same array. */

//Aakanxa Modha
//February 25, 2024

import java.util.*;

class Subtract
{
	int size, i;
	double[] arr;
	double sum, mean;
	double[] result;

	public void getData()
	{
		System.out.println("Enter the size of an array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		arr = new double[size];

		System.out.println("Enter " + size + " elements: ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextDouble();
		}
	}

	public void mean()
	{
		sum = 0;
		for(i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		mean = sum / size;
	}

	public void ans()
	{
		result = new double[size];

		for(i=0; i<size; i++)
			result[i] = arr[i] - mean;
	}

	public void display()
	{
		System.out.println("Array elements after subtracting from mean:- ");
		for(i=0; i<size; i++)
			System.out.println(result[i]);
	}

	public static void main(String args[])
	{
		Subtract s = new Subtract();
		s.getData();
		s.mean();
		s.ans();
		s.display();
	}
}
