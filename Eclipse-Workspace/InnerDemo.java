/*Develop java code to demonstrate nested and inner class. */

public class InnerDemo {

	int i = 12;
	
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	class Inner
	{
		void display()
		{
			System.out.println("Display: InnerDemo.i :" + i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerDemo id = new InnerDemo();
		id.test();
	}

}
