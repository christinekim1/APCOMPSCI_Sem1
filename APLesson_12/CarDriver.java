import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the color ");
		String color = keyboard.nextLine();
		System.out.println("Please enter the model ");
		String model = keyboard.nextLine();
		System.out.println("Please enter the brand ");
		String brand = keyboard.nextLine();
		System.out.println("Please enter the type ");
		String type = keyboard.nextLine();

		Car object = new Car(color, model, brand, type);
	
	System.out.println("Your vehicle is ready.........\nColor:\t" + object.getcolor() + "\nModel:\t" + object.getmodel() + "\nBrand:\t" + object.getbrand() + "\nType:\t" + object.gettype());
		
	}
}