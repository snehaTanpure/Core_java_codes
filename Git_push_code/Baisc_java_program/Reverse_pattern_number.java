package Baisc_java_program;

/*
 * 21. Reverse Pattern of Numbers
Description: Write a program to print numbers in reverse order.
Input: n = 5


Output:
 5 4 3 2 1

 */

import java.util.Scanner;

public class Reverse_pattern_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the limit");
		int limit=s.nextInt();
		
		for(int i=limit;i<0;i--)
		{
			System.out.println(i);
		}
		
	}

}
