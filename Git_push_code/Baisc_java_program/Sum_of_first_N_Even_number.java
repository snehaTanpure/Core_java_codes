package Baisc_java_program;

import java.util.Scanner;

/*
 * 43. Sum of First N Even Numbers
Description: Write a program to calculate the sum of first n even numbers.
Input: n = 4


Output: 20

 */


import java.util.*;
public class Sum_of_first_N_Even_number 
{
	public  static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the limit");
	    int limit=s.nextInt();
	    
	    
	   
	    int sum=0;
	    
	    int count=0;
	    
	    for(int i=0;i<=(limit+limit);i++)
	    {
	    	if(i%2==0)
	    	{
	    		sum=sum+i;
	    	}
	    }
	    
	    System.out.println("sum of first n even numbers.:"+sum);
	}

}
