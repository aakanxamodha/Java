//Java 7

/*Given a string A, print Yes if it is a palindrome, print No otherwise.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        String rev="";
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int length = A.length();

        for(int i = length - 1; i>= 0; i--)
        {
            rev = rev + A.charAt(i);
        }
        
        if(A.equals(rev))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
