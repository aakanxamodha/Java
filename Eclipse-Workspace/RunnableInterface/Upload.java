/*Develop java code to start upload process. (Use runnable interface.) */

package runInter;

public class Upload implements Runnable 
{
	Thread t;
	public Upload(String name) 
	{
		t = new Thread(this, name);		
		t.start();
	}

	@Override
	public void run() 
	{
		for(int i=1; i<=10; i++)
		{
			try
			{
				System.out.println(i + " : "+ t.getName()  );
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
