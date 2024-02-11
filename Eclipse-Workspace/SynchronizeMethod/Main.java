package synMeth;

public class Main 
{

	public static void main(String[] args) 
	{
		First target = new First();
		Second s1 = new Second(target, "Hello");
		Second s2 = new Second(target, "World");
		
		try
		{
			s1.t.join();
			s2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
