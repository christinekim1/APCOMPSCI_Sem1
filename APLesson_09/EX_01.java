import java.util.Scanner;
public class EX_01
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		
		String [] words = new String[5];
		
		System.out.println("Please enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		
		System.out.println("In order...");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		System.out.println("\nReversed...");
		reverse(words);
	}
	public static void reverse(String[] words)
	{
		for(int i= words.length-1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
	}
}