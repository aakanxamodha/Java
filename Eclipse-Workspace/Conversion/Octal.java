/* Develop Java code to convert decimal number to hex, octal and binary. */

import java.util.Scanner;

public class Octal 
{

	public static void main(String[] args) 
	{
		{
			int num, i=0, z;
			int octal[] = new int[100];
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter decimal number: ");
			num = sc.nextInt();
			
			z = num;
			while(z != 0)
			{
				octal[i] = z%8;
				z = z/8;
				i++;
			}
			System.out.print("Octal value: ");
			for(int j = i-1; j>=0; j--)
			{
				System.out.print(octal[j]);
			}
		}
	}
}
