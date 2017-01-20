import java.util.Scanner;
public class Inventorymain
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the item manufacturer: ");
		String itemmanu = keyboard.nextLine();
		System.out.println("Please enter the item name: ");
		String itemname = keyboard.nextLine();
		System.out.println("Will you be entering the category and price information?");
		String answer = keyboard.nextLine();
		
		if(answer.equals("N"))
		{
			Inventory object = new Inventory(itemmanu, itemname);
			System.out.println(object);
		}
		else if(answer.equals("Y"))
		{
			System.out.println("Please enter the item category: ");
			String itemcat = keyboard.next();
			System.out.println("Please enter the item price: ");
			int price = keyboard.nextInt();
			Inventory object1 = new Inventory(itemmanu, itemname, itemcat, price);
			System.out.println(object1);
		}
	}
}