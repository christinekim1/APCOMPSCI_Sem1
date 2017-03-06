public class GameSystem
{
	public String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random()*(9000000 + 1000000));
	}
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*(9000000 + 1000000));
	}
	public String getplatform()
	{
		return this.platform;
	}
	public int getserial()
	{
		return this.serialNo;
	}
	public void setplatform(String p)
	{
		this.platform = p;
	}
	public void setserial()
	{
		this.serialNo = (int)(Math.random()*(9000000 + 1000000));
	}
}