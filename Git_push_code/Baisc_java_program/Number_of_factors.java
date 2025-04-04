package Baisc_java_program;

/*
 * 58. Number of Factors
Description: Write a program to count the number of factors of a number.
Input: n = 12


Output: 6

 */

import java.util.*;
public class Number_of_factors
{
   public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the Number");
	   int num=s.nextInt();
	   
	   int count=0;
	   
	   for(int i=1;i<=num;i++)
	   {
		   if(num%i==0)
		   {
			   System.out.println(i);
			   count++;
		   }
	   }
	   
	   System.out.println("count the number of factors of a number:"+count);
	   
	   
   }
}
