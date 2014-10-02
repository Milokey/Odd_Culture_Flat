package vereo.enumerations;

public enum Hunger 
{
	DYING(-100),
	RAVENOUS(-50),
	PECKISH(-10),
	GOODTOGO(0), //Status OK
	HAPPY(15), //Status OK
	COOL(25), //Status OK
	SATISFIED(50), //Status OK
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
