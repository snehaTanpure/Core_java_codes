package Array_codes;

/*
 * 11. Check if Array is Palindrome
Description: Check if an array is the same when reversed.


Input: [1, 2, 3, 2, 1]


Output: Palindrome

 */


import java.util.*;
public class check_if_Array_is_palindrom 
{
     public static void main(String x[])
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the Size of Array:");
    	 int n=s.nextInt();
    	 
    	 System.out.println("Enter the Element of Array:");
    	 int a[]=new int[n];
    	 int b[]=new int[n];
    	 
    	 for(int i=0;i<a.length;i++)
    	 {
    	   a[i]=s.nextInt();
    	   b[i]=a[i];
    	 }
    	  
    	 int mid=a.length/2;  //find the mid
    	 int end=a.length-1;  //find the end 
    		
    		for(int i=0;i<mid;i++,end--)
    		{
    		  int temp=a[i];
    		     a[i]=a[end];
    			 a[end]=temp;
    		}
    	 
    	 
    	 System.out.println("After reverse Array");
    	 for(int i=0;i<a.length;i++)
    	 {
    	     System.out.println(a[i]);
    	    
    	 }
    	 
    	 
    	 boolean flag=true;
    	 
    	 for(int i=0;i<b.length;i++)
    	 {    
    		 
       		 if(a[i]!=b[i])
    		 {
    			 flag=false;
    			 break;
    		 }
       		 
    	 }
    	 
    	 
    	 if(flag)
    	 {
    		 System.out.println("! Palindrom Array");
    	 }
    	 else
    	 {
    		 System.out.println("! Not Palindrom Array");
    	 }
    	 
    	 
    	 
     }
}
