import java.util.Scanner;

public class EX_08
{
	static String word;
	static int repeat;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[]args)
	{	
		sing();
		sing();
		sing();
		sing();
	}
	public static void sing()
	{
		System.out.println("Please enter your word:");
		word = keyboard.next();
		System.out.println("How many times should it repeat?");
		repeat = keyboard.nextInt();
		
		for(int i = 1; i <= repeat; i++)
		{
			System.out.print(word + " ");
			System.out.println("\n");
		}
	}
}


