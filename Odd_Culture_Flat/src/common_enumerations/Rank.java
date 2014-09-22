package common_enumerations;

public enum Rank 
{
	NIBBLER(0),
	PRIVATE(5),
	FIRSTCLASS(10),
	LANCE(15),
	CORPORAL(20),
	SERGEANT(25),
	STAFF(30),
	GUNNY(35),
	MASTER(40),
	FIRST(45),
	MASTERGUNNY(50),
	MAJOR(55),
	TOPCOMMANDER(60);
	
	private int value;
	
	private Rank(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
