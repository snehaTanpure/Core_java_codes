package Array_codes;

/*
 * 15. Rotate Array by N Positions
Description: Rotate the array by n positions to the right.


Input: [1, 2, 3, 4, 5], n = 2


Output: [4, 5, 1, 2, 3]

 */

import java.util.*;
public class rotate_Array_n_position {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		System.out.println("Enter the Array Element:");
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		
		System.out.println("Enter the N rotate position:");
		int pos=s.nextInt();
		
		int first=a[0];
		 for(int j=0;j<pos;j++)
		   {
		      
		    first=a[0];
		    for(int i=0;i<a.length-2;i++)
		       {
		        a[i]=a[i+1];
		       }
		        a[a.length-2]=first;
		       
		   }
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		
	}

}
