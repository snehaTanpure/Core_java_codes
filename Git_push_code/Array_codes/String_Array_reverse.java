package Array_codes;

/*
 * 19. Reverse a String
Description: Reverse the given string.


Input: "hello"


Output: "olleh"



 */

import java.util.*;
public class String_Array_reverse {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the String ");
		String str=s.nextLine();
		
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			 ch[i]=str.charAt(i);
		}
		
		System.out.println("After Reverse String:");
		int end=str.length()-1;	
		for(int i=0;i<end;i++,end--)
		{
			
			char temp=ch[i];
			    ch[i]=ch[end];
			    ch[end]=temp;
		}
		
		 String rev=new String(ch);
		 System.out.println(rev);
		
	}

}
