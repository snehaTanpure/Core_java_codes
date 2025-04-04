package Baisc_java_program;

import java.util.Scanner;

public class Check_prime_or_not {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int count=0;
		
		for(int i=2;i<=num/2;i++)
		{
				
			if(num%i==0)
			{
				count=1;
			}
		}
		
		
		if(count==0)
		{
			System.out.println("! number is prime");
		}
		else
		{
			System.out.println("! number is Not prime");
		}

		}

}
