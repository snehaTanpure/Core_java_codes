/*
Print the sum of squares of the first N numbers (e.g., 1^2 + 2^2 + 3^2 + ...).

*/


import java.util.*;
public class series_Squere_sum_n
{
  public static void main (String x[])
  {
    Scanner s=new Scanner(System.in);
	System.out.println("ENter the N terms");
	int n=s.nextInt();
	
	int mul=1,sum=0;
	
	
	
	System.out.println("Series of Square");
	for(int i=1;i<=n;i++)
	{
	  mul=i*i;
	  
	  System.out.print(" "+mul);
		
	  sum=sum+mul;
	}
  
     System.out.println(" \n Sum of Arithmetic series:"+sum);
  }
}


/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java series_Squere_sum_n
ENter the N terms
5
Series of Squre
 1 4 9 16 25
 Sum of Arithmetic series:55

*/