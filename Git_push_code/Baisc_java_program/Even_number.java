package Baisc_java_program;

/*
 * 11. Even Numbers
Description: Write a program to print all even numbers between 1 and n.
Input: n = 10


Output: 2 4 6 8 10



 */


import java.util.*;
public class Even_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
