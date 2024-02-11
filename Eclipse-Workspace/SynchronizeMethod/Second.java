package synMeth;

public class Second implements Runnable 
{

	String str;
	First target;
	Thread t;
		
	public Second(First targ, String s) 
	{
		target = targ;
		str = s;
		t = new Thread(this);
		t.start();		
	}
	
	@Override
	public void run() 
	{
		target.call(str);
	}

}
