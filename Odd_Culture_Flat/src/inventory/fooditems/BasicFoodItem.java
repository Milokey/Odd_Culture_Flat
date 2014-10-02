package inventory.fooditems;

public class BasicFoodItem 
{
	private int hungerPoints;
	private String name;
	private Double cost;
	private Boolean canBeUsedInBattle;
	
	public BasicFoodItem() {} //default constructor for JAXB
	
	/**
	 * Initializes a BasicFoodItem, which only changes Hunger
	 * stats and cannot be used in battle.
	 * 
	 * @param hungerPoints the hunger points
	 * @param name the name
	 * @param cost the cost
	 */
	public BasicFoodItem(int hungerPoints, String name, 
						 Double cost, Boolean canBeUsedInBattle)
	{
		this.hungerPoints = hungerPoints;
		this.name = name;
		this.cost = cost;
		this.canBeUsedInBattle = canBeUsedInBattle;
	}

	/**
	 * Get the hunger points
	 * 
	 * @return hungerPoints the hunger points
	 */
	public int getHungerPoints() 
	{
		return this.hungerPoints;
	}

	/**
	 * Set the hunger points
	 * 
	 * @param hungerPoints the hunger points to set
	 */
	public void setHungerPoints(int hungerPoints) 
	{
		this.hungerPoints = hungerPoints;
	}

	/**
	 * Get the name of the food item
	 * 
	 * @return name the name
	 */
	public String getName() 
	{
		return this.name;
	}

	/**
	 * Set the name of the food item
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Get the cost of the food item
	 * 
	 * @return cost the cost
	 */
	public Double getCost() 
	{
		return this.cost;
	}

	/**
	 * Set the cost of the food item
	 * 
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) 
	{
		this.cost = cost;
	}

	/**
	 * Can the item be used in battle?
	 * 
	 * @return canBeUsedInBattle Boolean.FALSE for BasicFoodItem
	 */
	public Boolean getCanBeUsedInBattle() 
	{
		return this.canBeUsedInBattle;
	}

	/**
	 * Can the item be used in battle?
	 * 
	 * @param canBeUsedInBattle the Boolean to set
	 */
	public void setCanBeUsedInBattle(Boolean canBeUsedInBattle) 
	{
		this.canBeUsedInBattle = Boolean.FALSE;
	}
}
