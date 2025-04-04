package Array_codes;


/*
 * 8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.


Input: [10, 20, 30, 40, 50]


Output: 40



 */


import java.util.*;
public class Find_second_largest_element
{
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
		
		
		int max=0;
	    int max1=0;
	   
	   for(int i=0;i<a.length;i++)   //Find the MAx element
	   {
	    
		   if(a[i]>max)
		   {
		     max=a[i];
		   }
		 
	   }
	   

	    for(int i=0;i<a.length;i++)  // compare the secound highest
		{
			 if(max>a[i] && max1<a[i])
		      {
			     max1=a[i];
		      }	 
		}
		
		System.out.println("Secound maximum value is:"+max1);
}
}
