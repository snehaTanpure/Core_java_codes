package Baisc_java_program;

/*
 * 48. Sum of First N Divisible by 3
Description: Write a program to calculate the sum of the first n numbers divisible by 3.
Input: n = 4


Output: 18

 */


import java.util.*;
public class Sum_of_first_N_divisible_by_3 
{
   public static void main (String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the limit");
	   int limit=s.nextInt();
	   
	   
	   int count=0;
	   int sum=0;
	   
	   int i=1;
	   while(count<limit)
	   {
		   if(i%3==0)
		   {
			   sum=sum+i;
			   count++;
		   }
		 
		   i++;
	   }
	   
	   
	   System.out.println("sum of the first n numbers divisible by 3.:"+sum);
	   
	  
   }
}
