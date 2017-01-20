
public class Car
{
	private String color, model, brand, type;
	
	public Car()
	{
		color = "";
		model = "";
		brand = "";
		type = "";
	}
	public Car(String c, String m, String b, String t)
	{
		color = c;
		model = m;
		brand = b;
		type = t;
	}
	public void setValues(String c, String m, String b, String t)
	{
		color = c;
		model = m;
		brand = b;
		type = t;
	}
	public String getcolor()
	{
		return color;
	}
	public String getmodel()
	{
		return model;
	}
	public String getbrand()
	{
		return brand;
	}
	public String gettype()
	{
		return type;
	}
}