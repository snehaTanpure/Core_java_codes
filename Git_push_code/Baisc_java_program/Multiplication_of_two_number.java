package Baisc_java_program;

/*
 * 26. Multiplication of Two Numbers
Description: Write a program to multiply two numbers using loops.
Input: a = 3, b = 5


Output: 15



 */


import java.util.*;
public class Multiplication_of_two_number
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the start ");
		int s1=s.nextInt();
		
		System.out.println("Enter the end ");
		int s2=s.nextInt();
		
		
		
		int mul=0;
		
		for(int i=1;i<=s2;i++)
		{
			mul=s1*i;
			
		}
		
		System.out.println(mul);
		
	}

}
