package Baisc_java_program;


/*
 * 27. Sum of All Numbers in a Range
Description: Write a program to calculate the sum of all numbers between m and n.
Input: m = 1, n = 5


Output: 15

 */

import java.util.Scanner;

public class Sum_of_all_number_in_range 
{
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the m value");
		int m=s.nextInt();
		
		
		System.out.println("Enter the n value");
		int n=s.nextInt();
		
		
	int 	sum=0;
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of Digit is :"+sum);
		
		
	}

}
