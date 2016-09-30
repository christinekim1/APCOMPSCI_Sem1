import java.util.Scanner;

public class Cube2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of one side of the cube:");
		double side = keyboard.nextDouble();
		print(side,sa(side));
	}
	
	public static double sa(double side)
	{
		return 6*Math.pow(side, 2);
	}
	
	public static void print(double side, double sa)
	{
		System.out.println("The surface area of a cube with side length " + side + " is " + sa);
	}
}