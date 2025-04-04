package Baisc_java_program;

/*
 * 45. Multiplication of Digits
Description: Write a program to calculate the multiplication of digits of a number.
Input: n = 123


Output: 6

 */

import java.util.*;
public class Multiplication_of_digit {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the Number");
		int num=s.nextInt();
		
		
		int rem=0;
		int mul=1;
		
		while(num!=0)
		{
		   rem=num%10;
		   num=num/10;
		   
		   
		   mul=mul*rem;
		   
		   
		}
		
		System.out.println("multiplication of digits of a number :"+mul);
		
	}

}
