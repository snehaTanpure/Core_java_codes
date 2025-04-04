package Array_codes;

/*
 * 20. Count Vowels in String
Description: Count the number of vowels in a given string.


Input: "hello"


Output: 2



 */


import java.util.*;
public class String_Array_vowel_count {
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
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||  ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			 {
				 count++;
			 }
		}
		
		System.out.println("Count of vowel is:"+count);
		
	}

}



