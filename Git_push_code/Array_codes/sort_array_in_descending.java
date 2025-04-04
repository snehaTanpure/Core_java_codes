package Array_codes;


/*
 * 14. Sort Array in Descending Order
Description: Sort the elements of the array in descending order.


Input: [10, 2, 30, 4, 5]


Output: [30, 10, 5, 4, 2]



 */

import java.util.Scanner;
public class sort_array_in_descending 
{
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
		
		
		 System.out.println("After descending order");
		 for(int i=0;i<a.length;i++)
		 {
		    for(int j=i+1;j<a.length;j++)
		   {
		      if(a[j]>a[i])
			  {
			    int temp=a[i];
			        a[i]=a[j];
			        a[j]=temp;
			  }
		   }
		
		 }
		
		 
		 for(int i=0;i<a.length;i++)
		 {
			System.out.print(" "+a[i]); 
		 }
		
	

}

}
