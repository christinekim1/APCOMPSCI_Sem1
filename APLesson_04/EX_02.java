import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String Fname = keyboard.next();
		
		System.out.println("Enter your last name:");
		String Lname = keyboard.next();
		keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		
		
		System.out.println("Enter the school site:");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		EX_02 Id = new EX_02();
		
		System.out.println("**************************************");
		
		Id.format(school, year);
		Id.format(Fname, Lname);
		Id.format(title, subject);
		
		System.out.println("\n\n**************************************");
	
	}
	
	public void format(String first, String second)
	{
		System.out.printf("\n*  %-15s %18s *", first, second);
	}
}