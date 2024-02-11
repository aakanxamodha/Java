/*Develop java code to demonstrate synchronize method. */

package synMeth;

public class First 
{
	synchronized void call(String str)
	{
		System.out.println("[" + str);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception");
		}
		System.out.println("]");
	}
}
