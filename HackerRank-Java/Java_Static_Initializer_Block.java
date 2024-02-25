//Java 7

/*There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean flag;
    static int B, H;
    
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        
        if(B <= 0 || H <= 0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            flag = true;
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
