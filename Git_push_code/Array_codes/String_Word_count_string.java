package Array_codes;

/*
 * 22. Count Words in a String
Description: Count the number of words in a string.


Input: "hello world"


Output: 2

 */

import java.util.*;
public class String_Word_count_string 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the String ");
		String str=s.nextLine();
		
		int count=0;
		boolean flag=false;
		   
		
		
		System.out.println("Count of String word");   
		   for(int i=0;i<str.length();i++)
		   {
		     //char ch[]=str.charAt(i);
			 
			 if(str.charAt(i)==' ')
			 {
			  flag=false;
			 }
			 else 
		     {
				 if(!flag)
				 {
			       count++;
		           flag=true;
				 }
			 }
		   }
		   
		    System.out.println(count);
		    
		  }
}
