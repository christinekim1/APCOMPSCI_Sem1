import java.util.Scanner; //import Statement

public class EX_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		
		int height = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds?");
	
		int weight = keyboard.nextInt();
		
		int x = weight*703;
		int y = height*height;
		int bmi = x/y;
		
		System.out.println("Your bmi is " + bmi );
	}
}