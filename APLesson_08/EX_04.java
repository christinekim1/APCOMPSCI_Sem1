import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = keyboard.next();
		int stop = word.length();
		int start = 0;
		tree(word, start, stop);
	}
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%25s \n", word.substring(0, start));
			start = 1 + start;
			tree(word, start, stop);
		}
	}
}