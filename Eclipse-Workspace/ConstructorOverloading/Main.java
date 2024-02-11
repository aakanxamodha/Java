package ConsOve;

public class Main {

	public static void main(String[] args) 
	{

	       StudentDetails s1 = new StudentDetails();
	       System.out.println("Student name: "+ s1.getStuName());
	       System.out.println("Student age: "+ s1.getStuAge());
	       System.out.println("Student ID: "+ s1.getStuID());

	       System.out.println();
	       StudentDetails s2 = new StudentDetails(2, "Alison", 20);
	       System.out.println("Student name: "+ s2.getStuName());
	       System.out.println("Student age: "+ s2.getStuAge());
	       System.out.println("Student ID: "+ s2.getStuID()); 
	}

}
