import java.util.Scanner;

public class EX_07
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your word:");
		String word = keyboard.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}


