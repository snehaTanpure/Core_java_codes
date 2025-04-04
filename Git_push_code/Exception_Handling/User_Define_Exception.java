/*
Q1. WAP to handle the exception by using throw clause?
*/

import java.util.*;

class InsufficiantAmount extends RuntimeException
{
   String getErrorMessage()
   {
    return "You have insufficicent balance ";
   }
   
}

class WithdrawAmount
{
    private int balance ;
   
    void setBalance(int balance)
	{
	 this.balance=balance;
	}

    void Withdraw(int amount)
  {
    if(amount > balance)
	{
	  throw new InsufficiantAmount();
	}
	else
	{
	 balance=balance-amount;
	}

  }
  
   int getBalance()
   {
    return balance ;
   }
	
	
}

public class User_Define_Exception
{
  public static void main(String x[])
  {
     Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter the Balance");
	 int balance=s.nextInt();
	 
	 System.out.println("Enter the Amount");
	 int amount=s.nextInt();
	 
	 WithdrawAmount w=new WithdrawAmount();
	 w.setBalance(balance);
	 
	 
	 System.out.println("Before withdraw Amount "+w.getBalance());
	 try
	 {
	     w.Withdraw(amount);
		 int result=w.getBalance();
		 System.out.println("After Withdraw Amount"+result);
	 }
	 catch(InsufficiantAmount e)
	 {
	   System.out.println(e.getErrorMessage());
	 }
	 
  }
}