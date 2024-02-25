//Java 7

/*Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int i, n, ans = 0;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i=1; i<11; i++)
        {
            ans = i * n;
            System.out.println(n + " x " + i + " = " + ans);
        }
        
    }
}
