package Array_codes;

/*
 * 24. Check if Two Strings are Anagrams
Description: Check if two strings are anagrams of each other.


Input: "listen", "silent"


Output: Anagram

 */


import java.util.*;
public class String_check_Two_string_Anagram_or_not
{
    public static void main(String x[])
    {
    	Scanner s=new Scanner(System.in);
    	
    	System.out.println("Enter the first String:"); // take first String 
    	String str1=s.nextLine();
    	
    	System.out.println("Enter the Secound String:");  // take second String 
    	String str2=s.nextLine();
    	
    	String s1=str1.toLowerCase();  // convert to lowercase
 	    String s2=str2.toLowerCase();  // convert to lowercase
 	   
 	   char ch1[]=s1.toCharArray();    // convert to character Array
 	   char ch2[]=s2.toCharArray();   // convert to character Array
    	
        if(str2.length()!=str1.length())
        {
        	System.out.println("two String are not Anagram beacuse String length not same");
        	  return;
        }
    	
        
        for(int i=0;i<ch1.length;i++)   // sort The Aray
        {
        	for(int j=i+1;j<ch1.length;j++)
        	{
        		if(ch1[i]>ch1[j])
        		{
        			char temp=ch1[i];
        			     ch1[i]=ch1[j];
        			     ch1[j]=temp;
        		}
        	}
        }
    	
        
        
        for(int i=0;i<ch2.length;i++)    // sort The Aray
        {
        	for(int j=i+1;j<ch2.length;j++)
        	{
        		if(ch2[i]>ch2[j])
        		{
        			char temp=ch2[i];
        			ch2[i]=ch2[j];
        			ch2[j]=temp;
        		}
        	}
        }
        boolean flag=false;
        
        for(int i=0;i<ch1.length;i++) // compare two Array 
        {
        	if(ch1[i]!=ch2[i])
        	{
        		flag=true;
        		break;
        		
        	}
        		
        }
        
        
        
        
        String abc=!flag?"Angram":"Not Anagram";
        System.out.println(abc);
    
    }
}


