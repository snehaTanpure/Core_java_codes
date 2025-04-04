package Baisc_java_program;

import java.util.Scanner;

/*
 * 8. Multiplication Table
Description: Write a program to print the multiplication table for a number n.
Input: n = 4


Output: 4 8 12 16 20



 */

public class Multiplication_table {
	
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		
		System.out.println("Multiplication of table is :");
		int mul=1;
		for(int i=1;i<=10;i++)
		{
			mul=num*i;
			
			System.out.println(mul);
		}
	}

}
