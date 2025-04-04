package Baisc_java_program;

import java.util.Scanner;

/*
 * 33. Print Square of a Number
Description: Write a program to print the square of a number.
Input: n = 4


Output: 16

 */


public class Print_square_of_number {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int squ=0;
		
		
		squ=num*num;
		
		System.out.println("Square of number:"+squ);
		
		
		
		
	}

}
