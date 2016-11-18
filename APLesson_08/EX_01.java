import java.util.Scanner;

public class EX_01
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		sentence = keyboard.nextLine();
		System.out.println(replace());
	}
	public static String replace()
	{
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1);
		}
		return sentence;
	}
}