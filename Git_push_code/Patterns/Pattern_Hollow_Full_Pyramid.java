/*
        1
	  1   2
	1       3
   1         4
  1  2  3  4  5
  
*/

public class Pattern_Hollow_Full_Pyramid
{
  public static void main(String x[])
  {
   
   boolean flag=true;
   
   
   for(int i=1;i<=5 ;i++)
   {
  
     for(int j=1;j<=9 ;j++)
	 {
		 if(j==6-i)
		 {
		      System.out.printf("1");
         }	
         else if(j==4+i)
		 {
		  System.out.printf("%d",i); 
		 }	
		 else if(i==5 && flag)
		 {
		 System.out.printf("%d",j); 
          flag=false;		 
		 }
         else
         {
		 System.out.printf(" ");  
		 flag=true;
		 }			 
	 }
	 
	 System.out.println( );
   }
   
   
  }
}
	
