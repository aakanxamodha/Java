/*Write a java program to copy all the unique elements from the given 2-D array into an 1-D array.*/
//Aakanxa Modha
//February 25, 2024

import java.util.*;

class UniqueElements
{
	int i, j, k, l, row, col;
	int[][] twoArr;

	public void getElements()
	{
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		col = sc.nextInt();

		twoArr = new int[row][col];

		System.out.println("Enter elements: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				twoArr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered elements: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(twoArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void uniqueness()
	{
		System.out.println("Unique Elements: ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				boolean isUnique = true;
				for(k=0; k<row; k++)
				{
					for(l=0; l<col; l++)
					{
						if((i!=k || j!=l) && twoArr[i][j] == twoArr[k][l])
						{
							isUnique = false;
							break;
						}
					}
					if(!isUnique)
					{
						break;
					}
				}
				if(isUnique)
				{
					System.out.print(twoArr[i][j] + " ");
				}
			}
		}
	}

	public static void main(String args[])
	{
		UniqueElements ue = new UniqueElements();
		ue.getElements();
		ue.uniqueness();
	}
}