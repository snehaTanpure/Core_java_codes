/*
Q11. Print the following pattern?
AAAA
BBBB
CCCC
DDDD
*/

public class Pattern_8
{
  public static void main(String x[])
  {
   char ch=64;
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4 ;j++)
	 {
		System.out.printf("%c",64+i);		
	 }
	 
	 System.out.println( );
   }
   
   
  }
}

/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_8
AAAA
BBBB
CCCC
DDDD
*/