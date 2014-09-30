package inventory.battleitems;

/**
 * A BattleItem that has no special effects.
 * BattleItems may be used in battle to 
 * decrease opponent Vereos' stats or to
 * increase Player Vereos' stats.
 * 
 * @author tblount
 */
public class BattleItem 
{
	private String name;
	private Double cost;
	private int recovery;
	private int strengthReduction;
	private int defenseReduction;
	private int speedReduction;
	private int hpReduction;
	private int mpReduction;
	private int strengthIncrease;
	private int defenseIncrease;
	private int speedIncrease;
	private int hpIncrease;
	private int mpIncrease;
	private int durationInTurns;
	
	/**
	 * Initialize a BattleItem with all the fields
	 * 
	 * @param name the name
	 * @param cost the cost
	 * @param recovery the recovery amount
	 * @param strengthReduction the strength reduction amount
	 * @param defenseReduction the defense reduction amount
	 * @param speedReduction the speed reduction amount
	 * @param hpReduction the hp reduction amount
	 * @param mpReduction the mp reduction amount
	 * @param strengthIncrease the strength increase amount
	 * @param defenseIncrease the defense increase amount
	 * @param speedIncrease the speed increase amount
	 * @param hpIncrease the hp increase amount
	 * @param mpIncrease the mp increase amount
	 * @param duration the duration of the effect(s)
	 */
	public BattleItem(String name, Double cost, int recovery,
			int strengthReduction, int defenseReduction, int speedReduction,
			int hpReduction, int mpReduction, int strengthIncrease,
			int defenseIncrease, int speedIncrease, int hpIncrease,
			int mpIncrease, int duration) 
	{
		this.name = name;
		this.cost = cost;
		this.recovery = recovery;
		this.strengthReduction = strengthReduction;
		this.defenseReduction = defenseReduction;
		this.speedReduction = speedReduction;
		this.hpReduction = hpReduction;
		this.mpReduction = mpReduction;
		this.strengthIncrease = strengthIncrease;
		this.defenseIncrease = defenseIncrease;
		this.speedIncrease = speedIncrease;
		this.hpIncrease = hpIncrease;
		this.mpIncrease = mpIncrease;
		this.durationInTurns = duration;
	}
	
	/**
	 * Initialize a BattleItem that reduces stats
	 * 
	 * @param name the name
	 * @param cost the cost
	 * @param strengthReduction the strength reduction amount
	 * @param defenseReduction the defense reduction amount
	 * @param speedReduction the speed reduction amount
	 * @param hpReduction the hp reduction amount
	 * @param mpReduction the mp reduction amount
	 * @param duration the duration of the effect(s)
	 */
	public BattleItem(String name, Double cost, int strengthReduction, 
			int defenseReduction, int speedReduction,
			int hpReduction, int mpReduction, int duration) 
	{
		this.name = name;
		this.cost = cost;
		this.recovery = 0;
		this.strengthReduction = strengthReduction;
		this.defenseReduction = defenseReduction;
		this.speedReduction = speedReduction;
		this.hpReduction = hpReduction;
		this.mpReduction = mpReduction;
		this.strengthIncrease = 0;
		this.defenseIncrease = 0;
		this.speedIncrease = 0;
		this.hpIncrease = 0;
		this.mpIncrease = 0;
		this.durationInTurns = duration;
	}
	
	/**
	 * Initialize a BattleItem that increases stats
	 * 
	 * @param name the name
	 * @param cost the cost
	 * @param recovery the recovery amount
	 * @param strengthIncrease the strength increase amount
	 * @param defenseIncrease the defense increase amount
	 * @param speedIncrease the speed increase amount
	 * @param hpIncrease the hp increase amount
	 * @param mpIncrease the mp increase amount
	 * @param duration the duration of the effect(s)
	 */
	public BattleItem(String name, Double cost, int recovery,
			int strengthIncrease, int defenseIncrease, int speedIncrease, 
			int hpIncrease, int mpIncrease, int duration) 
	{
		this.name = name;
		this.cost = cost;
		this.recovery = recovery;
		this.strengthReduction = 0;
		this.defenseReduction = 0;
		this.speedReduction = 0;
		this.hpReduction = 0;
		this.mpReduction = 0;
		this.strengthIncrease = strengthIncrease;
		this.defenseIncrease = defenseIncrease;
		this.speedIncrease = speedIncrease;
		this.hpIncrease = hpIncrease;
		this.mpIncrease = mpIncrease;
		this.durationInTurns = duration;
	}
	
	/**
	 * Get the BattleItem name
	 * 
	 * @return name the name
	 */
	public String getName() 
	{
		return this.name;
	}
	
	/**
	 * Set the BattleItem name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * Get the BattleItem cost
	 * 
	 * @return cost the cost
	 */
	public Double getCost() 
	{
		return this.cost;
	}
	
	/**
	 * Set the BattleItem cost
	 * 
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) 
	{
		this.cost = cost;
	}
	
	/**
	 * Get the BattleItem recovery amount
	 * 
	 * @return recovery the recovery
	 */
	public int getRecovery() 
	{
		return this.recovery;
	}
	
