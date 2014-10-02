package explore;

import java.awt.Image;
import java.util.List;

/**
 * Defines the entirety of an
 * explorable Area
 * 
 * @author tblount
 */
public interface Area 
{
	/**
	 * Set the list of images that define
	 * this Area
	 * 
	 * @param reel the list of images to set
	 */
	public void setImageReel(List<Image> reel);
	
	/**
	 * Get the list of images that define
	 * this Area
	 * 
	 * @return the list of images
	 */
	public List<Image> getImageReel();
	
	/**
	 * Set the locations on each Image 
	 * that defines the Area
	 * 
	 * @param locations the Locations to set
	 */
	public void setLocations(List<Location> locations);
	
	/**
	 * Get the locations on each Image
	 * that defines the Area
	 * 
	 * @param locations the Locations
	 * @return
	 */
	public List<Location> getLocations();
}
