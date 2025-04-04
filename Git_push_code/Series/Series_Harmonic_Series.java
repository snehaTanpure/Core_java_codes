/*
Print the first N terms of a harmonic series (1, 1/2, 1/3, ...).

*/


import java.util.*;
public class Series_Harmonic_Series
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		System.out.println("Enter limit:");
		int n=m.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i+"  ");
		}
	}
}


/*
C:\Program Files\Java\jdk1.8.0_202\bin\Series>javac HarmonicSeries.java

C:\Program Files\Java\jdk1.8.0_202\bin\Series>java HarmonicSeries
Enter limit:
5
1/1  1/2  1/3  1/4  1/5
*/

