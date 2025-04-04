package Baisc_java_program;


/*
 * 46. Print Decreasing Number Pattern
Description: Write a program to print a decreasing number pattern.
Input: n = 5


Output:

 
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

 */

import java.util.*;
public class Print_decreasing_number_pattern {

	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		 System.out.println("Enter the lim1 ");
		 int lim1 =s.nextInt();
		 
		 System.out.println("Enter the lim2 ");
		 int lim2 =s.nextInt();
		 
		
		 
		for(int i=1;i<=lim1;i++)
		{
		    int c=(lim1+1)-i;
			 
			for(int j=1;j<=lim2;j++)
			{
			  if(j<=(lim1+1)-i)
			  {
				  System.out.printf("%d",c);
				  c--;
			  }
			  else
			  {
				  System.out.print(" ");
			  }
			}
 
			System.out.println();
	   }
		
		
		
	}
}
