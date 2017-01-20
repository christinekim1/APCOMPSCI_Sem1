import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_06
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String [HEALTHLOAD];
		
		while(turn !="Q" && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = keyboard.nextLine();
			damage = (int)(Math.random()*2 + 1);
			amount = (int)(Math.random()*6 + 1);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!");
	}
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount = healthCount - amount;
			return "Taking " + amount + " damage!";
		}
		else
		{
			if(healthCount + amount < HEALTHLOAD)
			{
				amount = amount + healthCount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
		}
		return "Power up " + amount + "!";
	}
	public static void printClip()
	{
		String output = "Health: \t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output = output + health[i];
		}
		System.out.println(output);
	}
}