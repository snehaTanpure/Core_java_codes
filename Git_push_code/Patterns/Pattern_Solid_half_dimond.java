/*
 
 1 *               
 2 * *
 3 * * *
 4 * * * *
 5 * * * * *   j<=10-i
 6 * * * *
 7 * * *
 8 * *
 9 *
 
*/

public class Pattern_Solid_half_dimond 
{
  public static void main(String x[])
  {
    
   for(int i=1;i<=9;i++)
   {
	  
     for(int j=1;j<=5;j++) 
	 {
		 if(j<=i && j<=10-i)
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


/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_Solid_half_dimond
*
**
***
****
*****
****
***
**
*
*/