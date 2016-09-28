import java.util.Scanner;
public class Rectangle
{

	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length:");
		l = keyboard.nextDouble();
		System.out.println("Please enter the width:");
		w = keyboard.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2.0*(l) + 2.0*(w);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter + " feet around.");
	}
		
}