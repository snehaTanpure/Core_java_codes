package collection_code;


/*Q7. List Reversal Using LinkedList
Write a program that reverses the order of elements in a LinkedList using an iterator.
*/


import java.util.*;
public class List_Reversal_using_LinkList 
{
    public static void main(String x[])
    {
    	LinkedList l=new LinkedList();
    	l.add(100);
    	l.add(200);
    	l.add(300);
    	l.add(400);
    	l.add(300);
    	
    	Collections.reverse(l);
    	
      //  LinkedHashSet l1=LinkedHashSet(l);
    	
        System.out.println(l);
    	
    	
    }
}
