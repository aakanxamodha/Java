package InheriDemo;

public class Marks extends StudentDetails
{

	public void print()
	{
		namelen = name.length;
		System.out.print("Name: ");
		for(int i =0; i<5; i++)
		{
			System.out.print(" ");
			System.out.print(" ");
			
			System.out.print(" " + "Birth date: \t");
			System.out.print(" " + "Semester: \t");
			System.out.print(" " + "Mark 1: \t");
			System.out.print(" " + "Mark 2: \t");
			System.out.print(" " + "Mark 3: \t");
			System.out.print(" " + "Average: \t");
			System.out.println(" " + "Grade: \t");
		}
		for(int i=0; i<5; i++)
		{			
			System.out.print(name[i]);
			for(int j=0; j<namelen; j++)
			{
				System.out.print(bdate[i] + "\t");
				System.out.print(sem[i] + "\t");
				System.out.print(m1[i] + "\t");
				System.out.print(m2[i] + "\t");
				System.out.print(m3[i] + "\t");
				System.out.print(avg[i] + "\t");
				System.out.println(grade[i] + "\t");
				
			}
		}
	}
}
