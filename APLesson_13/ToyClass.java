import java.lang.Math;
public abstract class ToyClass
{
	private String name;
	private int count;
	
	public ToyClass()
	{
		this.name = "";
		this.count = 1;
	}
	public ToyClass(String n)
	{
		this.name = n;
		this.count = 1;
	}
	public String getName()
	{
		return this.name;
	}
	public int getCount()
	{
		return this.count;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return this.name + " " + this.count; 
	}
}