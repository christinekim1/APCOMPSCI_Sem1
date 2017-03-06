public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation first = new PlayStation("lool");
		Xbox second = new Xbox("skjda");
		PC third = new PC("sdkjfsdf");
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
	}
}