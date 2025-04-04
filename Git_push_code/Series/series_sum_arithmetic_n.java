/*
Calculate the sum of the first N terms of an arithmetic series.

Input: 1 2 3 4 5 6 7
Output:28
*/


import java.util.*;
public class series_sum_arithmetic_n
{
  public static void main (String x[])
  {
    Scanner s=new Scanner(System.in);
	
	System.out.println("ENter the N terms");
	int n=s.nextInt();
	
	System.out.println("ENter the Diffrence:");
	int diff=s.nextInt();
	
	
	int sum=0,c=0;
	
	for(int i=1;i<=n;i++)
	{
		
	  System.out.print(c+" ");	  
	  sum=sum+c;
	  c=c+diff;
	}
  
     System.out.println("\n Sum of Arithmetic series:"+sum);
  }
}


/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java series_sum_arithmetic_n

ENter the N terms
10

ENter the Diffrence:
2

0 2 4 6 8 10 12 14 16 18

Sum of Arithmetic series:90

*/