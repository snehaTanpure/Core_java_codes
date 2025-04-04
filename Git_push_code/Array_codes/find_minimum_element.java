package Array_codes;

/*
 * 3. Find Minimum Element in Array
Description: Find the smallest element in an array.


Input: [10, 20, 30, 5, 15]


Output: 5



 */


import java.util.Scanner;

public class find_minimum_element
{
	 public static void main (String x[])
	    {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter the size of Array");
	    	int n=s.nextInt();
	    	
	    	System.out.println("enter the Array Element");
	    	int a[]=new int[n];
	    	
	    	
	    	for(int i=0;i<a.length;i++)
	    	{
	    	a[i]=s.nextInt();	
	    	}
	    	
	    	
	    	int min=a[0];
	    	
	    	for(int i=0;i<a.length;i++)
	    	{
	    	     if( a[i] < min)
	    	     {
	    	    	 min=a[i];
	    	     }
	    	}
	    	
	    	System.out.println("Minimum element is:"+min);
	    	
	    }
	    
}
