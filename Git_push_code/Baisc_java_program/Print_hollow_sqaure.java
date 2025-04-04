package Baisc_java_program;

/*
 * 	59. Print Hollow Square
Description: Write a program to print a hollow square pattern.
Input: n = 5


Output:
 *****
*   *
*   *
*   *
*****
	
 */

import java.util.*;
public class Print_hollow_sqaure 
{
    public static void main (String x[])
    {
    	
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the lim1:");
    int lim1=s.nextInt();
    
    System.out.println("Enter the lim2:");
    int lim2=s.nextInt();
    
    
    for(int i=1;i<=lim1;i++)
    {
    	for(int j=1;j<=lim2;j++)
    	{
    		if(i==1 || j==1 || j==lim2 || i==lim1)
    		{
    		System.out.print("*");	
    		}
    		else
    		{
    		 System.out.print(" ");		
    		}
    	}
    	
    	System.out.println();
    	
    }
    
    
    
    }
    
}
