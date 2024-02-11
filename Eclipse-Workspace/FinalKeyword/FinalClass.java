/*Develop java code to demonstrate the usage of final keyword.*/

package finkey;

final class FinalClass
{
	
}  

class FinalClass1 extends FinalClass
{  
		void run()
		{
			System.out.println("Final Class method...");
		}  
    
		public static void main(String args[])
		{  
				FinalClass1 fc1 = new FinalClass1();
				fc1.run();
		}  
}  