 package collection_code;
/*
 * Q1. Basic ArrayList Operations & Create an ArrayList of integers,
   case 1: add some elements
   case 2: print the list
   case 3: remove an element at a specific index.

 */

import java.util.*;
public class ArrayList_Add_print_remove 
{
   

public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Case1:Add Some Elements");
	   System.out.println("Case2:Print the List");
	   System.out.println("Case3:Remove an Element at a specific index");
	   
	   ArrayList al= new ArrayList();
	   
	   do
	   {
	      System.out.println("Enter the Choice");
	      int choice=s.nextInt();
	 
	      
	    switch(choice)
	    {
	    case 1:
	    	
	    	String msg;
	    	
	    	do
	    	{
	    		
	          System.out.println("Enter the Element");
	          
	          int a=s.nextInt();
	          
	          al.add(a);
	          
	          
	          s.nextLine();
	          System.out.println("Do You Add ELment then Print Y");
	          msg=s.nextLine();
	          
	    	}while(msg.equals("Y"));
	    	
	    	break;
	    	
	    	
	    	
	    case 2:
	    	
	    	System.out.println(al);
	    	
	    	break;
	    	
	    	
	    	
	    case 3:
	    	
	    	System.out.println("Enter the Index");
	    	int index=s.nextInt();
	    	
	    	al.remove(index);
	    	
	    	break;
	    	
	    
	    default :
	 	System.out.println("Wrong choice");
	 	   
	    }
	    
	  
	    	 
	   }while(true);
	   
   }
}



