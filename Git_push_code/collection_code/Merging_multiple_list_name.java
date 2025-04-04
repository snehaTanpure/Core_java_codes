package collection_code;



import java.util.*;
public class Merging_multiple_list_name
{
	public static void main(String x[])
	{
	    ArrayList al=new ArrayList();
	    al.add("sneha");
	    al.add("shrutika");
	    al.add("asmii");
	    al.add("sharu");
	    al.add("aaru");
	    
	    System.out.println(al);
	    
	    
	    ArrayList a2=new ArrayList();
	    a2.add("ABc");
	    a2.add("shrutika");
	    a2.add("MNO");
	    a2.add("sharu");
	    a2.add("gargi");
	    
	    System.out.println(a2);
	    
	    ArrayList a3=new ArrayList();
	    a3.addAll(al);
	    a3.addAll(a2);
	    
	    LinkedHashSet l=new LinkedHashSet();
	    l.addAll(a3);
	    
	    System.out.println(l);
	    
	    
	    
	    
	    
	    
	}

}
