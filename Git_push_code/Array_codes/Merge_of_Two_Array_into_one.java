package Array_codes;

/*
 * 10. Merge Two Arrays
Description: Merge two arrays into one.


Input: [1, 2, 3], [4, 5, 6]


Output: [1, 2, 3, 4, 5, 6]



 */


import java.util.*;
public class Merge_of_Two_Array_into_one {

	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the First Size of Array:");
		int n=s.nextInt();
		
		System.out.println("ENter the secound Size of Array:");
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
		
		
		
		int c[]=new int[n+n1];
		int k=0;
		
		for(int i=0;i<a.length;i++) 
		{
		  c[k]=a[i];
		   k++;
		}
	
		
		for(int i=0;i<b.length;i++) 
		{
		  c[k]=b[i];
		   k++;
		}
	
		
		System.out.println("After merging the Array");
		for(int i=0;i<c.length;i++) 
		{
		  System.out.print(" "+c[i]);
		}
	
		
		
		
		
	}
}
