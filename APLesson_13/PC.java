public class PC extends GameSystem
{
	public PC(String p)
	{
		super(p);
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform:\t " + platform + "\nSerial #: " + getserial() + "\nSystem Input: " + systemInput();
	}
}