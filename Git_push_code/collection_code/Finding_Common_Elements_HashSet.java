package collection_code;

/*
 * Q4. Finding Common Elements Between Two Sets
Write a program that takes two HashSet objects and prints the elements that are common to both
*/


import java.util.*;
public class Finding_Common_Elements_HashSet 
{
   public static void main(String x[])
   {
	   HashSet h1=new HashSet();
	   h1.add(100);
	   h1.add(200);
	   h1.add(300);
	   h1.add(400);
	   
	   System.out.println(h1);
	     
	   HashSet h2=new HashSet();
	   h2.add(10);
	   h2.add(20);
	   h2.add(300);
	   h2.add(400);
	   
	   System.out.println(h2);
	   
	   h1.retainAll(h2);
	
	   System.out.println("Common Elements Between Two Sets"+h1);
	   
	   
	   
	   
	   
   }
}
