package Array_codes;


/*
 * 9. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.


Input: [1, 2, 3, 4], [3, 4, 5, 6]


Output: [3, 4]



 */


import java.util.*;
public class find_the_common_element_in_two_Array 
{

	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the Size of Array:");
		int n=s.nextInt();
		
		System.out.println("ENter the Size of Array:");
		int n1=s.nextInt();
		
		
		System.out.println("Enter the first Array Element :");
		int a[]=new int[n];
		
		
		for(int i=0;i<a.length;i++) 
		{
		   a[i]=s.nextInt();
		}
	
		
		System.out.println("Enter the secound Array Element :");
		int b[]=new int[n1];
		
		
		for(int i=0;i<b.length;i++) 
		{
		   b[i]=s.nextInt();
		}
	
		
		System.out.println("Common element of Two Array is");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
		       if(a[i]==b[j])
		      {
			   System.out.println(a[i]);
			   
		      }
			}
		   
		}
	
		
		
	}
	
}
