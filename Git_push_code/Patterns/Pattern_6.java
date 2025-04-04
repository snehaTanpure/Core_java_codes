/*

Q6. Print the following pattern?
A
AB
ABC
ABCD

*/

public class Pattern_6
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
		System.out.printf("%c",64+j);
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
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_6
A
AB
ABC
ABCD
*/