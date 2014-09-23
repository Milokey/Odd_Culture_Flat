package vereo.enumerations;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * This is the Ability superclass. Vereos can
 * share a basic set of Abilities, but each
 * species has a specific set of Abilities unique
 * to it. 
 * 
 * @author tblount
 *
 */
public abstract class Ability 
{
	/**
	 * The abilities all Vereos start with.
	 *
	 */
	private enum StarterAbilities 
	{
		LOUDNOISE(5),
		FLEE(0),
		SLIDE(5);
		
		private int value;
		
		private StarterAbilities(int value)
		{
			this.value = value;
		}
		
		public int getValue()
		{
			return this.value;
		}
	}
	
	/**
	 * Get the StarterAbilities
	 * 
	 * @return starterAbilities the list of StarterAbilities
	 */
	public List<StarterAbilities> getStarterAbilities()
	{
		EnumSet<StarterAbilities> starterAbilities = 
				EnumSet.allOf(StarterAbilities.class);
		
		return new ArrayList<StarterAbilities>(starterAbilities);
	}
}
