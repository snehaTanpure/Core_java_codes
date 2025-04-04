package collection_code;

/*Q3.Stack Implementation - Implement a stack using Stack 
  case 1: push()
  case 2: pop()
  case 3: peek() operations.
  case 4: display stack value using last in first out 
*/

import java.util.*;
public class Stack_Push_Pok_peek_display
{
    public static void main(String x[])
    {
    	Scanner s=new Scanner(System.in);
    	
    	Stack st=new Stack();
    	
    	System.out.println("Case 1:Push Element");
    	System.out.println("Case 2:Pok Element");
    	System.out.println("Case 3:Peek Element");
    	System.out.println("Case 4:display Element");
    	
    	
    	do
    	{
    		
    		System.out.println("Enter the Choice");
    		int choice=s.nextInt();
    		
    		String msg;
    		
    		switch(choice)
    		{
    		case 1:
    			
    			 do
        		 {
        			 
        			 System.out.println("Add the Element ");
        			 int a=s.nextInt();
        			 
        			 st.push(a);
        			  
        			 s.nextLine();
        			 System.out.println("Do you have Add elemnt then print Y");
        			 msg=s.nextLine();
        			 
        		 }while(msg.equals("Y"));
    			 
    			break;
    			
    			
    		case 2:
    			
    			st.pop();
    			
    			break;
    			
    			
    		case 3:
    			
    			Object obj=st.peek();
    			System.out.println(obj);
    			
    			break;	
    		case 4:
    			
    			System.out.println(st);
    			
    			
    			break;
    		default :
    			System.out.println("Wrong choice");
    		}
    		
    		
    	}while(true);
    }
}
