/*Create three classes as per the following specifications:
--> Student: Data members are Register Number, Name, Course and Semester.
--> Exam (derived from class Student): Data members are the marks scored in three subjects.
--> Result (derived from class Exam): Data members are Total Marks and Grade.
Implement get_data() and display() methods using the concept of method overriding.*/

//Aakanxa Modha
//230970031
//February 19, 2024

import java.util.*;

class Student
{
	int regNo, sem;
	String name, course;

	public void get_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registration number: ");
		regNo = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter course: ");
		course = sc.next();
		System.out.println("Enter semester: ");
		sem = sc.nextInt();
	}

	public void display()
	{
		System.out.println("Registration number: " + regNo);
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("Semester: " + sem);
	}
}

class Exam extends Student
{
	int mark1, mark2, mark3;

	public void get_data()
	{
		super.get_data();
		System.out.println("Enter mark1, mark2 and mark3: ");
		Scanner sc = new Scanner(System.in);
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
	}

	public void display()
	{
		super.display();
		System.out.println("Mark 1: " + mark1);
		System.out.println("Mark 2: " + mark2);
		System.out.println("Mark 3: " + mark3);
	}
}

class Result extends Exam
{
	int total;
	float avg;
	char grade;

	public void get_data()
	{
		super.get_data();
	}

	public void calculateResult()
	{
		total = mark1 + mark2 + mark3;
		avg = total/3;

		if(avg > 90)
			grade = 'A';
		else
			if(avg <= 90 && avg > 80)
				grade = 'B';
			else
				if(avg <= 80 && avg > 70)
					grade = 'C';
				else
					if(avg <= 70 && avg > 60)
						grade = 'D';
					else
						if(avg <= 60 && avg > 50)
							grade = 'E';
						else
							grade = 'F';
	}

	public void display()
	{
		super.display();
		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
		System.out.println("Grade: " + grade);
	}

}

class MainUniversity
{
	public static void main(String args[])
	{
		Result r = new Result();
		r.get_data();
		r.calculateResult();
		r.display();
	}
}
