package collection_code;

/*
Q3. Merging Two Lists
Merge two ArrayList objects into one, making sure that the merged list does not contain duplicates.
*/

import java.util.*;
public class Merging_two_list 
{
	public static void main(String x[])
	{
	
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add(200);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		
		
		ArrayList a3=new ArrayList();
		a3.addAll(al);
		a3.addAll(a2);
		
		
		System.out.println(a3);
		
		
		LinkedHashSet l=new LinkedHashSet();
		l.addAll(a3);
		
		System.out.println(l);
	}

}
