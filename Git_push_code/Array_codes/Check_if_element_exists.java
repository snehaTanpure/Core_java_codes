package Array_codes;


/*
 * 18. Check if Array Contains a Specific Element
Description: Check if a specific element exists in an array.


Input: [1, 2, 3, 4], element 3


Output: Found

 */



import java.util.*;
public class Check_if_element_exists 
{
	
	public static void main(String x[])
	{
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	
	System.out.println("Enter the Array Element:");
	int a[]=new int[n];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	
	
	System.out.println("ENter the specific Element");
	int ele=s.nextInt();
	
	int flag=1;
	
	for(int i=0;i<a.length;i++)
	{
	    if(ele==a[i])
	    {
	    	flag=0;
	        break;
	    }
	}
	
	
	
	if(flag==0)
	{
		System.out.println(" !Element is Found");
	}
	else
	{
	    System.out.println(" !Element is  Not Found");
	}
	
	}
}
