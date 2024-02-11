/* Develop a Java code to count the number of objects created of a given class. */

class ObjCount 
{
		static int num;
		int id;
	
		public ObjCount()
		{
			num++;
			id = num;
		}
		public void getID()
		{
			System.out.println("ID: "+ this.id);
		}

}
