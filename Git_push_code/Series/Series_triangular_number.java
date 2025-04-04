/*
Generate the first 15 triangular numbers (1, 3, 6, 10, ...).


TRiangular : 1,1+2,1+2+3,1+2+3+4,1+2+3+4+5

*/


  public class Series_triangular_number
  {
    public static void main(String x[])
    {
	
	
	
     for(int i=1;i<=25;i++)
	 {
		 
		int sum=0;
	 
	    for(int j=1;j<=i;j++)
		{
		  sum=sum+j;
		}
		
	    System.out.print(" "+sum);
	 
	 }
	
	}
  }
  
  
  /*
  
C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_triangular_number


 1 3 6 10 15 21 28 36 45 55 66 78 91 105 120 136 153 171 190 210 231 253 276 300 325

*/
