import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the principal:");
		double principal = kb.nextDouble();
		System.out.println("Please enter the interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Please enter the life of the loan in years:");
		double life = kb.nextDouble();
		
		double compint = total(principal, rate, number, life);
		double payment = compint/(life * 12);
		
		System.out.printf("Your monthly total is $%5.2f\n", payment);
		System.out.printf("The total cost of the loan is $%5.2f", compint);
		
	}
	
	public static double total(double P, double r, double n, double t)
	{
		return P*Math.pow((1+(r/n)), (n*t));
	}
}