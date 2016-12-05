import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the equation");
		String expression = keyboard.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
		
	}
	public static ArrayList<String> doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+"))
			{
				equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(equation.get(i).equals("-"))
			{
				equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(equation.get(i).equals("*"))
			{
				equation.set(i, " " + (Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(equation.get(i).equals("/"))
			{	
				equation.set(i, " " + (Integer.parseInt(equation.get(i-1))/Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
		i++;
		}
		return equation;
	}
}