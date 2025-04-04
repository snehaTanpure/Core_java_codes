/*

            1
		  2 3 2
		3 4 5 4 3
	  4 5 6 7 6 5 4
    5 6 7 8 9 8 7 6 5

*/

public class Pattern_Full_Pyramid
{
  public static void main(String x[])
  {
   
   char ch;
   
   for(int i=1;i<=5 ;i++)
   {
	   ch=49;
	   
     for(int j=1;j<=9 ;j++)
	 {
		 if(j>=6-i && j<=4+i)
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
	