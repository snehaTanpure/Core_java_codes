package Baisc_java_program;

/*
 * 35. Print Right-Angled Triangle Pattern of Numbers
Description: Write a program to print a right-angled triangle of numbers.
Input: n = 4


Output:

 1
12
123
1234

 */

import java.util.*;
public class Print_right_angle_triangle_pattern {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the limit");
	    int limit=s.nextInt();
	    
	    
	    for(int i=1;i<=limit;i++)
	    {
	    	for(int j=1;j<=limit;j++)
	    	{
	    		if(j<=i)
	    		{
	    			System.out.printf("%d",j);
	    		}
	    		
	    	}
	    	System.out.println();
	    }
	}

}
