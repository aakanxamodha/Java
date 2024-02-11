/*Develop java code that defines rectangular array of integers. (accept array size and values from user).*/

import java.util.Scanner;

public class RectangularArray {

	public static void main(String[] args) {
		
		int r, c, i, j;
	    int arr[][] = new int[10][10];
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter row (max 10) : ");
	    r = scan.nextInt();
	    System.out.print("Enter column (max 10) : ");
	    c = scan.nextInt();

	    System.out.println("Enter " + (r * c) + " elements : ");
	    for (i = 0; i < r; i++) 
	    {
	      for (j = 0; j < c; j++) 
	      {
	        arr[i][j] = scan.nextInt();
	      }
	    }

	    System.out.println("Array: ");
	    for (i = 0; i < r; i++) 
	    {
	      for (j = 0; j < c; j++) 
	      {
	        System.out.print(arr[i][j] + "  ");
	      }
	      System.out.println();
	    }
	}
}
