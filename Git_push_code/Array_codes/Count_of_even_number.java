package Array_codes;

import java.util.Scanner;

/*
 * 6. Count Even Numbers in Array
Description: Count how many even numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3

 */


public class Count_of_even_number {

	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the Size of Array:");
		int n=s.nextInt();
		
		
		System.out.println("Enter the Array Element :");
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) 
		{
		   a[i]=s.nextInt();
		}

		
		int count=0;
		for(int i=0;i<a.length;i++) 
		{
		   if(a[i]%2==0)
		   {
			  ++count;   
		   }
		}


		System.out.println("COunt of odd number is:"+count);
			
		
	}

	
}
