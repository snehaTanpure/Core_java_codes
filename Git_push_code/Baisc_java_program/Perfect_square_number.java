package Baisc_java_program;

/*
 * 49. Perfect Square Numbers
Description: Write a program to find perfect square numbers up to n.
Input: n = 20


Output: 1 4 9 16


 */

import java.util.*;
public class Perfect_square_number 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		int squ=1;
		
		for(int i=1;i<=limit;i++)
		{
			squ=i*i;
			
			if(squ<limit)
			{
				System.out.println(squ);
			}
		}
		
		
	}

}
