package Kabasuji;

/**
 * @author xavier
 *
 */
public class Badge {
	
	/**
	 * 
	 */
	String name;
	boolean achieved;
	String description;
	
	/**
	 * @param name
	 * @param description
	 */
	public Badge(String name, String description){
		this.name = name;
		this.achieved = false;
		this.description = description;
	}
	
	/**
	 * @return
	 */
	public String getName(){return name;}
	
	/**
	 * @return
	 */
	public String getDescription(){return description;}
	
	/**
	 * @return
	 */
	public boolean getAchieved(){return achieved;}
	
	//if some flag event happens, set the Badge to be visible 

}

/*
possible badge ideas: 

Lightning level - Complete in less than 35 seconds - Electric shock 
Lightning level - Complete in less than or equal to number of the (blocks/6) + 1- Thunderbird  
Lightning level - Complete in less than 25 seconds (half time) - Lightning God 
Puzzle level - completing it in birdie (-1 of the allowed number of moves) - bird 
Puzzle level - completing it in eagle (-2 of the allowed number of moves) - eagle 
Puzzle level - completing the level without having rotated a piece - Sword and Shield 
Puzzle level - failed to complete the level three times in a row - mule badge (ass) 
Release level - Put a piece on release level that does not touch any number - Joker Icon 
Release level - Acquired two sets of number in release level - Magician 
Release level - completed level 5 of release level - Sage

TODO: 
Create singleton 
Getting everything setup 
Save badge to disk 
Load badge from disk 
Badge manager entity 
Receive badge and add to disk

*/