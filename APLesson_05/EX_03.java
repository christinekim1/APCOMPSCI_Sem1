import java.util.Scanner;

public class EX_03
{
	static String grd1;
	static String grd2;
	static String grd3;
	static String grd4;
	static String grd5;
	static String grd6;
	static String grd7;
	static double gradePoints;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your letter grade for math: ");
		grd1 = keyboard.next();
		
		System.out.println("Please enter your letter grade for history:");
		grd2 = keyboard.next();
		
		System.out.println("Please enter your letter grade for Compsci:");
		grd3 = keyboard.next();
		
		System.out.println("Please enter your letter grade for science:");
		grd4 = keyboard.next();
		
		System.out.println("Please enter your letter grade for band:");
		grd5 = keyboard.next();
		
		System.out.println("Please enter your letter grade for government:");
		grd6 = keyboard.next();
		
		System.out.println("Please enter your letter grade for english:");
		grd7 = keyboard.next();
		
		double gPoints = calcPoints(grd1)+calcPoints(grd2)+calcPoints(grd3)+calcPoints(grd4)+calcPoints(grd5)+calcPoints(grd6)+calcPoints(grd7);
		double total = gPoints/7;
		System.out.printf("You GPA is %.2f", total);
	}
	public static double calcPoints(String grade)
	{
		gradePoints = 0;
		if(grade.equals("A"))
			gradePoints = 4.0;
		if(grade.equals("B"))
			gradePoints = 3.0;
		if(grade.equals("C"))
			gradePoints = 2.0;
		if(grade.equals("D"))
			gradePoints = 1.0;
		if(grade.equals("F"))
			gradePoints = 0.0;
		
		return gradePoints;
	}
	
}