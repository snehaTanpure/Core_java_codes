package Baisc_java_program;

/*
 * 39. Calculate Average of First N Natural Numbers
Description: Write a program to calculate the average of the first n natural numbers.
Input: n = 5


Output: 3.0


 */



import java.util.*;
public class Calculate_Average_First_N_Natural_Numbers
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the natural number limit");
		int limit=s.nextInt();
		
		int sum=0;
		int avg;
		int count=0;
		
		for(int i=1;i<=limit;i++)
		{
			sum=sum+i;
			count++;
		}
		
		
		avg=sum/count;
		
		System.out.println("average of the number:"+avg);
		
		
		
	}

}
