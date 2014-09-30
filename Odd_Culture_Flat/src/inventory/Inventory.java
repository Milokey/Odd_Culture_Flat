package inventory;

import inventory.battleitems.BattleItem;
import inventory.healthitems.Philter;

import java.util.*;

import vereo.Vereo;

public class Inventory 
{
	private Double money;
	private List<Philter> philters;
	private List<BattleItem> battleItems;
	private List<Vereo> vereos;
	//private MedalCase medalCase;
	
	//+2 for medalCase and Vereos
	private int totalInventory = philters.size() + battleItems.size() + 2;
	private String playerName;

	/**
	 * Initialize an empty inventory with the signed up medal for
	 * new players
	 */
	public Inventory(String playerName)
	{
		this.playerName = playerName;
		//medalCase = new MedalCase(); //add the signed up Medal
	}
	
	/**
	 * Get the Player's money
	 * 
	 * @return money the money
	 */
	public Double getMoney() 
	{
		return this.money;
	}

	/**
	 * Set the Player's money
	 * 
	 * @param money the money to set
	 */
	public void setMoney(Double money) 
	{
		this.money = money;
	}

	/**
	 * Get the Player's Philters
	 * 
	 * @return philters the philters
	 */
	public List<Philter> getPhilters() 
	{
		return this.philters;
	}

	/**
	 * Set the Player's Philters
	 * 
	 * @param philters the Philters to set
	 */
	public void setPhilters(List<Philter> philters) 
	{
		this.philters = philters;
	}

	/**
	 * Get the Players BattleItems
	 * 
	 * @return battleItems the battleItems
	 */
	public List<BattleItem> getBattleItems() 
	{
		return this.battleItems;
	}

	/**
	 * Set the Player's BattleItems
	 * 
	 * @param battleItems the battleItems to set
	 */
	public void setBattleItems(List<BattleItem> battleItems) 
	{
		this.battleItems = battleItems;
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
	 * Get the total inventory
	 * 
	 * @return totalInventory the total inventory
	 */
	public int getTotalInventory() 
	{
		return this.totalInventory;
	}

	/**
	 * Set the total inventory
	 * 
	 * @param totalInventory the totalInventory to set
	 */
	public void setTotalInventory(int totalInventory) 
	{
		this.totalInventory = totalInventory;
	}

	/**
	 * Get the Player name
	 * 
	 * @return playerName the Player's name
	 */
	public String getPlayerName() 
	{
		return this.playerName;
	}

	/**
	 * Set the Player name
	 * 
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}
	
	/**
	 * Retrieve a Philter from the inventory
	 * 
	 * @param philterName the name of the philter
	 * @return philter the Philter, if it exists
	 */
	public Philter usePhilter(String philterName)
	{
		for (Philter philter : philters)
		{
			if (philter.getName().equals(philterName))
			{
				return philter;
			}
		}
		
		return null;
	}
	
	/**
	 * Buy a Philter
	 * 
	 * @param philter the Philter to purchase
	 * @param howMuch the amount it costs
	 * @return true, if the Philter was purchased and added to inventory
	 */
	public boolean buyPhilter(Philter philter, Double howMuch)
	{
		if (this.buy(howMuch))
		{
			return this.philters.add(philter);
		}
		
		return false;
	}
	
	public boolean sellPhilter(Philter philter, Double howMuch)
	{
		this.money += howMuch;
		return this.philters.remove(philter);
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
		this.money += howMuch;
		return vereos.remove(vereo);
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
		if (this.buy(howMuch))
		{
			return vereos.add(vereo);
		}
		
		return false;
	}
	
	/**
	 * A generic buy method to check a Player's money
	 * before allowing a purchase
	 * 
	 * @param howMuch the cost of the purchase
	 * @return true, if there's enough money for the purchase
	 */
	private boolean buy(Double howMuch)
	{
		if (this.getMoney() - howMuch >= howMuch)
		{
			this.money -= howMuch;
			return true;
		}
		
		return false;
	}
}
