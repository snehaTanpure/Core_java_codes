package collection_code;

/*
 * Q4.  Set Operations: Create a HashSet to store unique elements
 case 1: add elements to the set
 case 2: checking if an element exists
 case 3: finding the size of the set.

 */

import java.util.*;
public class Hashset_Add_check_size
{
    public static void main(String x[])
    {
    	Scanner s=new Scanner(System.in);
    	
    	HashSet<Integer>h=new HashSet<>();
    	
    	System.out.println("Case 1:Add Elemnt in set");
    	System.out.println("Case 2:check Element if Exits");
    	System.out.println("Case 3:Finding the Size of the set");
    	
    	
    	do
    	{
    	    System.out.println("Enter the choice");
    	    int choice=s.nextInt();
    		
    	    String msg;
    	    
    		switch(choice)
    		{
    		case 1:
    			
    			do
    			{
    				System.out.println("Add Element in set");
    				int a=s.nextInt();
    				
    				h.add(a);
    				
    				s.nextLine();
    				System.out.println("Do you have Add elemnt then print Y");
        			msg=s.nextLine();
    				
    				
    			}while(msg.equals("y"));
    			
    			
    			break;
    			
    			
    		case 2 :
    			
    			boolean flag=true;
    			
    			System.out.println("ENter the Element ");
    			int ele=s.nextInt();
    			
    			
    		    if(h.contains(ele))
    		    {
    				System.out.println("Element is Found");
    			}
    			else
    			{
    				System.out.println("Element is not Found");
    			}
    			
    		 // Iterator<Integer>el=h.iterator();
    			
    			/* while(el.hasNext())
    			{
    			    Integer pre=el.next();
    				
    				if(pre==ele)
    				{
    					flag=false;
    					break;
    				}
    				
    			}
    			
    			if(!flag)
    			{
    				System.out.println("Element is Found");
    			}
    			else
    			{
    				System.out.println("Element is not Found");
    			}
    			
    			*/
    			
    			break;
    			
    			
    		case 3:
    			
    			int  count = h.size();
    			System.out.println("Size of set:"+count);
    			
    			break;
    			
    			
    		default :
    		System.out.println("Wrong choice");
    		
    		}
    		
    	}while(true);
    	
    	
    }
}
