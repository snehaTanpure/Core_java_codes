package collection_code;



public class Shopping
{

	private int id;
	private int price;
	private String items;
	
	public  Shopping()
	{
		
	}
	
	public Shopping(int id,int price,String items)
	{
		this.id=id;
		this.price=price;
		this.items=items;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		items = items;
	}
	
	
}
