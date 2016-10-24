import java.util.Scanner;

public class EX_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Until what number would you like to count from?");
		int input = keyboard.nextInt();
		System.out.println("By what number would you like to count?");
		int function = keyboard.nextInt();
		
		for(int i = 1; i <= input; i+=function)
		{
			System.out.print(i + " ");
		}
	}
}


