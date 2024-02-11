/*Develop java code to demonstrate the StringTokenizer to split "hello; i: study; in: 
 Bhavan's; Shree: H.J.; Doshi; IT: Institude", use delimeters ':' and ';'. */

import java.util.StringTokenizer;

public class StrTok {

	public static void main(String[] args) {
		
		String str = "hello; i: study; in: Bhavan's; Shree: H.J.; Doshi; IT: Institude";
		
		StringTokenizer st = new StringTokenizer(str, ": ;");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
