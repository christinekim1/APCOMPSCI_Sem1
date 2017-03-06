public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure af = new AFigure("action figure");
		Car c = new Car("car");
		
		System.out.println(af.toString());
		System.out.println(c.toString());
		
		ToyStore object = new ToyStore("Hotwheel, Car, G.I.Joes, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(object);
		System.out.println("\nMost Frequent Toy: " + object.GetMostFrequentToy() + "\n Most Frequent Type; " + object.GetMostFrequentType());
	}
}