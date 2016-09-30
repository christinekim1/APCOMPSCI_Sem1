import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		num1 = keyboard.nextDouble();
		System.out.println("Please enter the second number:");
		num2 = keyboard.nextDouble();
		System.out.println("Please enter the third number:");
		num3 = keyboard.nextDouble();
		print(average(num1, num2, num3));
	}
		
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of %1.1f, %1.1f, and %1.1f is %.5f", num1, num2, num3, avg);
	}
}