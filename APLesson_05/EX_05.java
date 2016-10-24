import java.util.Scanner;
public class EX_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Christine's adventure!");
		System.out.println("What is your weapon of Choice? Pick a number! \n1. Rocket Launcher\n2. Sword\n3. Bow & Arrow");
		int weapon = keyboard.nextInt();
		if(weapon == 1)
		{
			System.out.println("Nice Choice! Pick your enemy!");
			System.out.println("1. Aliens\n2. Donald Trump\n3. Zombies");
			int enemy = keyboard.nextInt();
			if(enemy == 2)
			{
				System.out.println("You defeated the Donald!!");
				System.out.println("Now for the last challenge! What's your favorite food?");
				System.out.println("1. PB&J\n2. Cake\n3. Burritos");
				int food = keyboard.nextInt();
				if(food == 1)
				{
					System.out.println("Congrats! You win the game!");
				}
				else
				{
					if(food == 2)
						System.out.println("Wrong! You lose!");
					if(food ==3)
						System.out.println("I respect that. But it's the wrong answer! You lose!");
				}
			}
			else
			{
				if(enemy == 1)
					System.out.println("The Aliens were too strong! You died!");
				if(enemy == 3)
					System.out.println("The Zombies ate you and you turned into a Zombie! You lose!");
			}
		}
		else 
		{
			if(weapon == 2)
				System.out.println("A Sword? You can't fight anything with a Sword!");
			if (weapon == 3)
				System.out.println("Nobody uses a bow and arrow these days...");
		}
	}
}