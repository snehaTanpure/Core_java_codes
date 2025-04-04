package Baisc_java_program;
/*
 * 15. Find Maximum Number
Description: Write a program to find the maximum number between two numbers.
Input: a = 10, b = 20


Output: 20

 */



import java.util.*;
public class Find_maximum_number {
	
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a=s.nextInt();
		
		
		System.out.println("Enter the Secound Value");
		int b=s.nextInt();
		
		
		if(a>b)
		{
			System.out.println("Greater number is :"+a);
		}
		else
		{
			System.out.println("Greater number is :"+b);
		}
		
	}

}
