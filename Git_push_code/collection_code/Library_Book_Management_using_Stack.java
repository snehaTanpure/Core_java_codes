package collection_code;



/*
 * Question2: . Library Book Management Using Stack
Description: Implement a Stack to keep track of books being borrowed and returned in the library. 
Each time a book is borrowed, it’s pushed onto the stack, and when returned, it’s popped off.
 */

import java.util.*;
public class Library_Book_Management_using_Stack 
{

	public static void main(String[] args) 
	{
		
	Scanner xyz=new Scanner(System.in);
		
     Stack<Book> s=new Stack<>();
     
    
     
    
     
     
     // System.out.println("Display Records OF Book");
     
    
     
    
     
     
     Iterator<Book> i=s.iterator();
     
     String msg;
     
         do
         {
        	 System.out.println("Enter the id");
             int id=xyz.nextInt();
             
        
             xyz.nextLine();
             System.out.println("ENter the BOOK name");
             String bookname=xyz.nextLine();
             
             
             System.out.println("Enter the Status Book");
             String status=xyz.nextLine();
     
    	 if(status.equals("borr"))
    	 {
    		 Book b1=new Book(id,bookname);
    		 s.push(b1);
    		 System.out.println("! Book are added Sucessfully");
    	 }
    	 else if(status.equals("retun"))
    	 {
    		 
    		 
    		  if(s.isEmpty())
    		  {
    			  System.out.println("Book Are not Available to Return !");
    		  }
    		  else
    		  {
    			  s.pop();
    	    	  System.out.println("! Book are  Return");
    	      }
    		  
    	 }
    	 else
    	 {
    		 System.out.println("Invalid status ");
    	 }
    	 
    	 
    	 System.out.println("IF You want to continou the Enter Y");
    	 msg=xyz.nextLine();
    	 if(!msg.equals("y"))
    	 {
    		 break;
    	 }
    	 
    	 
      }while(true);
	
     
         
      if(s.isEmpty())
      {
    	 System.out.println(" NO Book Borrowed"); 
      }
      
      else
      {
    	  System.out.println("Borrowed Books Are:");
    	  
    	  for(Book b:s)
    	     {
    	    	 System.out.println(b);
    	     }
    	     
      }
            
     
	}

}
