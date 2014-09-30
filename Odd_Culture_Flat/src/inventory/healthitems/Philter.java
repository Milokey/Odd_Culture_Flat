package inventory.healthitems;

/**
 * A health item that restores HP
 * 
 * @author tblount
 */
public class Philter 
{
	private String name;
	private int recovery;
	private int numOfUses;
	private Double cost;
	
	/**
	 * Initialize a new Philter
	 * 
	 * @param name the name of the Philter
	 * @param recovery how much HP it recovers
	 * @param numOfUses how many times it can be used
	 * #param cost cost of the Philter
	 */
	public Philter(String name, int recovery, int numOfUses, Double cost)
	{
		this.name = name;
		this.recovery = recovery;
		this.numOfUses = numOfUses;
		this.cost = cost;
	}
	
	/**
	 * Set the Philter's name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the Philter's name
	 * 
	 * @return name the Philter's name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Set the amount of HP recovered
	 * 
	 * @param recovery the recovery to set
	 */
	public void setRecovery(int recovery)
	{
		this.recovery = recovery;
	}
	
	/**
	 * Get the amount of HP recovered
	 * 
	 * @return recovery the amount recovered
	 */
	public int getRecovery()
	{
		return this.recovery;
	}
	
	/**
	 * Set the number of times this Philter can be used
	 * @param numOfUses the number of uses to set
	 */
	public void setNumOfUses(int numOfUses)
	{
		this.numOfUses = numOfUses;
	}
	
	/**
	 * Get the number of times this Philter can be used
	 * @return numOfUses number of times can be used
	 */
	public int getNumOfUses()
	{
		return this.numOfUses;
	}
	
	/**
	 * Set the cost of the Philter
	 * 
	 * @param cost the cost to set
	 */
	public void setCost(Double cost)
	{
		this.cost = cost;
	}
	
	/**
	 * Get the cost of the Philter
	 * @return cost the cost of the Philter
	 */
	public Double getCost()
	{
		return this.cost;
	}
}
