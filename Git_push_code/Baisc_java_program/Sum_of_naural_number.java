package Baisc_java_program;

import java.util.Scanner;

/*
 * 14. Sum of Natural Numbers
Description: Write a program to find the sum of the first n natural numbers.
Input: n = 5


Output: 15

 */
public class Sum_of_naural_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Limit");
		int limit=s.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=limit;i++)
		{
		  sum=sum+i;	
		}
		
		System.out.println("Sum of natural number is:"+sum);
	}

}
