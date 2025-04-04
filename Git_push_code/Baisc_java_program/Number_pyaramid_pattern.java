package Baisc_java_program;


/*40. Number Pyramid Pattern
Description: Write a program to print a number pyramid pattern.
Input: n = 4


Output:

i=4,j=7;

    1
   121
  12321
 1234321
 
 
*/

import java.util.*;
public class Number_pyaramid_pattern {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size i");
		int lim1=s.nextInt();
		
		System.out.println("Enter the size j");
		int lim2=s.nextInt();
		
		
		int mid=lim2/2;
		
		for(int i=1;i<=lim1;i++)
		{
			char ch=49;
			
			for(int j=1;j<=lim2;j++)
			{
				if(j>=(lim1+1)-i && j<=(mid)+i)
				{
					if(j<=mid)
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
			System.out.println();
		}
	
		
	
	}

}
