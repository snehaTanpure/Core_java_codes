package Baisc_java_program;



import java.util.*;
public class Minimun_number {
	
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a=s.nextInt();
		
		
		System.out.println("Enter the Secound Value");
		int b=s.nextInt();
		
		
		if(a<b)
		{
			System.out.println("minimum number is :"+a);
		}
		else
		{
			System.out.println("minimum number is :"+b);
		}
		
	}

}



