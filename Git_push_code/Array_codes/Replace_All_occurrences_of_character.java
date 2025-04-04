package Array_codes;

/*
 * 25. Replace All Occurrences of a Character in String
Description: Replace all occurrences of a character in a string with another character.


Input: "hello", o -> x


Output: "hellx"



 */


import java.util.*;
public class Replace_All_occurrences_of_character 
{
    public static void main(String x[])
    {
    	Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the String");
    	 String str=s.nextLine();
    	
    	
    	 System.out.println("Enter replace the character");
         String  ch=s.nextLine();
    	
         
         
         char chh[]=new char[str.length()];
    	
         for(int i=0;i<str.length();i++)
         {
        	  chh[i]=str.charAt(i);
         }
    	
    	
    	
    	for(int i=0;i<str.length();i++)
    	{
    		
    		if(chh.equals(ch))
    		{
    		     
    		}
       		
       		
       		
    	}
    	
    	
    
    	
    }
}
