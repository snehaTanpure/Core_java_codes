package Array_codes;

/*
 * 5. Count Odd Numbers in Array
Description: Count how many odd numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3

 */


import java.util.*;
public class Count_of_odd_number_in_Array {
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
		   if(a[i]%2==1)
		   {
			  count++;   
		   }
		}


		System.out.println("COunt of odd number is:"+count);
			
		
	}

}
