/* Develop Java code to accept row, column & string using command line arguments and print the accepted string at specified row and column location on console screen. */

public class Demo 
{
	public static void main(String[] args)
	{
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		   
		for(int i =1; i<=10;i++)
		{
			for(int j=1; j<=10;j++)
			{  
				 if(row==i & col==j)
				 {  	
					 System.out.print(args[2] + "\t");
				 }
				 else
					 System.out.print("===" + "\t");
			 }
			 System.out.print("\n");
		}
	}

}
