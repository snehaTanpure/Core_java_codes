package Baisc_java_program;



/*
 * 28. Sum of Digits Using While Loop
Description: Write a program to calculate the sum of digits using a while loop.
Input: n = 123


Output: 6



 */
import java.util.Scanner;

public class Sum_of_digit_using_while_loop 
{
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);

	   System.out.println("Enter the Number");
	   int num=s.nextInt();
	   
	   int rem=0,sum=0;
	   
	   while(num!=0)
	   {
		    rem=num%10;
		    num=num/10;
		    sum=sum+rem;
		    
	   }
	   
	   System.out.println("Sum of digit is:"+sum);
	}
}
