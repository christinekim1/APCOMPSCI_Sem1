import java.util.Scanner;

public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number of inputs you would like:");
		int input = keyboard.nextInt();
		System.out.println("What number would you like to multiply by?");
		int function = keyboard.nextInt();
		
		System.out.println("input   |  ouput");
		
		for(int i = 1; i <= input; i++)
		{
			System.out.printf("%6d  |  %6d\n", i, i*function);
		}
	}
}


