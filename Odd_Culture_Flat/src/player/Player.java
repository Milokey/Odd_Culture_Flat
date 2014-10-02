package player;

import inventory.Inventory;

import java.util.List;

import common_enumerations.Gender;
import common_enumerations.Rank;
import player.enumerations.Charm;
import player.enumerations.EconomicClass;
import player.enumerations.Skillz;
import player.enumerations.Species;
import vereo.Vereo;
import common_enumerations.Medal;

public class Player 
{
	private String name;
	private String age;
	private String email;
	private List<Vereo> vereos;
	private Inventory inventory; 
	private Species species;
	private Gender gender;
	private Rank rank;
	private EconomicClass ecClass;
	private Charm charm;
	private Skillz skillz;
	
	public Player() {}
	
	/**
	 * Create a player with medals, inventory and Vereos.
	 * 
	 * @param name the player's name
	 * @param age the player's age
	 * @param email the player's email
	 * @param vereos the player's Vereos
	 * @param inventory the player's inventory
	 * @param species the player's chosen species
	 * @param gender the player's chosen gender
	 * @param rank the player's rank
	 * @param ecClass the player's economic class
	 * @param medals the player's medals
	 */
	public Player(String name, String age, String email, List<Vereo> vereos,
			Inventory inventory, Species species, Gender gender,
			Rank rank, EconomicClass ecClass) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.vereos = vereos;
		this.inventory = inventory;
		this.species = species;
		this.gender = gender;
		this.rank = rank;
		this.ecClass = ecClass;
	}

	/**
	 * Create a new Player without Vereos, inventory, or medals
	 * 
	 * @param name the player's name
	 * @param age the player's age
	 * @param email the player's email
	 * @param species the player's chosen species
	 * @param gender the player's chosen gender
	 * @param rank the player's rank
	 * @param ecClass the player's economic class
	 */
	public Player(String name, String age, String email, Species species,
			Gender gender, Rank rank, EconomicClass ecClass) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.species = species;
		this.gender = gender;
		this.rank = rank;
		this.ecClass = ecClass;
	}

	/**
	 * Get the player's name 
	 * 
	 * @return name the player's name
	 */
	public String getName() 
	{
		return this.name;
	}

	/**
	 * Set the player's name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Get the player's age
	 * 
	 * @return age the player's age
	 */
	public String getAge() 
	{
		return this.age;
	}

	/**
	 * Set the player's age
	 * 
	 * @param age the age to set
	 */
	public void setAge(String age) 
	{
		this.age = age;
	}

	/**
	 * Get the player's email
	 * 
	 * @return email the player's email address
	 */
	public String getEmail() 
	{
		return this.email;
	}

	/**
	 * Set the player's email
	 * 
	 * @param email the email address to set
	 */
	public void setEmail(String email) 
	{
		this.email = email;
	}

	/**
	 * Get all the player's Vereos
	 * 
	 * @return vereos a list of the player's Vereos
	 */
	public List<Vereo> getVereos() 
	{
		return this.vereos;
	}

	/**
	 * Set the player's Vereos
	 * @param vereos the list of Vereos to set
	 */
	public void setVereos(List<Vereo> vereos) 
	{
		this.vereos = vereos;
	}

	/**
	 * Get the player's inventory
	 * 
	 * @return inventory the player's inventory
	 */
	public Inventory getInventory() 
	{
		return this.inventory;
	}

	/**
	 * Set the player's inventory
	 * 
	 * @param inventory the inventory to set
	 */
	public void setInventory(Inventory inventory) 
	{
		this.inventory = inventory;
	}

	/**
	 * Get the player's chosen species
	 * 
	 * @return species the player's chosen species
	 */
	public Species getSpecies() 
	{
		return this.species;
	}

	/**
	 * Set the player's chosen species
	 * 
	 * @param species the species to set
	 */
	public void setSpecies(Species species) 
	{
		this.species = species;
	}

	/**
	 * Get the player's gender
	 * 
	 * @return gender the player's gender
	 */
	public Gender getGender() 
	{
		return this.gender;
	}

	/**
	 * Set the player's gender
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}

	/**
	 * Get the player's rank
	 * 
	 * @return rank the player's rank
	 */
	public Rank getRank() 
	{
		return this.rank;
	}

	/**
	 * Set the player's rank
	 * 
	 * @param rank the rank to set
	 */
	public void setRank(Rank rank) 
	{
		this.rank = rank;
	}

	/**
	 * Get the player's economic class
	 * 
	 * @return ecClass the player's economic class
	 */
	public EconomicClass getEcClass() 
	{
		return this.ecClass;
	}

	/**
	 * Set the player's economic class
	 * 
	 * @param ecClass the economic class to set
	 */
	public void setEcClass(EconomicClass ecClass) 
	{
		this.ecClass = ecClass;
	}
	
	/**
	 * Get the player's charm
	 * 
	 * @return charm the Charm to return
	 */
	public Charm getCharm() 
	{
		return this.charm;
	}

	/**
	 * Set the player's charm
	 * 
	 * @param charm the Charm to set
	 */
	public void setCharm(Charm charm) 
	{
		this.charm = charm;
	}

	/**
	 * Get the player's Skillz
	 * 
	 * @return skillz the player's Skillz
	 */
	public Skillz getSkillz() 
	{
		return this.skillz;
	}

	/**
	 * Set the player's Skillz
	 * 
	 * @param skillz the Skillz to set
	 */
	public void setSkillz(Skillz skillz) 
	{
		this.skillz = skillz;
	}

	/**
	 * Adopt a Vereo and add to the vereos list
	 *
	 * @param vereo the Vereo to adopt
	 * @return true if Vereo was successfully adopted
	 */
	public boolean adoptVereo(Vereo vereo)
	{
		return vereos.add(vereo);
	}
	
	/**
	 * Abandon a Vereo
	 * 
	 * @param vereo the Vereo to abandon
	 * @return true if Vereo was successfully abandoned
	 */
	public boolean abandonVereo(Vereo vereo)
	{
		return vereos.remove(vereo);
	}
	
	/**
	 * Sell a Vereo
	 * 
	 * @param vereo the Vereo to sell
	 * @param howMuch how much the Vereo sells for
	 * @return true if Vereo was successfully sold
	 */
	public boolean sellVereo(Vereo vereo, Double howMuch)
	{
		return inventory.sellVereo(vereo, howMuch);
	}
	
	/**
	 * Buy a Vereo
	 * 
	 * @param vereo the Vereo to buy
	 * @param howMuch how much the Vereo costs to buy
	 * @return true if Vereo was successfully purchased
	 */
	public boolean buyVereo(Vereo vereo, Double howMuch)
	{
		return inventory.buyVereo(vereo, howMuch);
	}
	
	/**
	 * Increase the player's Rank if possible
	 * 
	 * @param rankName the name of the Rank to attain
	 * @return true if Rank was attained
	 */
	public boolean rankUp(String rankName)
	{
		/*
		 * Shouldn't happen, but make sure the
		 * player can actually increase rank
		 */
		if (this.getRank().equals(Rank.TOPCOMMANDER))
		{
			return false;
		}
		
		for (Rank theRank : Rank.values())
		{
			
			if (theRank.name().equals(rankName))
			{
				this.rank = theRank;
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * TODO
	 * 
	 * What follows are a list of behaviors that may
	 * or may not change in the future.
	 * 
	 * 
	 * Some of these will require other classes to 
	 * be defined before they can even be stubbed
	 * out.
	 * 
	 */
	
	/*
	 * public void battle(Player player, Area area);
	 * public PlayerScorePersisted checkScores();
	 * public void feedVereo(Vereo vereo, Item foodItem); 
	 */
}
