/*
Q7. Print the following pattern?
   1
  121
 12321
1234321
 12321
  121
   1
 */
 

public class Pattern_14 
{
  public static void main(String x[])
  {
    


    char ch;
	
   for(int i=1;i<=7;i++)
   {
	   ch=49;
	   
     for(int j=1;j<=7 ;j++) 
	 {
		 if((j>=5-i && j<=3+i) && (j>=i-3 && j<=11-i) )
		 {
		   if(j<4)
		   {
			   System.out.printf("%c",ch++);
		   }
		   else 
		   {
			    System.out.printf("%c",ch--);
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

if((j>=5-i && j<=3+i) && (j>=i-3 && j<=11-i) )

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_14
   *
  ***
 *****
*******
 *****
  ***
   *
  
   
 */
 
/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_14
   1
  121
 12321
1234321
 12321
  121
   1

*/ 