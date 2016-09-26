import java.util.Scanner;

public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 subwoof = new EX_04();
		System.out.println("Please enter the height in inches:");
		double height = keyboard.nextDouble();
		System.out.println("Please enter the length in inches:");
		double length = keyboard.nextDouble();
		System.out.println("Please enter the width in inches:");
		double width = keyboard.nextDouble();
		
		double vol = subwoof.volume(height, width, length, 1728.00);
		System.out.println("Your volume in cubic feet is: "+ vol);
		
		
		
	}
	
	public double volume(double h, double w, double l, double k)
	{
		return (h*w*l)*(1/k);
	}
}