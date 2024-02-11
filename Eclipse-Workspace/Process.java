/* Develop Java code to initialize the matrix of size 3x3 and display it. */

public class Process 
{
	  public static void main(String[] args) 
	  {
		  	int num[][] =  { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		  	
		  	System.out.println("Matrix of 3x3 :-");
		  	System.out.println();
	    
		  	for(int i=0; i<num.length; i++) 
		  	{
		  			for(int j=0; j<num[0].length; j++) 
		  			{
		  				System.out.print(num[i][j] + " ");
		  			}
		  			System.out.println();
		  	}
	  }
}