/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = "10", "Ace", "5", "Queen";
		String[] suit = "Spade", "Clover", "Diamond", "Hearts";
		int[] value = {15, 20, 25, 30};
		Deck cards = Deck(rank, suit, value);

		System.out.println("Your cards are: " + cards.deal());
		System.out.println("The deck size is: " + cards.size());
		System.out.println("The deck is empty: " + cards.isEmpty());

	}
}
