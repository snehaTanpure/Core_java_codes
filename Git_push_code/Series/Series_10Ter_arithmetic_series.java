/*
Series Assignments:
Print the first 10 terms of the arithmetic series with a common difference of 3.

Output:0 3 6 9 12 15 18 21 24 27 30 

*/


public class Series_10Ter_arithmetic_series
{
  public static void main (String x[])
  {
  
     int sum=1;
    
     for(int i=1;i<=10;i++)
	 {
	  
	  System.out.print(" "+sum);
	  sum=sum+3;
	 }
	 
	
  }

}


/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_10Ter_arithmetic_series

 3 6 9 12 15 18 21 24 27 30
 
 
 C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_10Ter_arithmetic_series
 
 
 1 4 7 10 13 16 19 22 25 28
 */