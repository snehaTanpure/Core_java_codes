/*

Q1. WAP to handle the ArithmeticException ?

*/

import java.util.*;
public class Exception_handle_arithmaticexception
{
  public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("ENter the number:");
   int no=s.nextInt();
   int no1=s.nextInt();
   
   int div;
   
   try
   {
     
     div=no/no1;
	 System.out.println("Divivsion is:"+div);
     
   }
   catch(ArithmeticException ex)
   {
    System.out.println("Avoid second value as zero in division because it is infinity:"+ex);
   }
  
  
  
  
  }


}


