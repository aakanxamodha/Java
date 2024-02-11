/* Develop Java code that accepts the radius of circle, calculate and display the area of it. (Accept radius using command line arguments.) */

public class Area 
{
	public static void main(String[] args) 
	{
		double r = Double.parseDouble(args[0]);
		
		System.out.print("Area of circle : " + (r*r) * 3.14);	
	}
}