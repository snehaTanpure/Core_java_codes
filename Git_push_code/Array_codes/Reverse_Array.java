package Array_codes;

/*
 * 1. Reverse an Array
Description: Reverse the order of elements in an array.


Input: [1, 2, 3, 4, 5]


Output: [5, 4, 3, 2, 1]

 */

import java.util.*;
public class Reverse_Array 
{
   public static void main (String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("ENter the Array Size");
	   int n=s.nextInt();
	   
	   System.out.println("Enter the Array Element");
	   int arr[]=new int[n];
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   
	   
	   System.out.println("After Array Reverse");
	   
	   for(int i=arr.length-1;i>=0;i--)
	   {
		   System.out.print(" "+arr[i]);
	   }
	   
	   
	   
   }
}
