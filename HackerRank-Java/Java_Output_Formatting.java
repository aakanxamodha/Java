//Java 7

/*Every line of input will contain a String followed by an integer. Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.*/

/*Sample Input
java 100
cpp 65
python 50*/

/*Sample Output

================================
java           100 
cpp            065 
python         050 
================================*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s, x);
            }
            System.out.println("================================");

    }
}
