import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hour, minute;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hour = 0;
		minute = 0;
		mph = 0;
	}
	public MilesPerHour(int h, int m, int d)
	{
		hour = h;
		minute = m;
		distance = d;
		mph= 0;
	}
	public void setValues(int h, int m, int d)
	{
		hour = h;
		minute = m;
		distance = d;
		mph = 0;
	}
	public int getdistance()
	{
		return distance;
	}
	public int gethour()
	{
		return hour;
	}
	public int getminute()
	{
		return minute;
	}
	public double getMPH()
	{
		mph = Math.round(distance/ (hour + minute / 60));
		return mph;
	}
}