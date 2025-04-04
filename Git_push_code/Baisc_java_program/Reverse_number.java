package Baisc_java_program;
/*
 * 7. Reverse a Number
Description: Write a program to reverse the digits of a given number.
Input: n = 12345


Output: 54321



 */



import java.util.*;
public class Reverse_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int num=s.nextInt();
		
		
		int rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		
		
		System.out.println("After reverse number is :"+rev);
	}

}
