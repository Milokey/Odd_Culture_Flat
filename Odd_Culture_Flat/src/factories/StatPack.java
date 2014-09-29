package factories;

import vereo.enumerations.Popularity;

/**
 * Encapsulates stats for a Vereo.
 * 
 * @author tblount
 */
public class StatPack 
{
	private int hp;
	private int mp;
	private int strength;
	private int defense;
	private int speed;
	private int level;
	// This should never change in-game
	private final Popularity popularity;
	
	/**
	 * @param hp the hp
	 * @param mp the mp
	 * @param strength the strength
	 * @param defense the defense
	 * @param speed the speed
	 * @param level the level
	 * @param popularity the popularity
	 */
	public StatPack(int hp, int mp, int strength, int defense, int speed,
			int level, Popularity popularity) 
	{
		this.hp = hp;
		this.mp = mp;
		this.strength = strength;
		this.defense = defense;
		this.speed = speed;
		this.level = level;
		this.popularity = popularity;
	}

	/**
	 * Get the Vereo's hp
	 * 
	 * @return hp the hp
	 */
	public int getHp() 
	{
		return this.hp;
	}

	/**
	 * Set the Vereo's hp
	 * 
	 * @param hp the hp to set
	 */
	public void setHp(int hp) 
	{
		this.hp = hp;
	}

	/**
	 * Get the Vereo's mp
	 * 
	 * @return mp the mp 
	 */
	public int getMp() 
	{
		return this.mp;
	}

	/**
	 * Set the Vereo's mp
	 * 
	 * @param mp the mp to set
	 */
	public void setMp(int mp) 
	{
		this.mp = mp;
	}

	/**
	 * Get the Vereo's strength
	 * 
	 * @return strength the strength
	 */
	public int getStrength() 
	{
		return this.strength;
	}

	/**
	 * Set the Vereo's strength
	 * 
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) 
	{
		this.strength = strength;
	}

	/**
	 * Get the Vereo's defense
	 * 
	 * @return defense the defense
	 */
	public int getDefense() 
	{
		return this.defense;
	}

	/**
	 * Set the Vereo's defense
	 * 
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) 
	{
		this.defense = defense;
	}

	/**
	 * Get the Vereo's speed
	 * 
	 * @return speed the speed
	 */
	public int getSpeed() 
	{
		return this.speed;
	}

	/**
	 * Set the Vereo's speed
	 * 
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	/**
	 * Get the Vereo's level
	 * 
	 * @return level the level
	 */
	public int getLevel() 
	{
		return this.level;
	}

	/**
	 * Set the Vereo's level
	 * 
	 * @param level the level to set
	 */
	public void setLevel(int level) 
	{
		this.level = level;
	}
	
	/**
	 * Get the Vereo's popularity
	 * 
	 * @return popularity the popularity
	 */
	public Popularity getPopularity() 
	{
		return this.popularity;
	}	
	
	/**
	 * Increase a Vereo's hp and return it
	 * 
	 * @param howMuch how many points to increase by
	 * @return hp the new hp
	 */
	public int increaseHP(int howMuch)
	{
		return (this.hp += howMuch);
	}
	
	/**
	 * Decrease a Vereo's hp and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return hp the new hp
	 */
	public int decreaseHP(int howMuch)
	{
		return (this.hp -= howMuch);
	}
	
	/**
	 * Increase a Vereo's mp and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return mp the new mp
	 */
	public int increaseMP(int howMuch)
	{
		return (this.mp += howMuch);
	}
	
	/**
	 * Decrease a Vereo's mp and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return mp the new mp
	 */
	public int decreaseMP(int howMuch)
	{
		return (this.mp -= howMuch);
	}
	
	/**
	 * Increase a Vereo's strength and return it
	 * 
	 * @param howMuch how many points to increase by
	 * @return strength the new strength
	 */
	public int increaseStrength(int howMuch)
	{
		return (this.strength += howMuch);
	}
	
	/**
	 * Decrease a Vereo's strength and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return strength the new strength
	 */
	public int decreaseStrength(int howMuch)
	{
		return (this.strength -= howMuch);
	}
	
	/**
	 * Increase a Vereo's defense and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return defense the new defense
	 */
	public int increaseDefense(int howMuch)
	{
		return (this.defense += howMuch);
	}
	
	/**
	 * Decrease a Vereo's defense and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return defense the new defense
	 */
	public int decreaseDefense(int howMuch)
	{
		return (this.defense -= howMuch);
	}
	
	/**
	 * Increase a Vereo's speed and return it
	 * 
	 * @param howMuch how many points to increase by
	 * @return speed the new speed
	 */
	public int increaseSpeed(int howMuch)
	{
		return (this.speed += howMuch);
	}
	
	/**
	 * Decrease a Vereo's speed and return it
	 * 
	 * @param howMuch how many points to decrease by
	 * @return speed the new speed
	 */
	public int decreaseSpeed(int howMuch)
	{
		return (this.speed -= howMuch);
	}
	
	/**
	 * Increase a Vereo's level and return it
	 * 
	 * @return level the new level
	 */
	public int increaseLevel()
	{
		return (++this.level);
	}
}
