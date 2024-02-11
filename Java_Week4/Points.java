//Java program to calculate distance between two points.
//Aakanxa Modha
//January 29, 2024
//230970031

import java.util.*;

class Points
{
	double x, y;

	public Points(double x, double y)
	{
		this.x=x;
		this.y=y;
	}

	public static double calculate(Points p1, Points p2)
	{
		return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
	}

	public static void display(Points p, String name)
	{
		System.out.println(name + " = (" + p.x + ", " + p.y + ")");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3;

		System.out.println("Input the coordinates of p1: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		Points P1 = new Points(x1, y1);

		System.out.println("Input the coordinates of p2: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		Points P2 = new Points(x2, y2);

		System.out.println("Input the coordinates of p3: ");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		Points P3 = new Points(x3, y3);

		display(P1, "p1");
		display(P2, "p2");
		display(P3, "p3");

		double p1p2 = Points.calculate(P1, P2);
		double p1p3 = Points.calculate(P1, P3);

		System.out.println("Distance between p1 and p2: " + p1p2);
        System.out.println("Distance between p1 and p3: " + p1p3);
	}
}
