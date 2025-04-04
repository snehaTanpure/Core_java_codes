/*
1   3
2   4 4
3   5 5 5
4   6 6 6 6
5   5 5 5
6   4 4 
7   3
*/


public class Pattern_Digit_Solid_half_dimond 
{
  public static void main(String x[])
  {
	  
	 
    
   for(int i=1;i<=7 ;i++)
   {
	  
     for(int j=1;j<=4 ;j++) 
	 {
		 if(j<=i && j<=8-i)
		 {
		      
		      if(i<4)
              {
				System.out.printf("%d",i+2);		
			  }		
              else
              {
				System.out.printf("%d",10-i);	
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

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_Digit_Solid_half_dimond
3
44
555
6666
555
44
3

*/