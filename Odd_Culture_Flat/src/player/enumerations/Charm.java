package player.enumerations;

public enum Charm 
{
	DUNCE(-25),
	AWKWARD(-10),
	WEIRD(0),
	AVERAGE(10),
	CHARMERINTRAINING(25),
	CHARMER(40),
	SUAVE(55);
	
	private int value;
	
	private Charm(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
