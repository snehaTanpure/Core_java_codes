/*
Print the first 10 terms of the geometric series with a ratio of 2.

output:1 2 4 8 16 32 64 

*/

public class Series_10Ter_geometric_series
{
  public static void main (String x[])
  {
  
   int  mul=1;
   
     for(int i=1;i<=10;i++)
	 {
		
		System.out.print(" "+mul);
		
		mul=mul*2;
	
	 }
	 
	
  }

}


/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_10Ter_geometric_series
 1 2 4 8 16 32 64 128 256 512
 
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>


*/