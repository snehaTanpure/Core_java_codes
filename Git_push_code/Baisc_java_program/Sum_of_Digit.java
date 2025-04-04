package Baisc_java_program;
/*
 * 9. Sum of Digits
Description: Write a program to calculate the sum of digits of a given number.
Input: n = 234


Output: 9



 */

import java.util.*;
public class Sum_of_Digit {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=s.nextInt();
		
		
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			
			sum=sum+rem;
		}
		
		System.out.println("Sum of digit is :"+sum);
		
	}

}
