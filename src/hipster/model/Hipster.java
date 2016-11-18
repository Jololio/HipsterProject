package hipster.model;

public class Hipster 
{
	private String name;
	private int hipsterRank;
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is " + name;
		description += ", and her/his hipster rank is: " + hipsterRank;
		
		return description;
	}
	
	public void calculateHipsterRank()
	{
		hipsterRank = (int) (Math.random() * 10);
	}
	
	public void calculateHipsterRank(int scale)
	{
		hipsterRank = (int) (Math.random() * scale);
	}
	
	public void calculateHipsterRank(int scale, int shift)
	{
		hipsterRank = (int) (Math.random() * scale) + shift;
	}
	
	public int getHipsterRank()
	{
		return hipsterRank;
	}
	
	
}
 