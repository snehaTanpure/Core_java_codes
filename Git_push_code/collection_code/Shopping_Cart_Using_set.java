package collection_code;


/*Question4:  Unique Items Shopping Cart Using Set
  Description: Use a HashSet to manage a shopping cart where no duplicate items are allowed.
   Add items, remove an item, and check if a specific item is already in the cart.
  */



import java.util.*;
public class Shopping_Cart_Using_set 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		
		HashSet <Shopping> h=new HashSet<>();
		
		Shopping s1=new Shopping(1,100,"ice-cream");
		Shopping s2=new Shopping(2,400,"ABC");
		Shopping s3=new Shopping(3,600,"XYZ");
		Shopping s4=new Shopping(4,300,"ice-cream");
		Shopping s5=new Shopping(5,50,"Maggi");
		Shopping s6=new Shopping(6,200,"Chocalet");
		
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);
		h.add(s6);
		
		
		
		System.out.println("Display All the Items ");
		for(Shopping sp:h)
		{
			System.out.println(sp.getId() +"\t"+ sp.getPrice() +"\t"+ sp.getItems());
		}
		
		
		Iterator <Shopping> i= h.iterator();
		
	
		boolean flag=false;
		
		System.out.println("\n\n Enter the Specific Items");
		String speitems=s.nextLine();
		
		
		for(Shopping sp:h)
		{
				
			if(sp.getItems().equals(speitems))
			{
		    	flag=true;
				break;
			}
		}
		
	    if(flag)
		 {
				System.out.println("! YES item is already in the cart:");
		 }
		else
		{
				System.out.println("! No item is already in the cart:");
		}
		   
		   
		   
		   
		   
		    System.out.println("\n \n Display All the Items After remove Items");
		    
		    
		    while(i.hasNext())
			{
				Shopping sp=i.next();
				
				if(sp.getItems().equals("ABC") )
				{
					i.remove();
				}
			}
		    
		   
			for(Shopping sp:h)
			{
				System.out.println(sp.getId() +"\t"+ sp.getPrice() +"\t"+ sp.getItems());
			}
			
		}
		
		
		
	}


