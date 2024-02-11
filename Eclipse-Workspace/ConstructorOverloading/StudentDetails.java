/*Develop java code using above classes to demonstrate constructor overloading.*/

package ConsOve;

public class StudentDetails 
{
	   private int stuID;
	   private String stuName;
	   private int stuAge;
	   StudentDetails()
	   {
	       stuID = 1;
	       stuName = "Spencer";
	       stuAge = 20;
	   }
	   StudentDetails(int num1, String str, int num2)
	   {
	       
	       stuID = num1;
	       stuName = str;
	       stuAge = num2;
	   }
	   
	   
	   public int getStuID() 
	   {
	       return stuID;
	   }
	   public void setStuID(int stuID) 
	   {
	       this.stuID = stuID;
	   }
	   public String getStuName() 
	   {
	       return stuName;
	   }
	   public void setStuName(String stuName) 
	   {
	       this.stuName = stuName;
	   }
	   public int getStuAge() 
	   {
	       return stuAge;
	   }
	   public void setStuAge(int stuAge) 
	   {
	       this.stuAge = stuAge;
	   }
}