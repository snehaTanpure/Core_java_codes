/*
Q20. Print the following pattern?
1
2 3
4 5 6
7 8 9 10

*/

public class Pattern_12
{
  public static void main(String x[])
  {
    

   int c=1;
   
   for(int i=1;i<=4;i++)
   {
     for(int j=1;j<=4 ;j++) //(j<=i)  without use if else
	 {
		 if(j<=i)
		 {
		 System.out.printf("%d",c++);	
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

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Patterns>java Pattern_12
1
23
456
78910

*/