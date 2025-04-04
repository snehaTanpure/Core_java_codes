package Baisc_java_program;


/*
 * 51. Print Number Pattern
Description: Write a program to print a number pattern.
Input: n = 5


Output:

1
12
123
1234
12345

*/

import java.util.Scanner;

public class Print_number_pattern 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the limit i");
		int lim1=s.nextInt();
		
		
		System.out.println("Enter the limit j");
		int lim2=s.nextInt();
		
		
		
		for(int i=1;i<=lim1;i++)
		{
			for(int j=1;j<=lim2;j++)
			{
				if(j<=i)
				{
				System.out.printf("%d",j);
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
