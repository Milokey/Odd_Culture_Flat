package inventory.fooditems;

public class FoodItem implements BasicFoodItem
{
	private int hungerPoints;
	private String name;
	private Double cost;
	private Boolean canBeUsedInBattle = Boolean.FALSE;

	public FoodItem() {} //default constructor for JAXB
	
	public FoodItem(int hungerPoints, String name, Double cost) {
		super();
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
		this.canBeUsedInBattle = Boolean.FALSE;
	}

}
