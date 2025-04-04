package Baisc_java_program;

/*
6. Armstrong Number
Description: Write a program to check if a number is an Armstrong number.
Input: n = 153


Output: Armstrong

*/


import java.util.*;
public class Check_AramStrong_number_or_not {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int temp=num;
		
		
		int count=0;
		while(num>0)
		{
			 num=num/10;
			 count++;
		}
		
		
		System.out.println("Count of number is :"+count);
		
		
		num=temp;
		int pow,rem=0,sum=0;
		
		while(num>0)
		{
		
			rem=num%10;
			num=num/10;
			
			pow=1;
			
		for(int i=1;i<=count;i++)
		{
			pow=pow*rem;
		}
		
		sum=sum+pow;
		
		
		}
		
		System.out.println("sum  of power element is :"+sum);
		
		num=temp;
		 
		if(num==sum)
		{
			System.out.println(" ! Number is AarmStrong ");
		}
		else
		{
			System.out.println(" ! Number is Not AarmStrong ");
		}
		
		
	}

}
