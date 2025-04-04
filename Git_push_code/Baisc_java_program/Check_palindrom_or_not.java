package Baisc_java_program;

/*
 * 5. Palindrome Number
Description: Write a program to check if a number is a palindrome.
Input: n = 121


Output: Palindrome



 */

import java.util.*;
public class Check_palindrom_or_not {
         
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int temp=num;
		
		int rem=0,rev=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
		System.out.println("After reverse is:"+rev);
		
		
		if(temp==rev)
		{
			System.out.println(" ! number is palindrom");
		}
		else
		{
			System.out.println(" ! number is Not palindrom");
		}
		
	}
 
}
