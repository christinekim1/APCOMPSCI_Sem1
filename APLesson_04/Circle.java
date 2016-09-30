import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius length:");
		r = keyboard.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*Math.pow(r, 2);
		
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f, number.", area);
	}
	
	public void format (double number)
	{
		System.out.printf("%.5f, number");
	}

}