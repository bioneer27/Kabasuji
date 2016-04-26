package Kabasuji;

import java.io.IOException;

public class Level {
	
	Board board;
	int number;
	Bullpen bullpen;
	int star;
	PieceType type;
	boolean unlocked;
	Kabasuji suji;

	
	/**
	 * @param number
	 * @param type
	 */
	public Level(int number, PieceType type, Bullpen bullen){//, Board board, Bullpen bullpen){
		this.number = number; 
		this.type = type;
		//this.board = board;
		this.bullpen = bullpen;
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
		
		if(starsWon > 0 && number + 1 < 6){
			suji.getLevel(type, number + 1).unlock(true);
			try {
				if(type == PieceType.LIGHTNING)
					new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + (number + 1) + " = ," + (((Lightning) suji.getLevel(type, number + 1)).getSeconds()), "LLEVEL" + (number + 1) + " = " + 0 + "," + (((Lightning) suji.getLevel(type, number + 1)).getSeconds()));
				if(type == PieceType.PUZZLE)
					new DataTxtWriter("src/Data.txt").txtReplace("PLEVEL" + (number + 1) + " = ," + (((Puzzle) suji.getLevel(type, number + 1)).getMoves()), "PLEVEL" + (number + 1) + " = " + 0 + "," + (((Puzzle) suji.getLevel(type, number + 1)).getMoves()));
				if(type == PieceType.RELEASE)
					new DataTxtWriter("src/Data.txt").txtReplace("RLEVEL" + (number + 1) + " = ", "RLEVEL" + (number + 1) + " = " + 0 + ",");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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
	
	/**
	 * @return
	 */
	public Kabasuji getSuji(){return suji;}
	
	/**
	 * @param lock
	 */
	public void unlock(boolean unlocked){this.unlocked = unlocked;}
}
