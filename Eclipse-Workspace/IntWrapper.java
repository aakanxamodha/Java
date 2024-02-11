/*Develop java code that uses various instance and static methods of integer wrapper class.*/

public class IntWrapper {

	public static void main(String[] args) {
		
		System.out.println("Instance methods of Integer Wrapper Class: ");
		Integer obj = new Integer(12);
		System.out.println("Value: " + obj);
		System.out.println("Binary : " + obj.toBinaryString(obj));
		System.out.println("Octal : " + obj.toOctalString(obj));

		System.out.println();
		System.out.println("Static method of Integer Wrapper Class: ");
		Integer i = 100;
        	System.out.println(i.getClass());
        	System.out.println(i);
	}

}
