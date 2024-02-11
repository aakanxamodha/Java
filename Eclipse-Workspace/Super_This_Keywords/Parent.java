package superthis;

public class Parent extends GrandParent {

	String ParentName;
	public Parent(String surname)
	{
		super(surname);
		System.out.println("Parent Class Called");
	}
}
