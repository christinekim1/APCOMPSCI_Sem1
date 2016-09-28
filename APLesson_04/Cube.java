import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of one side of the cube:");
		side = keyboard.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6*Math.pow(side, 2);
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube with side length " + side + " is " + sa);
	}
}