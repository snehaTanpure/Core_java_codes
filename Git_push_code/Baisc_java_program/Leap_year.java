package Baisc_java_program;


/*
 * 24. Check Leap Year
Description: Write a program to check if a given year is a leap year.
Input: year = 2020


Output: Leap Year

 */


import java.util.*;
public class Leap_year 
{
	
     public static void main(String x[])
     {
    	 
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("ENter the Year");
    	 int year=s.nextInt();
    	 
    	 if(year%4==0)
    	 {
    		 System.out.println("! Leap Year");
    	 }
    	 else
    	 {
    		 System.out.println("! This is Not Leap Year");
    	 }
    		 
    	 
     }
}
