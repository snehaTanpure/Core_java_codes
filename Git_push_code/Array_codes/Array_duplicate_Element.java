package Array_codes;

/*
 * 12. Find the Duplicate Elements in Array
 
Description: Find all the duplicate elements in an array.


Input: [1, 2, 3, 4, 5, 1, 3]


Output: [1, 3]

 */

import java.util.*;
public class Array_duplicate_Element 
{
	public static void main(String x[])
	   {
	     
		 Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int n=s.nextInt();
		
		
		
		System.out.println("Enter the Array Element");
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();
		}
		
		
			
		 System.out.println("Duplicate Element value");
		 for(int i=0;i<a.length;i++)
		 {
		    for(int j=i+1;j<a.length;j++)
		   {
		      if(a[i]==a[j])
			  {
			    System.out.println(a[i]);
			  }
		   }
		
		 }
		
		
		
		
	 }
	}
