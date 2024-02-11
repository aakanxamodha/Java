/* Develop java code that demonstrate any five methods of String class. */

import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Method 1: toLowerCase() :-");
		System.out.println("Enter a String in Upper Case: ");
		String str1 = sc.next();
		System.out.println("String in Lower Case: " + str1.toLowerCase());
		
		System.out.println();
		System.out.println("Method 2: toUpperCase() :-");
		System.out.println("Enter a String in Lower Case: ");
		String str2 = sc.next();
		System.out.println("String in Upper Case: " + str2.toUpperCase());
		
		System.out.println();
		System.out.println("Method 3: trim() :-");
		System.out.println("Enter a String: ");
		String str3 = sc.next();
		System.out.println("Trimmed String: " + str3.trim());
		
		System.out.println();
		System.out.println("Method 4: length() :-");
		String s = "This is Java.";
		System.out.println("String Length: " + s.length());
		
		System.out.println();
	    	System.out.println("Method 5: replace() :-");
		String s1 = "This is Java.";
		System.out.println("Replaced String: " + s1.replace("J", "G"));
	}

}
