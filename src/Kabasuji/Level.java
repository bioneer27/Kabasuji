package Kabasuji;

public class Level {
	
	Board board;
	int number;
	Bullpen bullpen;
	int star;
	PieceType type;
	boolean unlocked;
	

	
	/**
	 * @param number
	 * @param type
	 */
	public Level(int number, PieceType type){//, Board board, Bullpen bullpen){
		this.number = number; 
		this.type = type;
		//this.board = board;
		//this.bullpen = bullpen;
		star = 0;
		
		if(number == 1)
			unlocked = true;
		else
			unlocked = false;
	}
	
	/**
	 * 
	 */
	public void resetLevel(){
		/*Add logic here*/
		
		return;
	}
	
	/**
	 * @param starsWon
	 */
	public void completeLevel(int starsWon){
		if(starsWon > star)
			star = starsWon;
	}
	
	/**
	 * @param stars
	 */
	public void setStars(int stars){star = stars;}
	
	/**
	 * @return
	 */
	public int getNumber(){return number;}
	
	/**
	 * @return
	 */
	public PieceType getType(){return type;}
	
	/**
	 * @return
	 */
	public int getStars(){return star;}
	
	/**
	 * @return
	 */
	public boolean isUnlocked(){return unlocked;}
}
