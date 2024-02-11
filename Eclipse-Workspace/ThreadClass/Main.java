package dwnld;

public class Main {

	public static void main(String[] args) 
	{
	

		download movie1 = new download("Movie 1");
		movie1.start();
		
		download movie2 = new download("Movie 2");
		movie2.start();
	}

}
