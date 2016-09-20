import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		//inputs item1
		System.out.println("Please enter item 1:");
		String order1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		//inputs item2
		System.out.println("Please enter item 2:");
		String order2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		//inputs item3
		System.out.println("Please enter item 3:");
		keyboard.nextLine();
		String order3 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3;
		double tax = .075* subtotal;
		double total = subtotal + tax;
		
		
		EX_01 form = new EX_01();
	
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(order1, price1);
		form.format(order2, price2);
		form.format(order3, price3);
		
		System.out.println("\n");
		
		double number4 = subtotal;
		form.format("Subtotal:", number4);

		double number5 = tax;
		form.format("Tax:", number5);

		double number6 = total;
		form.format("Total", number6);
		
		System.out.println("\n_____________________________________________\n* Thank you for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%-1s %20s %25s\t%25.2f","*  ", word,"............", number);
		
	}
}