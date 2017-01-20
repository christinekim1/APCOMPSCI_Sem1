public class Inventory
{
   private String itemmanu;
   private String itemname;
   private String itemcat;
   private int upc;
   private int price;

	public Inventory(String im, String in)
	{
		itemmanu = im;
		itemname = in;
		upc = (int)(Math.random() * 1000000) + 1;
	}
	
	public Inventory(String im, String in, String ic, int p)
	{
		itemmanu= im;
		itemname = in;
		itemcat = ic;
		upc = (int)(Math.random() * 1000000) + 1;
		price = p;
	}
	
	public String getmanu()
	{
		return itemmanu;
	}
	public String getname()
	{
		return itemmanu;
	}
	public String getcat()
	{
		return itemcat;
	}
	public int getupc()
	{
		return upc;
	}
	public int getprice()
	{
		return price;
	}
	public String toString()
	{
		return "Inventory Info...\nItem Manufacturer: " + itemmanu + "\nItem Name: " + itemname +"\nItem Category: " + itemcat +"\nUPC#: " + upc + "\nItem Price: " + price;
	}

}