import java.util.Scanner;
public class EX_05
{
	static int [] numbers = new int[10];
	public static void main(String[]args)
	{	
		fillArray();
		System.out.println("For the following numbers..");
		printArray();
		System.out.println("The " + getOdds() + "are odd numbers");
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.print(number + " ");
			
		}
	}
	public static String getOdds()
	{
		String odds = " ";
		for(int number : numbers)
		{
			if(number % 2 == 1)
			{
				odds += number + " ";
			}
		}	
		return odds;
	}
}