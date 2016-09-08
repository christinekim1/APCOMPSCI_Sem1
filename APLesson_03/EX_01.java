import java.util.Scanner; //import Statement

public class APLab_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
	
		//prompt for user imput
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println(name + "?? What an ugly name.");
		
		System.out.println("So, " + name + ", how old are you?");
		
		int age = keyboard.nextInt();
		
		System.out.println( "You look so old for " + age + "!" );
		
		System.out.println("What does a " + age + " year old like you do for fun?");
		
		String fun = keyboard.next();
		
		System.out.println(fun + "? That's so dumb.");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Only losers listen to " + music);
		
		System.out.println("How many siblings do you have?");
		
		String sibling = keyboard.next();
		
		System.out.println(sibling + "? Your family is probably all smarter than you.");
		
		System.out.println(name + ", what do you want to be when you grow up?");
		
		String dream = keyboard.next();
		
		System.out.println( "With the way your life is going right now, I doubt you will be able to become a " + dream);
	}
}