import java.util.Scanner;

public class EX_02
{
	static double discount;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//item1
		System.out.println("Please enter the first item:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price of item 1:");
		double Pitem1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//item2
		System.out.println("Please enter the second item:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price of item 2:");
		double Pitem2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//item3
		System.out.println("Please enter the third item:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price of item 3:");
		double Pitem3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//item4
		System.out.println("Please enter the fourth item:");
		String item4 = keyboard.nextLine();
		System.out.println("Please enter the price of item 4:");
		double Pitem4 = keyboard.nextDouble();
		
		
		//calculations
		double subtotal = (Pitem1 + Pitem2 + Pitem3 + Pitem4);
		calcDisc(subtotal);
		double total = subtotal - discount; 
		double taxtotal = .08*total + total;
		
		//receipt
		
		EX_02 form = new EX_02();
		System.out.println("<<<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>>>");
		form.format(item1, Pitem1);
		form.format(item2, Pitem2);
		form.format(item3, Pitem3);
		form.format(item4, Pitem4);
		System.out.println("\n");
		form.format("Subtotal:", subtotal);
		form.format("Discount:", discount);
		form.format("Total:", taxtotal);
		
		System.out.println("\n_____________________________________________\n* Thank you for your support *");
		
	}
	public static void calcDisc(double subtotal)
	{
		if(subtotal >= 2000)
		{
			discount = .15*subtotal;
		}
		if(subtotal < 2000)
		{
			discount = 0;
		}
		
	}
	public void format(String word, double number)
	{
		System.out.printf("\n%-1s %20s %25s\t%25.2f","*  ", word,"............", number);
	}
}
