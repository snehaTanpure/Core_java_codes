/*
  1  2  3  4  5
  2        5
  3     5
  4  5
  5
*/  


public class Pattern_Hollow_Inverted_half_pyramid
{
  public static void main(String x[])
  {
   
   
   for(int i=1;i<=5;i++)
   {
     for(int j=1;j<=5 ;j++)
	 {
		 if(i==1)
		 {
		   System.out.printf("%d",j);	
         }
         else if(j==6-i)
         {
		   System.out.printf("5");	 
		 }
		 else if(j==1)
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


/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_Hollow_Inverted_half_pyramid

12345
2  5
3 5
45
5

*/