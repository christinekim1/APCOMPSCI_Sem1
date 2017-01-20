public class User
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
   User pH = new User("Professor", "Handsome");
   
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	User pH2 = new User("Professor", "Handsome", "profHansizzle");
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
	return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName +"\nAvatar: " + avatar +"\nUser ID#: " + userID;
	}
	
	public static void main(String[]args)
	{
		User pH = new User("Professor", "Handsome");
		System.out.println(pH);
		System.out.println();
		User pH2 = new User("Professor", "Handsome", "profHansizzle");
		System.out.println(pH2);
	}
}