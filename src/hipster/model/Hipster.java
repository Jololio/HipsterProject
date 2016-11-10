package hipster.model;

public class Hipster 
{
	private String name;
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is " + name;
		
		return description;
	}
}
 