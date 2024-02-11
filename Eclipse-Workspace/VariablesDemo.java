/*Develop a java code to demonstrate the local variables, class variables and instance variables. */

public class VariablesDemo {

	int instVar;
	static int staVar = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int locVar = 100;
		VariablesDemo vd = new VariablesDemo();
		
		System.out.println("Value of Instance Variable: " + vd.instVar);
		System.out.println("Value of Static Variable: " + vd.staVar);
		System.out.println("Value of Local Variable: " + locVar);
	}

}
