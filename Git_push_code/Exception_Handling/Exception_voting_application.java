/*
Suppose consider we are working voting application and we have one voting machine and we want to provide age of voter to voting machine but if age is less than 18 then voting should generate run time error or throw run time error you are not eligible for voting otherwise accept the vote.
 
*/

import java.util.*;
class VotingApplication extends RuntimeException
{
    public String message;
	
   VotingApplication(String message)
   {
     this.message=message;
   }
   
   public String getErrMessage()
   {
    return message;
   }
}


class Voter
{
  
  void EligibleVoter(int age)
   {
      if(age>=18)
	  {
	    throw new VotingApplication("Your are eligible for Voting:"+age);
	  }
	  else
	  {
	   System.out.println("Your are not  eligible for Voting:" +age);
	  }
   }
}

public class Exception_voting_application
{
  public static void main (String x[])
  {
  
  Scanner s=new Scanner(System.in);
  
  System.out.println("ENter the Age:"); //take the input 
  int age=s.nextInt();
   
  try
  {
  
   Voter v=new Voter();
   v.EligibleVoter(age);
   
  }
  catch(VotingApplication ex)
  {
    System.out.println(ex.getErrMessage());
  }
  
  }

}