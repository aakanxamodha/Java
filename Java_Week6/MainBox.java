/*Create a class called Box having length, width, and height as attributes. Use a method along with all possible constructors to calculate volume. 
Create a derived class with additionaldata members namely weight and color. Include a method to display the volume and all the data members used in 
both the classes. */

//Aakanxa Modha
//230970031
//February 19, 2024

import java.util.*;

class Box
{
	double length, width, height;

	Box(double length, double width, double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
}

class DerivedBox extends Box
{
	double weight;
	String colour;

	DerivedBox(double length, double width, double height, double weight, String colour)
	{
		super(length, width, height);
		this.weight=weight;
		this.colour=colour;
	}

	void calculateVolume()
	{
		double volume = length*width*height;
		System.out.println("Volume = " +volume);
	}

	public void displayData()
	{
	  System.out.println("Length = " +length);
	  System.out.println("Width = " +width);
		System.out.println("Height = " +height);
		System.out.println("Weight = " +weight);
		System.out.println("Colour = " +colour);
	}

}

class MainBox
{
	public static void main(String args[])
	{
		double len, wid, hei, wei;
		String col;

		Scanner sc = new Scanner(System.in);
		System.out.println("Length, Width, Height, Weight and Colour? ");
		len = sc.nextDouble();
		wid = sc.nextDouble();
		hei = sc.nextDouble();
		wei = sc.nextDouble();
		col = sc.next();

		DerivedBox db = new DerivedBox(len, wid, hei, wei, col);
		db.calculateVolume();
		db.displayData();
	}
}
