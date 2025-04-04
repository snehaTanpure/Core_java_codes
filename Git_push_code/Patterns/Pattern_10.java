/*
Q15. Print the following patterns?
   *
  * *
 *   *
* 	  *
 
*/


public class Pattern_10
{
  public static void main(String x[])
  {
   
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=7 ;j++)
	 {
	   if(j==5-i || j==3+i)
	   {
		System.out.printf("*");		
	   }
	   else
	   {
		System.out.printf(" ");		
	   }
	 }
	 
	 System.out.println( );
   }
   
   
  }
}


/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_10
   *
  * *
 *   *
*     *

*/