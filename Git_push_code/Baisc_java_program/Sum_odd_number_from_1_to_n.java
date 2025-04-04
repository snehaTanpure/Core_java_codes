package Baisc_java_program;


/*
 * 41. Sum of Odd Numbers from 1 to N
Description: Write a program to calculate the sum of all odd numbers from 1 to n.
Input: n = 7

Output: 16

*/

import java.util.Scanner;

public class Sum_odd_number_from_1_to_n {
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		
		int sum=0;
		
		for(int i=1;i<=limit;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Sum of Odd Numbers from 1 to N:"+sum);
		
	}

}
