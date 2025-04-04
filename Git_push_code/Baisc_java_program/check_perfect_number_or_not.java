package Baisc_java_program;

/*
 * 30. Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6


Output: Perfect

 */

import java.util.Scanner;

public class check_perfect_number_or_not {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=s.nextInt();
		
		
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Sum is:"+sum);
		
		
		if(sum==num)
		{
			System.out.println("! Number is perfect");
		}
		else
		{
			System.out.println("! Number is Not perfect");
		}
			
			
		
		
	}

}
