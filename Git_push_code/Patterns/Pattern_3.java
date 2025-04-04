

/*

Q4. Print the following pattern?
DDDD
CCC
BB
A

*/
public class Pattern_3
{
  public static void main(String x[])
  {
   
   char ch=69;
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4;j++)
	 {
	    if(j>=i)
		{
		System.out.printf("%c",69-i);
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

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_3
DDDD
CCC
BB
A

*/
