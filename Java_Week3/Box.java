//Program to demonstrate member functions and parameterized constructor to initialize the objects.
//Aakanxa Modha
//January 22, 2024

import java.util.*;

class Box
{
	double height, width, depth, volume;

	Box(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	public void calculation()
	{
		volume = height*width*depth;
		System.out.println("Volume: " + volume);
	}

	public static void main(String args[])
	{
		double h, w, d;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter height: ");
		h = sc.nextDouble();

		System.out.println("Enter width: ");
		w = sc.nextDouble();

		System.out.println("Enter depth: ");
		d = sc.nextDouble();

		Box b = new Box(h,w,d);
		b.calculation();
	}
}


