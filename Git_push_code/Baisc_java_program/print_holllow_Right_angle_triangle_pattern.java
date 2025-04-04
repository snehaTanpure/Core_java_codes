package Baisc_java_program;

import java.util.Scanner;

/*
 * 69. Print Hollow Right-Angle Triangle Pattern
Description: Write a program to print a hollow right-angle triangle pattern.
Input: n = 4


Output:

 *
* *
*  *
****

 */

import java.util.*;
public class print_holllow_Right_angle_triangle_pattern 
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
        		
    			if(j==1 || i==lim1 || i==j)
    			{
    				System.out.print("*");
    			}
    			else
    			{
    				System.out.print(" ");
    			}
        	}
    		
    		System.out.println( );
        	
    	}
    	
    }

}
