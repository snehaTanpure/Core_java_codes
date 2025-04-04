package Baisc_java_program;

/*
 * 53. Print Star Box
Description: Write a program to print a star box of size n.
Input: n = 4


Output:
****
****
****
****

 */


import java.util.*;
public class Print_star_box 
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
			   System.out.print("*");	
		    }
			
			System.out.println( );
		}
	}

}
