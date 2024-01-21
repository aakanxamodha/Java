//Program to display the roots of coeffs according to given conditions.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class Quadratic
{
	public static void main(String args[])
	{
		double a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 values: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double discri, r1_add, r2_minus, b_Sq, ac, w_root;

		b_Sq = b*b;
		ac = 4*a*c;
		w_root = b_Sq - ac;
		discri = Math.sqrt(w_root);

		System.out.println("Discriminant : " + discri);

		r1_add = (-b + discri)/(2*a);
		r2_minus = (-b - discri)/(2*a);

		if(discri > 0)
			System.out.println("Two roots: " + r1_add + " and " + r2_minus );
		else
			if(discri == 0)
				System.out.println("Only one root: " + r1_add );
			else
				System.out.println("The equation has no real roots. Roots are imaginary");
	}
}


