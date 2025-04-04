/*
Q19. Print the following pattern?
XOXO
OXOX
XOXO
OXOX

*/

public class Pattern_13
{
  public static void main(String x[])
  {
    

   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4 ;j++) 
	 {
		 if((i+j)%2==0)
		 {
		 System.out.printf("x");		 
         }	
         else
         {
		 System.out.printf("o");
		 }			 
	 }
	 System.out.println( );
	 
   }
   
   
  }
}

/*
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_13
xoxo
oxox
xoxo
oxox
*/