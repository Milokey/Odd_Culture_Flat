package inventory.fooditems;

public interface BasicFoodItem 
{
	/**
	 * Get the hunger points
	 * 
	 * @return hungerPoints the hunger points
	 */
	public int getHungerPoints();

	/**
	 * Set the hunger points
	 * 
	 * @param hungerPoints the hunger points to set
	 */
	public void setHungerPoints(int hungerPoints);

	/**
	 * Get the name of the food item
	 * 
	 * @return name the name
	 */
	public String getName();

	/**
	 * Set the name of the food item
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);

	/**
	 * Get the cost of the food item
	 * 
	 * @return cost the cost
	 */
	public Double getCost();

	/**
	 * Set the cost of the food item
	 * 
	 * @param cost the cost to set
	 */
	public void setCost(Double cost);

	/**
	 * Can the item be used in battle?
	 * 
	 * @return canBeUsedInBattle Boolean.FALSE for BasicFoodItem
	 */
	public Boolean getCanBeUsedInBattle();

	/**
	 * Can the item be used in battle?
	 * 
	 * @param canBeUsedInBattle the Boolean to set
	 */
	public void setCanBeUsedInBattle(Boolean canBeUsedInBattle);
}
