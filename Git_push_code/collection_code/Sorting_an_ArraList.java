package collection_code;

/*
 * Q1. Sorting an ArrayList
Create an ArrayList of custom objects and sort them using Collections.sort() based on a specific field.
Example: you have to create Employee class with field id,name and salary and sort employee data by using salary

 */

import java.util.*;
public class Sorting_an_ArraList 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
	   ArrayList al=new ArrayList();
	   
	   Employee emp1=new  Employee(1,"ABC",55000);
	   Employee emp2=new  Employee(2,"por",23000);
	   Employee emp3=new  Employee(3,"LMN",200);
	   Employee emp4=new  Employee(4,"OBC",600);
	  
	   al.add(emp1);
	   al.add(emp2);
	   al.add(emp3);
	   al.add(emp4);
	   
	
	   System.out.println("Display Employee data Before Sorting");
	   for(Object obj:al)
	   {
		   Employee e=(Employee)obj;
		   System.out.println(e.getId() +"\t"+ e.getName() +"\t" + e.getSalary());
	   }
	   
	   Collections.sort(al);
	   
	   System.out.println("Employee data After Sorting");
	   for(Object obj:al)
	   {
		   Employee e=(Employee)obj;
		   System.out.println(e.getId() +"\t"+ e.getName() +"\t" + e.getSalary());
	   }
		
	}
	

}
