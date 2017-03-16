public class Honda extends Car
{
	private double[] location;
	private double x;
	private double y;
	
	public Honda(double[] loc)
	{
		location = loc;
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
		return location; 
		
	}
}