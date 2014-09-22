package player.enumerations;

public enum EconomicClass 
{
	BUBASTITE(100),
	MONTHITE(100),
	HERUIAN(100),
	SHEMSUIN(75),
	MEDJAY(75),
	SABUIN(50),
	DJEHNIAN(50),
	SAKHMIAN(50),
	KHONSAN(50),
	REKHETIAN(25);
	
	private int value;
	
	private EconomicClass(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
