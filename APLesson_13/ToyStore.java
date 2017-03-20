import java.util.Arrays;
import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<ToyClass> ToyList;
	
	public ToyStore()
	{
		ToyList = new ArrayList<ToyClass>();
		
	}
	public ToyStore(String n)
	{
		loadToys(n);
	}
	public void loadToys(String ts)
	{
		ToyList = new ArrayList<ToyClass>();
		ArrayList<String> Toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		
		for(int i=0; i < Toys.size(); i+=2)
		{
			String name = Toys.get(i);
			String type = Toys.get(i+1);
			ToyClass t = getThatToy(name);
			
			if(t == null)
			{
				if(type.equals("Car"))
				{
					ToyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					ToyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1); 
			}
		}
	}
	public ToyClass getThatToy(String nm)
	{
		for(int i=0; i< ToyList.size(); i++)
		{
			if(ToyList.get(i).getName().equals(nm))
			{
				return ToyList.get(i);
			}

		}
		return null;
	}
	public String GetMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(ToyClass t : ToyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
			
			
		}
		return name; 
	}
	public String GetMostFrequentType()
	{
		int cars = 0;
		int figures = 0; 
		
		for(ToyClass t : ToyList) 
		{
			if(t.getType().equals("Car"))
			{
				cars ++;
			}
			else if(t.getType().equals("AF"))
			{
				figures ++;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	public  String toString()
	{
		return "" + ToyList; 
	}
}