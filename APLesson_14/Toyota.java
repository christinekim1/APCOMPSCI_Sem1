import java.util.Arrays;
public class Toyota implements Location
{
	private	double[] location;
	double x;
	double y;
	
	public Toyota(String a)
	{
		String[] loc = a.split(", ");
		x = Double.parseDouble(loc[0]);
		y = Double.parseDouble(loc[1]);

	}
	public int getID()
	{
		return (int)(Math.random()*1000000);
	}
	public void move(double x1 , double y1)
	{
		x += x1;
		y += y1;
	}
	public double[] getLoc()
	{
		double[] location = {x,y};
		return location; 
		
	}
}