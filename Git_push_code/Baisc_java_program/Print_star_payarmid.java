package Baisc_java_program;
/*
44. Print Star Pyramid
Description: Write a program to print a pyramid using stars.
Input: n = 5
Output:

i=5;j=

    *
   ***
  *****
 *******
*********

*/




import java.util.*;
public class Print_star_payarmid 
{
	public static void main(String x[])
	{
		 Scanner s=new Scanner (System.in);
		 System.out.println("Enter the i");
		 int lim1=s.nextInt();
		 
		 System.out.println("Enter the j");
		 int lim2=s.nextInt();
		 
		 
		 for(int i=1;i<=lim1;i++)
		 {
			 for(int j=1;j<=lim2;j++)
			 {
				 if(j>=(lim1+1)-i && j<=(lim2/2)+i)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					System.out.print(" ");
				 }
			 }
			 System.out.println();
			 
		 }
		 
	}

}
