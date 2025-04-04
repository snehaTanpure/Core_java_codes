package Baisc_java_program;

/*
 
 * 1. Sum of Numbers
Description: Write a program to calculate the sum of numbers from 1 to n.
Input: n = 5


Output: 15



 */


import java.util.Scanner;

public class Sum_of_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		
		int sum=0;
		for(int i=1;i<=limit;i++)
		{
			
			sum=sum+i;
			
		}
		
		System.out.println(sum);
	}

}
