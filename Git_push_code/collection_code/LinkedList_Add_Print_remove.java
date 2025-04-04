package collection_code;


/*
 * Q2. LinkedList Implementation
   Create a LinkedList of strings, 
   case 1: add some element
   case 2: print the list
   case 3: remove elements from the front and rear.
*/



import java.util.*;
public class LinkedList_Add_Print_remove
{
    public static void main(String x[])
    {
    	
     Scanner s=new Scanner(System.in);
     LinkedList l=new LinkedList();  	
    
     System.out.println("Add Some Elements");
     System.out.println("Print the list");
     System.out.println("Remove Elements From the front And Rear");
     
     
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
    			 
    			 System.out.println("Add the Element ");
    			 int a=s.nextInt();
    			 
    			 l.add(a);
    			 
    			 
    			 s.nextLine();
    			 System.out.println("Do you have Add elemnt then print Y");
    			 msg=s.nextLine();
    			 
    		 }while(msg.equals("Y"));
    		 
    		break;
    		
    		
    		
    	 case 2:
    		 System.out.println(l);
    		 break;
    		 
    	 case 3:
    		 
    		 System.out.println("Enter the Index");
 	    	 int index=s.nextInt();
 	    	
 	    	 l.remove(index);
 	    	
    		 
    		 break;
    		 
    	 default :
    	 System.out.println("Wrong choice");
    	
    	 }
    	 
    	 
    	 
    	 
    	 
     }while(true);
     
     
     
     
     
    }
	
	
}
