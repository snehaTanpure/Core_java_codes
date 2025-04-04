package Baisc_java_program;


/*
 * 34. Find Sum of All Odd Numbers in a Range
Description: Write a program to find the sum of all odd numbers in a range from m to n.
Input: m = 1, n = 10


Output: 25

 */

import java.util.Scanner;

public class Find_sum_of_All_odd_no_in_range {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the M range");
		int m=s.nextInt();
		
		
		System.out.println("Enter the N range");
		int n=s.nextInt();
		
		
		int sum=0;
		
		for(int i=m;i<=n;i++)
		{
		      if(i%2==1)
		      {
		    	  sum=sum+i;
		      }
		}
		
		System.out.println("sum of all odd numbers in a range from m to n="+sum);
		
		
	}

}
