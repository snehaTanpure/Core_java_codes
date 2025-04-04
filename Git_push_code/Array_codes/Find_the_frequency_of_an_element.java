package Array_codes;

/*
 * 7. Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.


Input: [1, 2, 2, 3, 4, 2, 5], element 2


Output: 3



 */


import java.util.Scanner;

public class Find_the_frequency_of_an_element {
	
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

		
		System.out.println("Enter the Appear Element");
		int ele=s.nextInt();
		
		 
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(ele==a[i])
			{
				count++;
			}
		}
		
		
		System.out.println(" Frequency  of element appears in an array:"+count);
		
		
	}
}
