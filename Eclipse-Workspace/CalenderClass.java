/*Develop java code to display current month name and year using calender class. */

import java.text.SimpleDateFormat;                           
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Year: " + cal.get(cal.YEAR));
		System.out.println("Current Month: " + cal.get(cal.MONTH));
		System.out.println("Month Name: " + new SimpleDateFormat("MMMMM").format(cal.getTime()));

	}

}
