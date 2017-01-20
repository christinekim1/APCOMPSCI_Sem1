public class User
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;

	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String getfirst()
	{
		return firstName;
	}
	public String getlast()
	{
		return lastName;
	}
	public String getavatar()
	{
		return avatar;
	}
	public int getUser()
	{
		return userID;
	}
	public String toString()
	{
	return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName +"\nAvatar: " + avatar +"\nUser ID#: " + userID;
	}

}