/*Develop java code to manage number and array errors using exception handling. */

public class ExpHandling
{

	public static void main(String[] args) 
	{
		System.out.println("Start");
		int x=10;
		int n=2;
		System.out.println("Process");
		try
		{			
			
			System.out.println(x/n);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Error : divide by 0 "+ae.toString());
		}
		catch(ArrayIndexOutOfBoundsException aiof)
		{
			System.out.println("Error : array boundry "+aiof.toString());
		}
		catch(Exception e)
		{
			System.out.println("Error general : array boundry "+e.toString());
		}
		finally 
		{
			System.out.println("Finally block");
		}
		System.out.println("End");
	}
}