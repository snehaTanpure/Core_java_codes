/*

Calculate the sum of the first N terms of a geometric series.

Input:1 2 4 8 16 

*/


import java.util.*;
public class series_sum_geometric_n
{
  public static void main (String x[])
  {
    Scanner s=new Scanner(System.in);
	System.out.println("ENter the N terms");
	int n=s.nextInt();
	
	System.out.println("Enter ratio for geometric series:");
	int diff=s.nextInt();
		

	
	int mul=1,sum=0;
	
	for(int i=1;i<=n;i++)
	{
	
	  System.out.print(" "+mul);
		
	  sum=sum+mul;
	  
	  mul=mul*diff;
	  
	}
  
     System.out.println(" \n Sum of geometric series:"+sum);
  }
}


    
/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java series_sum_geometric_n

ENter the N terms
10
Enter ratio for geometric series:
3

1 3 9 27 81 243 729 2187 6561 19683

Sum of geometric series:29524

*/
