/*Develop java code to demonstrate any five methods of string buffer class. */

public class FiveMethods {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println("Method 1: append()");
		System.out.println("Original string: Hello");
		sb1.append(" Java");
		System.out.println("Appended string : " + sb1);
		
		System.out.println();
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("Method 2: insert()");
		System.out.println("Original string: Hello");
		sb2.insert(1, "World");
		System.out.println("Inserted string : " + sb2);
		
		System.out.println();
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println("Method 3: replace()");
		System.out.println("Original string: Hello");
		sb3.replace(1, 3, "World");
		System.out.println("Replaced string : " + sb3);
		
		System.out.println();
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println("Method 4: delete()");
		System.out.println("Original string: Hello");
		sb4.delete(1, 3);
		System.out.println("Deleted string : " + sb4);
		
		System.out.println();
		StringBuffer sb5 = new StringBuffer("Hello");
		System.out.println("Method 5: reverse()");
		System.out.println("Original string: Hello");
		sb5.reverse();
		System.out.println("Reversed string : " + sb5);
		

	}

}
