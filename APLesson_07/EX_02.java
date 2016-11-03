import java.util.Scanner;

public class EX_02
{
	static int number;
	static int num;
	static int digits = 0;
	static int average = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = keyboard.nextInt();
		num = number;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avDigits()
	{
		while(num > 0)
		{
			digits += 1;
			average = (num % 10) + average;
			num = num /= 10;
		}
		average = average / digits;
	}
}