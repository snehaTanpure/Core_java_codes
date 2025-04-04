/*
Q8. Print the following pattern?
   A
  ABA
 ABCBA
ABCDCBA
 ABCBA
  ABA
   A
 
 */
 
 
 public class Pattern_15
{
  public static void main(String x[])
  {
   
    char ch;
	
   for(int i=1;i<=7;i++)
   {
	   ch=65;
	   
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
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_15
   A
  ABA
 ABCBA
ABCDCBA
 ABCBA
  ABA
   A
   
*/