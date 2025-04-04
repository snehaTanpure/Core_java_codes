package Array_codes;
/*
 * 17. Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.


Input: [1, 2, 4, 5]


Output: 3

 */


import java.util.*;
public class Find_missing_Number_in_Array {
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
		
		
		System.out.println("After find missing value");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
			System.out.print(" "+j);
			}
		}
		
	}

}
