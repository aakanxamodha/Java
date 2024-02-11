package finkey;

class FinalMethod
{  
	  final void run()
	  {
		  System.out.println("Final in Method");
	  }  
}  
	     
class FinalMethod2 extends FinalVar
{  
		void run()
	    {	
		   System.out.println("Final in inherited class.");
	    }  
	     
	    public static void main(String args[])
	    {  
	    	FinalMethod2 fm2 = new FinalMethod2();
	    	fm2.run();
	    }  
}  