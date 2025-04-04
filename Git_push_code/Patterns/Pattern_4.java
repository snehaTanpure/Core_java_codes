/*

Q3. Print the following pattern?
4444
333
22
1

*/

public class Pattern_4
{
  public static void main(String x[])
  {
   
  
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4;j++)
	 {
	    if(j>=i)
		{
		System.out.printf("%d",5-i);
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

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_4
4444
333
22
1

*/