/*
Generate a series based on the powers of 2 (2^0, 2^1, 2^2, ... up to N)
*/


import java.util.*;
public class Series_Power_2
  {
    public static void main(String x[])
    {
	
	
	Scanner s=new Scanner(System.in);
	int mul=1;
	
	System.out.println("ENter the limit");
	int n=s.nextInt();
	
	System.out.println("ENter the number to find power");
	int pow=s.nextInt();
	
	
	
	System.out.println("Series based on th power of 2");
     for(int i=1;i<=n;i++)
	 {
		 
	    mul=mul*pow;
	    System.out.print(" "+mul);
	 
	 }
	
	}
  }
  
  
  /*
  
 C:\Users\Tejas\Desktop\sneha documents\JAVA PROGRAM\Series>java Series_Power_2
 
 
 Series based on th power of 2:
 
 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536 131072 262144 524288 1048576 2097152 4194304 8388608 16777216 33554432
 
 */
 

