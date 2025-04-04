/*
Calculate the nth term of an arithmetic progression (AP).

3n-1;


*/

import java.util.*;

public class Series_arithmetic_progression
  {
    
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter difference:"); //take the difference
		int diff=s.nextInt();
		
		System.out.println("Enter term at which want to find the value:");
		int n=s.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(sum+" ");
			
			if(i==n)
			{
				System.out.println("\n"+n+"th term is:"+c);
			}
			
			sum=sum+diff;
		}
		
	}
}


/*

C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_arithmetic_progression
Enter difference:
2
Enter term at which want to find the value:
4
0 2 4 6
4th term is:6
*/