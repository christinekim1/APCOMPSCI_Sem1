import java.util.Scanner; //import Statement

public class EX_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Hello, what is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Hi, " + name + ". Today we are going to calculate your weight in kilograms. What is your weight to the nearest pound?");
		
		int weight = keyboard.nextInt();
		
		double factor = 2.2;
		
		double kg = weight/factor;
		
		System.out.println("Your weight in kilograms is " + kg + "!");
	}
}