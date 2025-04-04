package Baisc_java_program;

/*38. Count the Number of Prime Numbers in a Range
Description: Write a program to count the number of prime numbers between m and n.
Input: m = 1, n = 10


Output: 4

*/


import java.util.*;
public class Count_Prime_no_within_two_range {

	 public static void main (String x[])
	 {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the M range");
		 int m=s.nextInt();
		 
		 System.out.println("Enter the N range");
		 int n=s.nextInt();
		 
		 int c=0;
		 
		 int no=m;
		 while(no<=n)
		 {
			 int count=0;
			 
			 for(int i=2;i<= no/2;i++)
			 {
				 if(no%i==0)
				 {
					 count=1;
				 }
			 }
			 
			 if(count==0)
			 {
				 System.out.printf("%d  ",no);
				 c++;
				 
			 }
			 
			 
			 no++;
		 }
		 
		 
		 System.out.println(" \n count the number of prime numbers between m and n.:"+c);
		 
		 
	 }
	
}
