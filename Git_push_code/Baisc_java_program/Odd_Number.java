package Baisc_java_program;

import java.util.Scanner;

/*
 * 12. Odd Numbers
Description: Write a program to print all odd numbers between 1 and n.
Input: n = 10


Output: 1 3 5 7 9



 */



public class Odd_Number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the number");
		int limit=s.nextInt();
		
		
		for(int i=0;i<=limit;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

}
