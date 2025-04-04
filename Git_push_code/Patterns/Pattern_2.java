
/*
Q2. Print the following pattern?
A
BB
CCC
DDDD
*/

public class Pattern_2
{
  public static void main(String x[])
  {
   
   char ch=64;
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4;j++)
	 {
	    if(j<=i)
		{
		System.out.printf("%c",64+i);
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

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_2
A
BB
CCC
DDDD

*/