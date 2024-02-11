package finkey;

public class FinalVar
{  
	 final int i = 90; //final variable  
	 void run()
	 {  
		 i = 400;  
	 }  
	 
	 public static void main(String args[])
	 {  
		 FinalVar fv = new FinalVar(); 
		 fv.run();  
	 }  
}
