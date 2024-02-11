/* Develop Java code to convert decimal number to hex, octal and binary. */

import java.util.Scanner;

public class HexaDec 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int dec, rem;
		char[] hex = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 
				'B', 'C', 'D', 'E', 'F'};
		String hexval = " ";
		
		System.out.println("Enter Decimal Number: ");
		dec = sc.nextInt();
		
		while(dec > 0)
		{
			rem = dec%16;
			hexval = hex[rem] + hexval;
			dec = dec/16;
		}
		System.out.println("Hexadecimal Value: " + hexval);
	}

}
