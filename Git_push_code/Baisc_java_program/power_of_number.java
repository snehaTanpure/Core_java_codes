package Baisc_java_program;

/*
 * 60. Power of a Number
Description: Write a program to calculate the power of a number x^y.
Input: x = 2, y = 3


Output: 8

 */


import java.util.*;
public class power_of_number
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base=s.nextInt();
		
		int power=1;
		
		System.out.println("Enter the index");
		int index=s.nextInt();
		
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		
		System.out.println(" power of a number x^y. :"+power);
		
	}

}
