public class ToyRunner
{
	public static void main(String[]args)
	{
		
		ToyStore t = new ToyStore("Hotwheel, Car, G.I.Joes, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List..." + t);
		System.out.println("\nMost Frequent Toy: " + t.GetMostFrequentToy() + "\n Most Frequent Type; " + t.GetMostFrequentType());
	}
}