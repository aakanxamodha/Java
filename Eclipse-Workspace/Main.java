/*Develop java code that defines one dimensional array of integers. (accept array size and values from user).*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	     Scanner s = new Scanner(System.in);
	     System.out.println("Enter the size:");
	     int len = s.nextInt();
	     int[] a = new int[len];
	     System.out.println("Enter the numbers :");

	      for(int i=0; i<len; i++ ) 
	      {
	         a[i] = s.nextInt();
	      }
	      System.out.println(Arrays.toString(a));

	}

}
