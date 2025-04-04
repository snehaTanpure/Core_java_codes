package Baisc_java_program;

/*
 * 36. Check for Odd or Even
Description: Write a program to check whether a given number is odd or even.
Input: n = 4


Output: Even

 */

import java.util.*;
public class Check_even_odd {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the number");
		int num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("NUmber is Even");
		}
		else
		{
			System.out.println("NUmber is Odd");
		}
	}

}
