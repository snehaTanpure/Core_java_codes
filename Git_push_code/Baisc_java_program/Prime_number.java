package Baisc_java_program;


/*
 * 
 * 4. Prime Numbers
Description: Write a program to print all prime numbers up to a given number n.
Input: n = 10


Output: 2 3 5 7



 */


import java.util.*;
public class Prime_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=s.nextInt();
		
		
		System.out.println(" ! UP to n prime number");
		
		int n=2;
		
		while(n<=limit)
		{
			int count=0;
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count=1;
				}
			}
			
			if(count==0)
			{
				System.out.println(n);
			}
			
			
			n++;
		}
		
	}

}
