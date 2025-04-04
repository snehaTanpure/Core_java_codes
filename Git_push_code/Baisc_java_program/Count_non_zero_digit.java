package Baisc_java_program;

/*
 * 47. Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203


Output: 3

 */

import java.util.*;
public class Count_non_zero_digit 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=s.nextInt();
		
		int count=0;
		int rem=0;
		
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			
			if(rem!=0)
			{
				count++;
			}
			
			
		}
		
		System.out.println("count the number of non-zero digits in a number:"+count);
	}

}
