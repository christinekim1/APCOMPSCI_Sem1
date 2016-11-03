import java.util.Scanner;

public class EX_03
{
	static int number;
	static int num;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = keyboard.nextInt();
		num = number;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num >0)
		{
			rev = rev*10;
			rev = (num % 10) + rev;
			num = num /= 10;
		}
	}
}