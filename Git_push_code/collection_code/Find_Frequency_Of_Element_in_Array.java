package collection_code;

/*1. Find the Frequency of Elements in an Array
Write a program to find the frequency of each element in a given array of integers. Use a Map<Integer, Integer> to store the frequency of each element.
Example:
Input: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
Output: {1=1, 2=2, 3=3, 4=4}
*/


import java.util.*;
import java.util.Map.Entry;
public class Find_Frequency_Of_Element_in_Array 
{
   public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   
	   LinkedHashMap <Integer,Integer>h=new LinkedHashMap<Integer,Integer> ();
	   
	   System.out.println("Enter the Size of Array");
	   int n=s.nextInt();
	   
	   int a[]=new int[n];	   
	   
	   System.out.println("Enter the Element of Array:");
	   for(int i=0;i<n;i++)
	   {
		a[i]=s.nextInt();   
	   }
	   
	   
	   System.out.println("After Find Occurence is");
	   for(int i=0;i<n;i++)
	   {
	   Integer count=h.get(a[i]) ;
	   
	    if(count == null)
	    	{
	    		count= 0;	
	    	}
	    else
	    	{
	    		count++;
	    		h.put(a[i],count);	
	    	}
	   }
	    
	   Set<Entry<Integer, Integer>> set = h.entrySet();
	    
	    for(Map.Entry<Integer,Integer> m : set)
	    {
	    	System.out.println(m.getKey() +"\t"+ m.getValue());
	    }
	    
	   }
	  
	   
   }

