//Read distinct array elements and diplay in (x>y) form.
//Aakanxa Modha
//January 15, 2024

import java.util.*;

class XYForm
{
	public static void main(String args[])
	{
		int num, i, j;
		int distnum[] = new int[25];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements (max 25) : ");
		num = sc.nextInt();

		System.out.println("Enter the elements: ");
		for(i=0; i<num; i++)
			distnum[i] = sc.nextInt();

		for(i=0; i<num; i++)
			for(j=0; j<num; j++)
			{
				if(distnum[i]>distnum[j])
					System.out.println("(" + distnum[i] + "," + distnum[j] + ")");
			}
	}
}