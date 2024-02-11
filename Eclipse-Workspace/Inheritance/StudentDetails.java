package InheriDemo;

import java.util.Scanner;

public class StudentDetails extends Person 
{

	public void stud()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=4; i++)
		{
			System.out.println("Enter name: ");
			name[i] = sc.next();
			
			System.out.println("Enter Bdate: ");
			bdate[i] = sc.next();
			
			System.out.println("Enter Semester: ");
			sem[i] = sc.nextInt();
			
			System.out.println("Enter Mark 1: ");
			m1[i] = sc.nextInt();
			
			System.out.println("Enter Mark 2: ");
			m2[i] = sc.nextInt();
			
			System.out.println("Enter Mark 3: ");
			m3[i] = sc.nextInt();
			
			avg[i] = (m1[i] + m2[i] + m3[i]) / 3;
			
			if(avg[i] >70 )
				grade[i] = 'A';
			else 
				if(avg[i] > 60 && avg[i] < 70)
					grade[i] = 'B';
				else 
					if(avg[i] > 50 && avg[i] < 60)
						grade[i] = 'C';
					else 
						if(avg[i] > 40 && avg[i] < 50)
							grade[i] = 'D';
						else
							grade[i] = 'F';			
		}
	}
}
