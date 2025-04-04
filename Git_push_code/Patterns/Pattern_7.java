/*
Q10. Print the following patterns?
1234
123
12
1

*/

public class Pattern_7
{
  public static void main(String x[])
  {
   
   
  
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4+1-i ;j++)
	 {
		System.out.printf("%d",j);		
	 }
	 
	 System.out.println( );
   }
   
   
  }
}

/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_7
1234
123
12
1
*/