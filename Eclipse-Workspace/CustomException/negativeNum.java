/*Develop java code to demonstrate Custom Exception to manage negative 
numbers.*/


package custExp;

class negativeNum extends Exception
{
	String str = "";
	public negativeNum(String str) 
	{
		this.str = str;
	}
	public String toString()
	{
		return str;
	}
}
