/*
Generate the first 10 terms of a Fibonacci series and print them.

Output:0 1 1 2 3 5 8 13 21 34 
*/

 public class Series_10Ter_Fibonacci_series
{
  public static void main (String x[])
  {
  
     int fib,f1=0,f2=1;
   
     
     
	 System.out.print(" "+f1);
	 System.out.print(" "+f2);
	 
   
     for(int i=1;i<=10;i++)
	 {		
       
      fib=f1+f2; // fib=0+1==1
	  f1=f2;    //  0=1; //1
	  f2=fib;  //  1=1; //1
	  
	  System.out.print(" "+fib);
		
	 }
	 
	
  }

}
