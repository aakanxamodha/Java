//Java 7

/*The first line contains a string denoting s.
The second line contains an integer denoting k.

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i=1; i<=s.length()-k; i++)
        {
            String substr = s.substring(i, i+k);
            if(substr.compareTo(smallest) < 0)
            {
                smallest = substr;
            }
            
            if(substr.compareTo(largest) > 0)
            {
                largest = substr;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
