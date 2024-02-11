/*Develop java code to generate "N" random numbers. */

import java.util.Scanner;

public class RandomNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	    System.out.println("Enter total number of numbers: ");
	    int n = sc.nextInt();
	      
	    System.out.println("List of " +n+ " random numbers:");
	    for(int i=0; i<n; i++)
	        System.out.println(Math.random());
	   }

	}