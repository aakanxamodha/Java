/*Develop java code to manage main thread. */

public class MainThread 
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Name : " + t.getName());
		t.setName("Aakanxa");
		System.out.println("New Name : " + t.getName());
		
		for(int n=5; n>=1; n--)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(n);
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		System.out.println("Program ends");
	}	
}
