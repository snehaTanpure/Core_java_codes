package Baisc_java_program;

/*
 * 31. Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3

1+8+

2*2*2

Output: 36



 */

import java.util.*;
public class Sum_cubes_of_first_n_natural_number {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=s.nextInt();
		
		int sum=0;
		int no=1;
		while(no<=limit)
		{	
		
			int cube=1;
		
		for(int i=1;i<=3;i++)
		{
		   cube=cube*no;
		}
		
		System.out.println("Cube is:"+cube);
		sum=sum+cube;
		
		no++;
		}
		
		
		System.out.println("Sum of Cubes of First N Natural Numbers:"+sum);
		
		}
		
	}
	


