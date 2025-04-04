package Array_codes;
/*
 * 2. Find Maximum Element in Array
Description: Find the largest element in an array.


Input: [12, 34, 56, 78, 23]


Output: 78

 */


import java.util.*;
public class Find_maximum_element_in_array 
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
    	
    	
    	int max=0;
    	
    	for(int i=0;i<a.length;i++)
    	{
    	     if(a[i]>max)
    	     {
    	    	 max=a[i];
    	     }
    	}
    	
    	System.out.println("Maximum element is:"+max);
    	
    }
    
}