	/**
	 * Set the BattleItem recovery amount
	 * 
	 * @param recovery the recovery to set
 	 */
	public void setRecovery(int recovery) 
	{
		this.recovery = recovery;
	}
	
	/**
	 * Get the BattleItem strength reduction 
	 * 
	 * @return strengthReduction the strengthReduction
	 */
	public int getStrengthReduction() 
	{
		return this.strengthReduction;
	}
	
	/**
	 * Set the BattleItem strength reduction
	 * 
	 * @param strengthReduction the strengthReduction to set
	 */
	public void setStrengthReduction(int strengthReduction) 
	{
		this.strengthReduction = strengthReduction;
	}
	
	/**
	 * Get the BattleItem defense reduction
	 * 
	 * @return defenseReduction the defenseReduction
	 */
	public int getDefenseReduction() 
	{
		return this.defenseReduction;
	}
	
	/**
	 * Set the BattleItem defense reduction
	 * 
	 * @param defenseReduction the defenseReduction to set
	 */
	public void setDefenseReduction(int defenseReduction) 
	{
		this.defenseReduction = defenseReduction;
	}
	
	/**
	 * Get the BattleItem speed reduction
	 * 
	 * @return speedReduction the speedReduction
	 */
	public int getSpeedReduction() 
	{
		return this.speedReduction;
	}
	
	/**
	 * Set the BattleItem speed reduction
	 * 
	 * @param speedReduction the speedReduction to set
	 */
	public void setSpeedReduction(int speedReduction) 
	{
		this.speedReduction = speedReduction;
	}
	
	/**
	 * Get the BattleItem hp reduction
	 * 
	 * @return hpReduction the hpReduction
	 */
	public int getHpReduction() 
	{
		return this.hpReduction;
	}
	
	/**
	 * Set the BattleItem hp reduction
	 * 
	 * @param hpReduction the hpReduction to set
	 */
	public void setHpReduction(int hpReduction) 
	{
		this.hpReduction = hpReduction;
	}
	
	/**
	 * Get the BattleItem mp reduction
	 * 
	 * @return mpReduction the mpReduction
	 */
	public int getMpReduction() 
	{
		return this.mpReduction;
	}
	
	/**
	 * Set the BattleItem mp reduction
	 * 
	 * @param mpReduction the mpReduction to set
	 */
	public void setMpReduction(int mpReduction) 
	{
		this.mpReduction = mpReduction;
	}
	
	/**
	 * Get the BattleItem strength increase
	 * 
	 * @return strengthIncrease the strengthIncrease
	 */
	public int getStrengthIncrease() 
	{
		return this.strengthIncrease;
	}
	
	/**
	 * Set the BattleItem strength increase
	 * 
	 * @param strengthIncrease the strengthIncrease to set
	 */
	public void setStrengthIncrease(int strengthIncrease) 
	{
		this.strengthIncrease = strengthIncrease;
	}
	
	/**
	 * Get the BattleItem defense increase
	 * 
	 * @return defenseIncrease the defenseIncrease
	 */
	public int getDefenseIncrease() 
	{
		return this.defenseIncrease;
	}
	
	/**
	 * Set the BattleItem defense increase
	 * 
	 * @param defenseIncrease the defenseIncrease to set
	 */
	public void setDefenseIncrease(int defenseIncrease) 
	{
		this.defenseIncrease = defenseIncrease;
	}
	
	/**
	 * Get the BattleItem speed increase
	 * 
	 * @return speedIncrease the speedIncrease
	 */
	public int getSpeedIncrease() 
	{
		return this.speedIncrease;
	}
	
	/**
	 * Set the BattleItem speed increase
	 * @param speedIncrease the speedIncrease to set
	 */
	public void setSpeedIncrease(int speedIncrease) 
	{
		this.speedIncrease = speedIncrease;
	}
	
	/**
	 * Get the BattleItem hp increase
	 * 
	 * @return hpIncrease the hpIncrease
	 */
	public int getHpIncrease() 
	{
		return this.hpIncrease;
	}
	
	/**
	 * Set the BattleItem hp increase
	 * 
	 * @param hpIncrease the hpIncrease to set
	 */
	public void setHpIncrease(int hpIncrease) 
	{
		this.hpIncrease = hpIncrease;
	}
	
	/**
	 * Get the BattleItem mp increase
	 * 
	 * @return mpIncrease the mpIncrease
	 */
	public int getMpIncrease() 
	{
		return this.mpIncrease;
	}
	
	/**
	 * Set the BattleItem mp increase
	 * 
	 * @param mpIncrease the mpIncrease to set
	 */
	public void setMpIncrease(int mpIncrease) 
	{
		this.mpIncrease = mpIncrease;
	}
	
	/**
	 * Get the BattleItem duration
	 * 
	 * @return duration the duration
	 */
	public int getDuration() 
	{
		return this.durationInTurns;
	}
	
	/**
	 * Set the BattleItem duration
	 * 
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) 
	{
		this.durationInTurns = duration;
	}
}
