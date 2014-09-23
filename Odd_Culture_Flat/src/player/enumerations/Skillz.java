package player.enumerations;

public enum Skillz 
{
	STAFF(10),
	KNIFETHROW(15),
	SWORD(15),
	GLAIVE(20),
	ARMDISC(30),
	FLAMEDISC(40),
	HANDGUN(50),
	LONGGUN(60),
	POIDANSE(80), //fire magic
	KWAYRDANSE(80), //water magic
	SHALDANSE(80), //air magic
	TERIDANSE(80), //earth magic
	SEDANSE(80), //chaos magic
	UBASDANSE(80), //"order" (light) magic
	FLIGHTASSISTED(100),
	FLIGHT(150);
	
	private int value;
	
	private Skillz(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
