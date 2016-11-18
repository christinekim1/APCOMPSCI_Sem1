import java.util.Scanner;
public class EX_02
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String [] words = new String[5];
		
		System.out.println("Please enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		first(words);
	}
	public static void first(String[] words)
	{
		for(String word : words)
		{
		System.out.print(word.charAt(0) + " ");
		}
	}
}