/* Develop Java code to convert decimal number to hex, octal and binary. */

import java.util.Scanner;

public class Binary
{
	public static void main(String[] args)
	{
		int num, i=0;
		int binary[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		num = sc.nextInt();
		
		while(num != 0)
		{
			binary[i] = num%2;
			num = num/2;
			i++;
		}
		System.out.print("Binary value: ");
		for(int j = i-1; j>=0; j--)
		{
			System.out.print(binary[j]);
		}
	}
}