package superthis;

public class Child extends Parent {

	String ChildName;
	public Child(String surname)
	{
		super(surname);
		System.out.println("Child Class Called");
	}
}
