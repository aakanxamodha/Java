/*Develop java code that demonstrate usage of date class. */

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println("Date of today: " + d1);
		
		Date d2 = new Date(0);
		System.out.println("Default Date: " + d2);
	}

}
