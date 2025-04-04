package Baisc_java_program;


/*
 * 

13. Sort Array in Ascending Order
Description: Sort the elements of the array in ascending order.


Input: [10, 2, 30, 4, 5]


Output: [2, 4, 5, 10, 30]

 */



import java.util.*;
public class sort_Array_in_Ascending_order {

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
		
		
		 System.out.println("After Asending order");
		 for(int i=0;i<a.length;i++)
		 {
		    for(int j=i+1;j<a.length;j++)
		   {
		      if(a[j]<a[i])
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
