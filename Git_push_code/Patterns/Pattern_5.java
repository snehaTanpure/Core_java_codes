/*

Q5. Print the following pattern?
1
12
123
1234

*/


public class Pattern_5
{
  public static void main(String x[])
  {
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4;j++)
	 {
	    if(j<=i)
		{
		System.out.printf("%d",j);
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
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_5
1
12
123
1234
*/
