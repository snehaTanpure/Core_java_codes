package Baisc_java_program;

import java.util.Scanner;

/*
 * 10. Count Digits
Description: Write a program to count the number of digits in a number n.
Input: n = 12345


Output: 5



 */

public class Count_of_digit {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=s.nextInt();
		
		
		int rem=0,count=0;
		while(num>0)
		{
			
			num=num/10;
			count++;
			
		}
		
		System.out.println("Count of Digit:" +count);
	}

}
