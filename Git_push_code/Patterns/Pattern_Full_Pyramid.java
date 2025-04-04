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
   
   
   
   for(int i=1;i<=5 ;i++)
   {
	   
	   
	 int  ch=i;
	   
     for(int j=1;j<=9 ;j++)
	 {
		 if(j>=6-i && j<=4+i)
		 {
			 if(j<5)
			 {
		      System.out.printf("%d",ch++);
			 }
			 else
			 {
		      System.out.printf("%d",ch--); 
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
	C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_Full_Pyramid
    1
   232
  34543
 4567654
567898765

*/