package collection_code;

public class Student
{
	private int id;
		private String name;
		private int grade;
		
		
	 

	public  Student()
	   {
		   
	   }
	   
	   
	   public  Student(int id,String name,int grade)
	   {
		    this.id=id;
		    this.name=name;
		    this.grade=grade;
		    
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


	    public int getGrade()
	    {
		return grade;
	    }


	    public void setGrade(int grade)
	    {
		this.grade = grade;
	    }
	   
	   

	}






