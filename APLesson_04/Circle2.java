import java.util.Scanner;

public class Circle2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius length:");
		double r = keyboard.nextDouble();
		
		print(r, Area(r));
	}
	
	public static double Area(double r)
	{
		return 3.14*Math.pow(r, 2);
		
	}
	
	public static void print(double r, double Area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f.", Area);
	}
	
	public void format (double number)
	{
		System.out.printf("%.5f, number");
	}

}