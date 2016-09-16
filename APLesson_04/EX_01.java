import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String order1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		System.out.println("Please enter item 2:");
		String order2 = keyboard.nextLine();
		keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3:");
		String order3 = keyboard.nextLine();
		keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3;
		double tax = .075* subtotal;
		double total = subtotal + tax;
		
		
		EX_01 form = new EX_01();
	
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		String word1 = order1;
		double number1 = price1;
		form.format(word1, number1);
		
		String word2 = order2;
		double number2 = price2;
		form.format(word2, number2);
		
		String word3 = order3;
		double number3 = price3;
		form.format(word3, number3);
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n * %16s ........      %10.2f", word, number);
		
	}
}