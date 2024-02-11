/*Develop java code to define inheritance using above classes for the following.
 1) Inherit student from person
 2) Read the values for five students
 3) Calculate total marks, avg and grade
 4) Display details of all students */

package InheriDemo;

public class Person 
{
		public String name[] = new String[5];
		public String bdate[] = new String[5];
		public String gender[] = new String[5];
		
		public int[] sem = new int[5];
		public int[] m1 = new int[5];
		public int[] m2 = new int[5];
		public int[] m3 = new int[5];

		public int i, j, namelen;
		public float[] avg = new float[5];
		
		public char[] grade = new char[5];
}
