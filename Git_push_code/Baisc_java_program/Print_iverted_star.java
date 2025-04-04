package Baisc_java_program;

import java.util.Scanner;

/*
 * 23. Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4


Output:
 ****
***
**
*

 */


public class Print_iverted_star {

	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENter the limit");
		int limit=s.nextInt();
		
		
		for(int i=1;i<=limit;i++)
		{
			for(int j=1;j<=limit;j++)
			{
				if(j<=(limit+1)-i)
				{
				System.out.printf("*");
				}
			}
			System.out.println();
		}
		
	}
}
