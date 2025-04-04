package collection_code;

import java.util.*;

/*Question1 : Student Grade List Using LinkedList
 Description: Use a LinkedList to store student names and their grades.
 Implement methods to add a student’s grade, display all students and their grades, 
 and remove students who failed (grade below 50).
*/


public class Student_Grade_list_Using_linkedList 
{

	public static void main(String[] args)
	{
		
		LinkedList<Student> l=new LinkedList<>();
		
		Student s=new Student(1,"sneha",90);
		Student s1=new Student(2,"XYZ",70);
		Student s2=new Student(3,"PQR",30);
		Student s3=new Student(4,"MNO",40);
		Student s4=new Student(5,"ABC",85);
		
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		
	
		
		
		System.out.println("Display All student Recordes:");
		
		for(Student st:l)
		{	 
			 System.out.println(st.getId() +"\t"+ st.getName() +"\t"+ st.getGrade() );
		}
		
	
		
		Iterator <Student> i = l.iterator ();
		
		
		while(i.hasNext())
		{
			
			Student st=i.next();
			
			if(st.getGrade() < 50)
			{
				i.remove();
			}
			
		}
		
		
		
		System.out.println("After Remove Failed student:");
		
		for(Student st:l)
		{
			 System.out.println(st.getId() +"\t"+ st.getName() +"\t"+ st.getGrade() );
		}
		
		
		
		
	}

}
