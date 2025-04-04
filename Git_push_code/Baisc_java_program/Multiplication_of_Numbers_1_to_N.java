package Baisc_java_program;

/*
 * 32. Multiplication of Numbers from 1 to N
Description: Write a program to find the multiplication of all numbers from 1 to n.
Input: n = 4


Output: 24

*/


import java.util.*;
public class Multiplication_of_Numbers_1_to_N {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		
		int mul=1;
		
		for(int i=1;i<=limit;i++)
		{
			mul=mul*i;
		}
		
		System.out.println("multiplication of all numbers from 1 to n::"+mul);
			
		
		
	}

}
