/*

   1                 1
   1 2             2 1
   1 2 3         3 2 1
   1 2 3 4     4 3 2 1
   1 2 3 4 5 5 4 3 2 1
   
*/

public class Pattern_Pyramid 
{
  public static void main(String x[])
  {
    
	int i,j,c=0;
	
	
   for( i=1;i<=5;i++)
   { 
       

	 for( j=1;j<=10;j++) 
	 {
		 
		 if(j<=i || j>=11-i)
		 {
	          if(j<=5)
			  {
		      System.out.printf("%d",j);
              }
              else
			  {
		      System.out.printf("%d",11-j);  
			  }
 			  
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
   
   
   /*
   C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_Pyramid
1        1
12      21
123    321
1234  4321
1234554321

*/