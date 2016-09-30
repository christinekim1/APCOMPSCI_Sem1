import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length:");
		int l = keyboard.nextInt();
		System.out.println("Please enter the width:");
		int w = keyboard.nextInt();
		print(calcPerim(l, w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return 2*(l) + 2*(w);
	}
	
	public static void print(int perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " feet around.");
	}
		
}