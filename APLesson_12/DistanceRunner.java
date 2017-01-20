import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first x value: ");
		int xOne = keyboard.nextInt();
		System.out.println("Please enter the first y value: ");
		int yOne = keyboard.nextInt();
		System.out.println("Please enter the second x value: ");
		int xTwo = keyboard.nextInt();
		System.out.println("Please enter the second y value: ");
		int yTwo = keyboard.nextInt();

		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("distance = " + object.getDist());
		
	}
}