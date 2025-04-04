package Array_codes;

import java.util.Scanner;

/*
 * 4. Sum of Elements in Array
Description: Calculate the sum of all elements in an array.


Input: [1, 2, 3, 4, 5]


Output: 15

 */



import java.util.*;
public class Sum_of_element_in_Array 
{
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n=s.nextInt();
		
		System.out.println("Enter the Array Element");
		int a[]=new int[n];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of Array is:"+sum);
		
	}
}
