/*Develop java code to demonstrate Var... Args function. */

public class VarArgsDemo {

	static void show(int... a)
	{
		System.out.println("Number of arguments: " + a.length);
		for(int i : a)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show();
		show(100);
		show(12, 25, 22, 3);
	}

}
