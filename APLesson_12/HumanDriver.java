import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the color of the hair ");
		String hair = keyboard.nextLine();
		System.out.println("Please enter the color of the eyes ");
		String eyes = keyboard.nextLine();
		System.out.println("Please enter the color of the skin ");
		String skin = keyboard.nextLine();

		Human object = new Human(hair, eyes, skin);
	
	System.out.println("My info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());
		
	}
}