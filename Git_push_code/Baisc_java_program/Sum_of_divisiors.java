package Baisc_java_program;

import java.util.Scanner;

/*
 * 57. Sum of Divisors
Description: Write a program to calculate the sum of divisors of a number.
Input: n = 12


Output: 28

 */

public class Sum_of_divisiors 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		
		System.out.println("sum of divisors of a number :"+sum);

	}

}
