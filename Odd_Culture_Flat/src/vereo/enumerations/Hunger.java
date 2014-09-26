package vereo.enumerations;

public enum Hunger 
{
	DYING(-100),
	RAVENOUS(-50),
	PECKISH(-10),
	SATISFIED(50),
	FULL(75),
	OVERSTUFFED(-50);
	
	private int value;
	
	private Hunger(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
