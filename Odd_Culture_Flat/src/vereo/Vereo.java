package vereo;

import vereo.enumerations.Ability;
import vereo.enumerations.Hunger;
import vereo.enumerations.MagicAbility;
import vereo.enumerations.Species;
import common_enumerations.Gender;

import java.util.ArrayList;
import java.util.List;

import factories.StatPack;

public class Vereo 
{
	private String name;
	private Species species;
	private int level;
	private Long currExp;
	private Long nextExp;
	private int abilityPoints;
	private String color;
	private StatPack stats;
	private List<Ability> abilities;
	private List<MagicAbility> magicAbilities;
	private Gender gender;
	private Hunger hunger;
	
	/**
	 * Constructor for a newly adopted Vereo.
	 * 
	 * @param name the Vereo's name
	 * @param species the Vereo's species
	 * @param color the Vereo's color
	 * @param stats the Vereo's default stats
	 * @param gender the Vereo's gender
	 */
	public Vereo(String name, Species species, String color, StatPack stats, Gender gender)
	{
		this.name = name;
		this.species = species;
		this.color = color;
		this.stats = stats;
		this.gender = gender;
		
		this.currExp = 0L;
		this.nextExp = 0L;
		
		this.abilityPoints = 0;
		abilities = new ArrayList<Ability>();
		abilities.add(Ability.FLEE);
		abilities.add(Ability.LOUDNOISE);
		abilities.add(Ability.SLIDE);
		
		this.hunger = Hunger.SATISFIED;
	}

	/**
	 * Constructor for a Vereo reloaded from XML/DB
	 * 
	 * @param name the Vereo's name
	 * @param species the Vereo's species
	 * @param level the Vereo's level
	 * @param currExp the Vereo's current exp
	 * @param nextExp the Vereo's amount of exp to next level
	 * @param abilityPoints the Vereo's ability points
	 * @param color the Vereo's color
	 * @param stats the Vereo's stats
	 * @param abilities the Vereo's abilities
	 * @param gender the Vereo's gender
	 * @param hunger the Vereo's hunger level
	 */
	public Vereo(String name, Species species, int level, Long currExp, 
				Long nextExp, int abilityPoints, String color, StatPack stats, 
				List<Ability> abilities, Gender gender, Hunger hunger)
	{
		this.name = name;
		this.species = species;
		this.level = level;
		this.currExp = currExp;
		this.nextExp = nextExp;
		this.abilityPoints = abilityPoints;
		this.color = color;
		this.stats = stats;
		this.abilities = abilities;
		this.gender = gender;
		this.hunger = hunger;
	}
	
	/**
	 * Get the Vereo's name
	 * 
	 * @return name the name
	 */
	public String getName() 
	{
		return this.name;
	}

	/**
	 * Set the Vereo's name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Get the Vereo's species
	 * 
	 * @return species the vereo's species
	 */
	public Species getSpecies() 
	{
		return this.species;
	}

	/**
	 * Set the Vereo's species
	 * 
	 * @param species the species to set
	 */
	public void setSpecies(Species species) 
	{
		this.species = species;
	}

	/**
	 * Get the Vereo's level
	 * 
	 * @return level the Vereo's level
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
	 * Get the Vereo's current exp
	 * 
	 * @return currExp the current exp
	 */
	public Long getCurrExp() 
	{
		return this.currExp;
	}

	/**
	 * Set the Vereo's current exp
	 * 
	 * @param currExp the exp to set
	 */
	public void setCurrExp(Long currExp) 
	{
		this.currExp = currExp;
	}

	/**
	 * Get the Vereo's exp to next level
	 * 
	 * @return nextExp the exp to return
	 */
	public Long getNextExp() 
	{
		return this.nextExp;
	}

	/**
	 * Set the Vereo's exp to next level
	 * 
	 * @param nextExp the exp to set
	 */
	public void setNextExp(Long nextExp) 
	{
		this.nextExp = nextExp;
	}

	/**
	 * Get the Vereo's ability points
	 * 
	 * @return abilityPoints the ability points
	 */
	public int getAbilityPoints() 
	{
		return this.abilityPoints;
	}

	/**
	 * Set the Vereo's ability points
	 * 
	 * @param abilityPoints the abilityPoints to set 
	 */
	public void setAbilityPoints(int abilityPoints) 
	{
		this.abilityPoints = abilityPoints;
	}

	/**
	 * Get the Vereo's color
	 * 
	 * @return color the color
	 */
	public String getColor() 
	{
		return this.color;
	}

	/**
	 * Set the Vereo's color
	 * 
	 *  @param color the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * Get the Vereo's stats
	 * 
	 * @return stats the stats
	 */
	public StatPack getStats() 
	{
		return this.stats;
	}

	/**
	 * Set the Vereo's stats
	 * 
	 * @param stats the stats to set
	 */
	public void setStats(StatPack stats) 
	{
		this.stats = stats;
	}

	/**
	 * Get the Vereo's abilities
	 * 
	 * @return abilities the abilities
	 */
	public List<Ability> getAbilities() 
	{
		return this.abilities;
	}

	/**
	 * Set the Vereo's abilities
	 * 
	 * @param abilities the abilities to set
	 */
	public void setAbilities(List<Ability> abilities) 
	{
		this.abilities = abilities;
	}

	/**
	 * Get the Vereo's gender
	 * 
	 * @return gender the gender
	 */
	public Gender getGender() 
	{
		return this.gender;
	}

	/**
	 * Set the Vereo's gender
	 * 
	 *  @param gender the gender to set
	 */
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}

	/**
	 * Get the Vereo's hunger
	 * 
	 * @return hunger the hunger level
	 */
	public Hunger getHunger() 
	{
		return this.hunger;
	}

	/**
	 * Set the Vereo's hunger
	 * 
	 * @param hunger the hunger to set
	 */
	public void setHunger(Hunger hunger) 
	{
		this.hunger = hunger;
	}
	
	/**
	 * TODO 
	 * 
	 * Behavioral methods.
	 * 
	 * Some of them may or may not be reflected in
	 * Player.java. 
	 */
	
	/*
	 * public void eat(Item foodItem);
	 * public void battle(Area area);
	 */
}

