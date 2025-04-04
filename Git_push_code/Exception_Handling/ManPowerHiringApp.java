/*
Example: Suppose consider we are developing project for ManPower Hiring Agency 
Means Goal of our project maintain smooth recruitment process but the clause or rule is employee age should be greater than 15 

*/

class AgeVerificationExe extends RuntimeException
{
   private String message;
   AgeVerificationExe(String message)
   {
     this.message=message;
   }
   public String getErrMessage()
   {
    return message;
   }
}


class Hiring
{
  void checkAge(int age)
  {
   if(age<=15)
   {
   throw new AgeVerificationExe("your age is not suitable:" +age);
   }
   else
   {
   System.out.println("ON boarding process start");
   }
  
  }  
}


public class ManPowerHiringApp
{
 public static void main(String x[])
 {
  
  try
  {
    Hiring h=new Hiring();
	h.checkAge(10);
  }
  catch(AgeVerificationExe ex)
  {
    System.out.println("Error is "+ex.getErrMessage());
  }
  
 }

}
