public abstract class TicketDriver 
{
	public static void main(String[]args)
	{
		Ticket walkup = new Walkup();
		Ticket advance = new StudentAdvance(9);
		Ticket Student = new Advance(9);
		
		System.out.println("Receipt: " + walkup +"\n"+ advance + "\n" + Student);

	}
}