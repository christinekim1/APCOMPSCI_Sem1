import java.util.Scanner;

public class Average2
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double num1 = keyboard.nextDouble();
		System.out.println("Please enter the second number:");
		double num2 = keyboard.nextDouble();
		System.out.println("Please enter the third number:");
		double num3 = keyboard.nextDouble();
		print(num1, num2, num3, average(num1, num2, num3));
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(double num1, double num2, double num3, double average)
	{
		System.out.printf("The average of %1.1f, %1.1f, and %1.1f is %.5f", num1, num2, num3, average);
	}
}