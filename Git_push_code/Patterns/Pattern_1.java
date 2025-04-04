/*
Q1. Print the following pattern?
1
22
333
4444
*/

public class Pattern_1
{
  public static void main(String x[])
  {
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4;j++)
	 {
	    if(j<=i)
		{
		System.out.printf("%d",i);
		}
		else
		{
		System.out.print("");
		}
		
	 }
	 
	 System.out.println( );
   }
   
   
  }
}

/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_1
1
22
333
4444

*/