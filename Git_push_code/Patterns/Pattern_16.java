/*
Q9. Print the following pattern?
   1
  1 1
 1 2 1
1 3 3 1

*/

public class Pattern_16
{
  public static void main(String x[])
  {
    
     boolean flag=false;

    for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=7;j++) 
	 {
		 if(j>=5-i && j<=3+i)
		 {
		 System.out.printf("%d",i);		 
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

