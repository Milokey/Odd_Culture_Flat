package inventory;

import java.util.List;

import common_enumerations.Medal;

/**
 * Holds all of the Medals the Player has earned.
 * 
 * @author tblount
 */
public class MedalCase 
{
	private List<Medal> medals;
	
	public MedalCase() {} // default constructor for JAXB
	
	/**
	 * Create a medal case with all of a Player's 
	 * medals
	 * 
	 * @param medals the medals
	 */
	public MedalCase(List<Medal> medals)
	{
		this.medals = medals;
	}
	
	/**
	 * Add a medal
	 * 
	 * @param medal the Medal to add
	 * @return true if the Medal was successfully added
	 */
	public boolean addMedal(Medal medal)
	{
		if (!medals.contains(medal))
		{
			return medals.add(medal);
		}
			
		return false;
	}
	
	/**
	 * Return a particular medal, used in some
	 * contests on the site
	 * 
	 * @param medalName the name of Medal to retrieve
	 * @return the Medal if found, null if not
	 */
	public Medal getMedal(Medal medal)
	{
		if (medals.contains(medal))
		{
			return medal;
		}
		
		return null;
	}
}
