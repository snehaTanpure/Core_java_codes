package Baisc_java_program;



import java.util.*;
public class inverted_number_pattern_print {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		
		
		for(int i=1;i<=limit;i++)
		{
			for(int j=1;j<=limit;j++)
			{
				if(j<=(limit+1)-i)
				{
				System.out.printf("%d",(limit+1)-j);
				}
			}
			System.out.println();
		}
		
	}

}
