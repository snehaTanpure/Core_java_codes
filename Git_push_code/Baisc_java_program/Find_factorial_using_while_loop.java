package Baisc_java_program;

/*
 * 42. Find the Factorial Using While Loop
Description: Write a program to calculate the factorial of a number using a while loop.
Input: n = 5


Output: 120



 */

import java.util.*;
public class Find_factorial_using_while_loop 
{
   public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=s.nextInt();
	   
	   int fact=1,sum=0;
	   
	   int no=1;
	   while(no<=num)
	   {
		   
		   fact=fact*no;
		     
		     no++;
	   }
	   
	   
	   System.out.println("factorial of number:"+fact);
	   
   }
}
