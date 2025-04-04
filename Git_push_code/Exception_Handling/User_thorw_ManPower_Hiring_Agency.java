/*
Example: Suppose consider we are developing project for ManPower Hiring Agency 
Means Goal of our project maintain smooth recruitment process but the clause or rule is employee age should be greater than 15 
*/


import java.util.*;
class  AgeNotSufficient extends RuntimeException
{
	private String message;
	
	AgeNotSufficient(String message)
	{
		this.message=message;
	}
	
    public String getMessage()
    {
	  return message;
	}	
	
}

class checkAge
{
    void setage(int age)
	{
	 
	  if(age <=15)
	  {
	   throw new AgeNotSufficient("Your age is not Suitable:" +age);
	  }
	  else
	  {
		  System.out.println("on boarding process start:");
	  }
	 
	}
}

public class User_thorw_ManPower_Hiring_Agency
{
  public static void main(String x[])
  {
     Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter the age");
	 int age=s.nextInt();
	 
	 
	 
	 try
	 {
		checkAge c=new checkAge();
	    c.setage(age);
	 }
	 catch(AgeNotSufficient a)
	 {
	  System.out.println(a.getMessage());
	 }
	 
	 
  }
} 