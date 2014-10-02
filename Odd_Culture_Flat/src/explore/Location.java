package explore;

import inventory.battleitems.BattleItem;
import inventory.healthitems.Philter;

import java.util.List;

import vereo.Vereo;

/**
 * Defines a list of clickable icons
 * in an Area
 * 
 * @author tblount
 */
public interface Location 
{
	/**
	 * Set whether or not this Location will
	 * be a mini game
	 */
	public void setMiniGame();
	
	/**
	 * Get whether or not this Location will
	 * be a mini game
	 * 
	 * @return isMiniGame if true
	 */
	public Boolean getMiniGame();
	
	/**
	 * Set if this Location will be a 
	 * point and click area
	 */
	public void setPointAndClick();
	
	/**
	 * Get if this Location will be a
	 * point and click area
	 * 
	 * @return isPointAndClick if true
	 */
	public Boolean getPointAndClick();
	
	/**
	 * Set the list of Vereos available at this
	 * Location
	 * 
	 * @param vereos the Vereos to set
	 */
	public void setVereos(List<Vereo> vereos);
	
	/**
	 * Get the list of Vereos available at this
	 * Location
	 * 
	 * @return vereos the Vereos
	 */
	public List<Vereo> getVereos();
	
	/**
	 * Set the list of BattleItems available at this
	 * Location
	 * 
	 * @param battleItems the BattleItems to set
	 */
	public void setBattleItems(List<BattleItem> battleItems);
	
	/**
	 * Get the list of BattleItems available at this
	 * Location
	 * 
	 * @return battleItems the BattleItems
	 */
	public List<BattleItem> getBattleItems();
	
	/**
	 * Set the list of Philters available at this
	 * Location
	 * 
	 * @param philters the Philters to set
	 */
	public void setPhilters(List<Philter> philters);
	
	/**
	 * Get the list of Philters available at this
	 * Location
	 * 
	 * @return philters the Philters
	 */
	public List<Philter> getPhilters();
	
	/**
	 * Entry method to set up mini games
	 * or point and click. Puts Player
	 * in Location. 
	 */
	public void enter();
	
	/**
	 * Exit method to clean up and persist
	 * any necessary data. Removes Player
	 * in Location.
	 */
	public void exit();
}
