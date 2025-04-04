package Array_codes;

/*
 * 21. Check if a String is Palindrome
Description: Check if the given string is a palindrome.


Input: "madam"


Output: Palindrome

 */


import java.util.*;
public class Check_String_palindrom_or_not {
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENter the String ");
		String str=s.nextLine();
		
		char ch[]=new char[str.length()];

	     
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
	
		int end=str.length()-1;
		
		for(int i=0;i<end;i++,end--)
		{	
			char temp=ch[i];
		    ch[i]=ch[end];
		    ch[end]=temp;	    
		}
		
		System.out.println("After reverse String");
		
		String rev=new String(ch);
		
		System.out.println(rev);
		
		
		if(str.equals(rev))
		{
			System.out.println("! String Palindrom");
		}
		else
		{
			System.out.println("! String Not Palindrom");
		}
		
		
	}

}
