import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_03 interest = new EX_03();
		System.out.println("Please enter the principal:");
		double principal = kb.nextDouble();
		System.out.println("Please enter the interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		System.out.println("Please enter the life of the loan in years:");
		double life = kb.nextDouble();
		double compint = interest.ci(principal, rate, number, life);
		System.out.printf("Your monthly total is $%5.2f\n", compint);
		
		double tot = interest.total(compint, life, 12);
		System.out.printf("The total cost of the loan is $%5.2f", tot);
		
	}
	
	public double ci(double P, double r, double n, double t)
	{
		return P*(Math.pow((1+(r/n)), (n*t)));
	}
	public double total(double i, double l, double x)
	{
		return (i/l)*12;
	}
}