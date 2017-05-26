/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card first = new Card("3", "Heart", 6);
		Card second = new Card("8", "Clover", 8);
		Card third = new Card("2", "Spade", 4);
		Card fourth = new Card("3", "Diamond", 4);
		Card fifth = new Card("10", "Heart", 13);

		System.out.println("first card matches second card: " + first.matches(second));
		System.out.println("first card matches fourth card: " + first.matches(fourth));
		System.out.println("suit of fifth card: " + fifth.suit());
		System.out.println("point value of third card: " + third.pointValue());
	}
}
