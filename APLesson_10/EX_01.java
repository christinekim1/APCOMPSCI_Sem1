
import java.util.ArrayList;
import java.util.Arrays;
public class EX_01
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("The numbers are:" + nums);
		System.out.println("The Composite` numbers in this list are" + removeComposites(nums));
	}
	public static int gFactor(int n)
	{
		for(int i =2; i < n; i++)
		{
			if(n % i == 0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static ArrayList<Integer> removeComposites(ArrayList<Integer> nums)
	{
		for(int i = 0; i<= nums.size(); i++)
		{
			if(gFactor(nums.get(i)) == 0)
			{
				nums.remove(i);
			}
		}
		return nums;
	
	}
}