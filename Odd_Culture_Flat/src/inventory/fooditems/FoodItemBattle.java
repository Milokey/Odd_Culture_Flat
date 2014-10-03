package inventory.fooditems;

/**
 * A food item that can be used in battle
 * to increase stats
 * 
 * TODO update BasicFoodItem's methods
 * 		to take into account that some
 * 		of its implementers will want
 * 		to be able to update stats
 * 
 * @author tblount
 */
public class FoodItemBattle implements BasicFoodItem 
{
	private int hungerPoints;
	private String name;
	private Double cost;
	private Boolean canBeUsedInBattle = Boolean.TRUE;
	
	public FoodItemBattle() {} //default constructor for JAXB
	
	/**
	 * Initialize a FoodItemBattle with values
	 * 
	 * @param hungerPoints the hunger points
	 * @param name the name
	 * @param cost the cost
	 */
	public FoodItemBattle(int hungerPoints, String name, Double cost) 
	{
		this.hungerPoints = hungerPoints;
		this.name = name;
		this.cost = cost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getHungerPoints() 
	{
		return this.hungerPoints;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setHungerPoints(int hungerPoints) 
	{
		this.hungerPoints = hungerPoints;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() 
	{
		return this.name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double getCost() 
	{
		return this.cost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setCost(Double cost) 
	{
		this.cost = cost;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean getCanBeUsedInBattle() 
	{
		return this.canBeUsedInBattle;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setCanBeUsedInBattle(Boolean canBeUsedInBattle) 
	{
		this.canBeUsedInBattle = Boolean.TRUE;
	}
}
