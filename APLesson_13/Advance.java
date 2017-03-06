public class Advance extends Ticket
{
	private int daysLeft;
	public double price; 
	
	public Advance(int d)
	{
		super();
		daysLeft = d;
		
		if(daysLeft > 10)
		{
			price = 30.00;
		}
		else
		{
			price = 40.00;
		}
	}
		
	public double getPrice()
	{
		return this.price;
	}
	
}