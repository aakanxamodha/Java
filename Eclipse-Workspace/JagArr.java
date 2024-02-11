/* Develop Java code that defines jagged array of integers. (accept array size and value from user).*/

import java.util.Scanner;

public class JagArr 
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		int num[][] = new int[5][];
		num[0] = new int[5];
		num[1] = new int[3];
		num[2] = new int[1];
		num[3] = new int[4];
		num[4] = new int[2];
		
		System.out.println("Enter values: ");
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The values you entered: ");
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}