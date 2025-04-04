package collection_code;


public class Employee implements Comparable
{

	private int id ;
	private String name;
	private int Salary;
	
	
	public Employee()
	{
		
	}
	
	
	public Employee(int id,String name,int Salary)
	{
		this.id=id;
		this.name=name;	
		this.Salary=Salary;
	}
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getSalary() 
	{
		return Salary;
	}
	public void setSalary(int salary) 
	{
		Salary = salary;
	}
	



@Override
public int compareTo(Object o) 
{
	Employee e=(Employee)o;
	
	if(this.Salary > e.Salary)
	{
		return 1;
	}
	else if(this.Salary < e.Salary)
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
}

}








