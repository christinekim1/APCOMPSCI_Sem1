import java.util.Scanner;
public class Useravatar
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String firstName = keyboard.nextLine();
		System.out.println("Please enter your last name");
		String lastName = keyboard.nextLine();
		System.out.println("Would you like a public avatar? Y or N.");
		String avatar = keyboard.nextLine();
		if(avatar.equals("N"))
		{
			User object = new User(firstName, lastName);
			System.out.println(object);
		}
		else if(avatar.equals("Y"))
		{
			System.out.println("What would you like your Avatar name to be?");
			String avatarname = keyboard.next();
			User object1 = new User(firstName, lastName, avatarname);
			System.out.println(object1);
		}
	}
}