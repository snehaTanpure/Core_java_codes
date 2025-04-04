package Baisc_java_program;

/*
 * 
 * 61. Sum of First N Prime Numbers

Description: Write a program to calculate the sum of the first n prime numbers.
Input: n = 4


Output: 28

 */


import java.util.*;
public class Sum_of_first_n_prime_number
{
    public static void main(String x[])
      {
    	Scanner s=new Scanner(System.in);
    	
    	int sum=0;
    	
        System.out.println("Enter the limit");
        int limit=s.nextInt();
        
        
        int count=0;
        int no=2;
        
        while(count < limit)
        {
        	
        	int isprime=1;
        	
        	for(int i=2;i<=no/2;i++)
        	{
        		if(no%i==0)
        		{
        			isprime=0;
        		}
        		
        		
        	}
        	
        	if(isprime==1)
        	{
        		sum=sum+no;
        		System.out.println(no);
        		count++;
        	}
        	
        	
        no++;	
        }
        
        
        System.out.println("the sum of the first n prime numbers:"+sum);
        
        
      }
}
