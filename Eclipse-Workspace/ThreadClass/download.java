/*Develop java code to start download process.(Use thread class.)*/

package dwnld;

public class download extends Thread 
{

		public download(String name) 
		{
			setName(name);
		}
		
		public void run()
		{
			for(int i=1; i<=10; i++)
			{
				try 
				{				
					Thread.sleep(500);							
				} 
				catch (InterruptedException e) 
				{
				
					e.printStackTrace();
				}
				System.out.println(getName() + "-> "+i*10 + "% complete");
			}
		}
}
