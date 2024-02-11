package custExp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = -1;
		try
		{
			if(n<0)
			{
				throw new negativeNum("Value is negative");
			}			
		}
		catch (negativeNum nn)
		{
			System.out.println(nn.toString());
		}		
	}

}
