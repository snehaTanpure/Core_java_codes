package Baisc_java_program;

/*
 * 56. Count Numbers Divisible by 5
Description: Write a program to count the numbers divisible by 5 between 1 and n.
Input: n = 20


Output: 4

 */

import java.util.*;
public class count_divisible_by_5 
{
   public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the limit");
	   int limit=s.nextInt();
	   
	   int count=0;
	   int i=1;
	   
	   while(i<=limit)
	   {
		   
		   
		   if(i%5==0)
		   {
			   System.out.println(i);
			   count ++;
		   }
		   
		    
		   i++;
	   }
	   
	   
	   System.out.println("count the numbers divisible by 5 between 1 and n:"+count);
	   
   }
}
