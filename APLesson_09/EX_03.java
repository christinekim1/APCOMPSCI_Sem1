import java.util.Scanner;
public class EX_03
{
	
	public static void main(String[]args)
	{	
		int [] numbers = new int[10];
		System.out.println("Numbers...");
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
		
		for(int number : numbers)
		{
			System.out.print(number + " ");
			
		}
		System.out.println("\nThe average of the above numbers is " + average(numbers));
	}
	public static int average(int [] numbers)
	{
		int average = 0;
		for(int number : numbers)
		{
			average += number;
		}
		return average/numbers.length;
	}
}