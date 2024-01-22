//Largest and smallest in two dimensional array and display the row and column indices.
//Aakanxa Modha
//January 15, 2024

import java.util.*;

class TwoDim
{
	public static void main(String args[])
	{
		int i, j, row, col;
		int Array[][] = new int[25][25];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();

		System.out.print("Enter the number of cols: ");
		col = sc.nextInt();

		//Array = new int[row][col];

		for(i=0; i<row; i++)
			for(j=0; j<col; j++)
			{
				System.out.print("Enter the element at (" + i + "," + j + ") position: ");
				Array[i][j] = sc.nextInt();
			}


		int large = Array[0][0];
		int largei=0, largej=0;
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				if(Array[i][j] > large)
				{
					large = Array[i][j];
					largei=i;largej=j;
				}
			}
		}
		System.out.println("The largest element = " + Array[largei][largej]);
		System.out.println("Location = (" + largei + "," + largej + ")");

		int small = Array[0][0];
		int smalli=0, smallj=0;
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				if(Array[i][j] < small)
				{
					small = Array[i][j];
					smalli=i; smallj=j;
				}
			}
		}
		System.out.println("The smallest element = " + Array[smalli][smallj]);
		System.out.println("Location = (" + smalli + "," + smallj + ")");
	}
}