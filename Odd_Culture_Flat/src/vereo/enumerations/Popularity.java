package vereo.enumerations;

public enum Popularity 
{
	DESPISED(-.5),
	DISLIKED(-.3),
	MEH(-.1),
	UNKNOWN(1),
	ISOK(.1),
	COOL(.3),
	WORLDRENOWNED(.5);
	
	
	private double value;
	
	private Popularity(double value)
	{
		this.value = value;
	}
	
	public double returnValue()
	{
		return this.value;
	}
}
