package Baisc_java_program;

import java.util.Scanner;

/*
 * 25. Find the Second Largest Number
Description: Write a program to find the second largest number from a set of two numbers.
Input: a = 10, b = 20


Output: 10

 */

public class Secound_large_simple {
  public static void main(String x[])
  {
	  Scanner s=new Scanner(System.in);
	  
	  System.out.println("ENter the first number");
	  int a=s.nextInt();
	  
	  
	  System.out.println("ENter the secound number");
	  int b=s.nextInt();
	  
	  
	  if(a<b)
	  {
		  System.out.println("Secound largest:"+a);
	  }
	  else
	  {
		  System.out.println("Secound largest:"+b);
	  }
	  
  }
}
