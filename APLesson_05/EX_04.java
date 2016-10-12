import java.util.Scanner;

public class EX_04
{
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = keyboard.nextDouble();
		
		calcBMI(height, weight);
		
		System.out.print("Your BMI indicates that you are " + condition);
	}
	public static String calcBMI(double height, double weight)
	{
		double BMI = (weight*703)/(height*height);
		if(BMI <= 18.5)
			condition = "Underweight";
		else if(BMI <= 24.9) 
			condition = "Normal";
		else if(BMI <= 29.9)
			condition = "Overweight";
		else if(BMI <= 34.9)
			condition = "Obese";
		else if(BMI <= 39.9)
			condition = "Very Obese";
		if(BMI >39.9)
			condition = "Morbidly Obese";
			
		return condition;
		
	}
}