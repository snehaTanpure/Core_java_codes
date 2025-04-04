package Baisc_java_program;

import java.util.Scanner;

/*
 * 22. Print Triangle of Stars
Description: Write a program to print a triangle of stars.
Input: n = 4


Output:
*
**
***
****

 */

public class Print_triangle_star {
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the limit");
		int limit=s.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			for(int j=1;j<=limit;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
