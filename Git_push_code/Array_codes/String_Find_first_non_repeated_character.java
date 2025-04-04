package Array_codes;

/*
 * 23. Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.


Input: "swiss"


Output: w

 */


import java.util.*;
public class String_Find_first_non_repeated_character 
{
     public static void main (String x[])
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the String");
    	 String str=s.nextLine();
    	 
    	 int count=0;
    	
    	 for(int i=0;i<str.length();i++)
    	 {
    		  count=0;
    		 
    		 for(int j=0;j<str.length();j++)
    		 {
    			 if( str.charAt(i)==str.charAt(j))
    			 {
    				count++; 
    			 }
    		 }
    		 
    		 
    		 if(count==1)
        	 {
        		 System.out.println("first non-repeated character in a string is:"+str.charAt(i));
        		 break;
        	 }
    	 }
    	 
    	
    	 
    	 
    	 
     }
}
