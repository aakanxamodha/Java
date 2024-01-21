//Program to calculate BMI according to given conditions.
//Aakanxa Modha
//January 8, 2024

import java.util.*;

class BMI
{
	public static void main(String args[])
	{
		float kgs, height, height_Sq, height_m, weight, bmi;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in KG: ");
		weight = sc.nextFloat();

		System.out.println("Enter height in cm: ");
		height = sc.nextFloat();

		height_m = height/100;
		height_Sq = height_m*height_m;
		bmi = weight/height_Sq;

		System.out.println("BMI: " + bmi);

		if(bmi < 18.5)
			System.out.println("Underweight !");
		else
			if(bmi >= 18.5 && bmi <= 24.9)
				System.out.println("Normal !");
			else
				if(bmi >= 25 && bmi <= 29.9)
					System.out.println("Overweight !");
				else
					System.out.println("Obese !");
	}
}