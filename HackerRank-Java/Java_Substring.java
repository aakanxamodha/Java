//Java 7

/*Print the substring in the inclusive range from start to end - 1.

Sample Input
Helloworld
3 7

Sample Output
lowo*/

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String str = S.substring(start, end);
        System.out.println(str);
    }
}
