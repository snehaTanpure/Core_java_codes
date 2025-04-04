package Baisc_java_program;


/*
 * 37. Print Square Star Pattern
Description: Write a program to print a square pattern using stars.
Input: n = 4


Output:

 markdown
Copy
****
****
****

 */

import java.util.Scanner;

public class Print_Square_star_pattern {

	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the limit");
		int limit=s.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			for(int j=1;j<=limit;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}
