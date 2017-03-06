public class StudentAdvance extends Advance
{
	public StudentAdvance(int x)
	{
		super(x);
	}
	public double getPrice()
	{
		return price / 2;
	}
	public String toString()
	{
		return "Serial No: " + getSerialNo() + "\nPrice: " + getPrice() + "\nSTUDENT ID REQUIRED:" ;
	}
}