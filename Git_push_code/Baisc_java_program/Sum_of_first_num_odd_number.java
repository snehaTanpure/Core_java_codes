package Baisc_java_program;

import java.util.Scanner;

public class Sum_of_first_num_odd_number {
	
	public static void main(String x[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("ENter the number");
	int limit=s.nextInt();
	
	
	int sum=0;
	
	for(int i=0;i<=limit;i++)
	{
		if(i%2==1)
		{
			sum=sum+i;
		}
	}
	System.out.println("Sum of odd number is :"+sum);

}
}
