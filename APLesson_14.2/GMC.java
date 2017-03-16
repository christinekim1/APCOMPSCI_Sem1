import java.util.ArrayList;
public class GMC extends Car 
{
	double x;
	double y;

	public GMC()
	{
		x = 0;
		y = 0;
	}
	public GMC(double X, double Y)
	{
		x = Y;
		y = Y;
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