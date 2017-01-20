import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the hours: ");
		int hour = keyboard.nextInt();
		System.out.println("Please enter the minutes: ");
		int minute = keyboard.nextInt();
		System.out.println("Please enter the distance: ");
		int distance = keyboard.nextInt();

		MilesPerHour object = new MilesPerHour(hour, minute, distance);
		
		System.out.println(object.getdistance() + " miles in " + object.gethour() + " hours and " + object.getminute() + " minutes = " + object.getMPH() + " mph");
		
	}
}