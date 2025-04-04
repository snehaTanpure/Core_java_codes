package Baisc_java_program;


/*2. Factorial of a Number
Description: Write a program to compute the factorial of a given number n.
Input: n = 4


Output: 24
*/


import java.util.Scanner;

public class Factorial_of_number {
	
	public  static void main(String x[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of number is :" +fact);
	}

}
