package collection_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_player_by_id_run
{

	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		
		Player  p1=new  Player(1,"ABC",20);
		Player  p2=new  Player(2,"PQR",70);
		Player  p3=new  Player(3,"MNO",30);
		Player  p4=new  Player(4,"LMN",50);
		Player  p5=new  Player(5,"XYZ",10);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		
		 System.out.println("Display Player records without Sorting");
		   for(Object obj:al)
		   {
			   Player e=(Player)obj;
			   System.out.println(e.getId() +"\t"+ e.getName() +"\t" + e.getRun());
		   }
		   
		   
		   Comparator c=new SortPlayerByRun();
		   Collections.sort(al,c);
		   
		   System.out.println("Display Players records with sorting Run ");
		   for(Object obj:al)
		   {
			   Player e=(Player)obj;
			   System.out.println(e.getId() +"\t"+ e.getName() +"\t" + e.getRun());
		   }
		   
		   
		   c=new SortPlayerById();
		   Collections.sort(al,c);
		   
		   
		  
		   System.out.println("Display player records with Sorting ID");
		   for(Object obj:al)
		   {
			   Player e=(Player)obj;
			   System.out.println(e.getId() +"\t"+ e.getName() +"\t" + e.getRun());
		   }
			
		}
		
		
	}


