import java.util.Scanner;
public class EX_06
{
	static String password;
	static String username;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		password = "christineiscool";
		username = "christine";
		passCheck();
	}
	public static String passCheck()
	{
		System.out.println("Username:");
		String answer1 = keyboard.next();
		System.out.println("Password:");
		String answer2 = keyboard.next();
		
		if(answer1.equals(username) && answer2.equals(password))
		{
			System.out.println("You are granted access!");
			
		}
		else
		{
			if(!answer1.equals(username))
				System.out.println("Your username is incorrect!");
			if(!answer2.equals(password))
				System.out.println("Your password is incorrect!");
			if(!answer1.equals(username) && answer2.equals(password))
				System.out.println("Your username and password are incorrect!");
			
			passCheck();
		}
	}
}