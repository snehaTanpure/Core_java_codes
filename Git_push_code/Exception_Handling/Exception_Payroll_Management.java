/*

Q3. Suppose consider we are working on Payroll Management software and we want to add Employee in database but if employee age is greater than 16 then we can add in database table and if employee age is less than 16 then system should generate the run time exception so you have to create user defined exception for handle above scenario?

*/

import java.util.*;
class payrollmanagement extends RuntimeException
{
    public String message;
	
	payrollmanagement(String message)
	{
	 this.message=message;
	}
	
	 public String getMessage()
	{
	return message;
	}

}

class Payroll
{
   void EmpPayroll(int age)
   {
     if(age>=16)
	 {
	 
	   throw  new payrollmanagement("Eligible candidate:");
	 }
	 else
	 {
	  System.out.println("Not Eligible Candidate");
	 }
   }

}

public class Exception_Payroll_Management
{
   public static void main(String x[])
   {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Age:");
	 int age=s.nextInt();
	 
	 try
	 {
	   Payroll p=new Payroll();
       p.EmpPayroll(age);
	   
	 }
	 catch(payrollmanagement ex)
	 {
	  System.out.println(ex.getMessage());
	 }
   
   }

} 