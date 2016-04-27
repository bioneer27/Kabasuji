package model;

import java.io.IOException;

import Kabasuji.Board;
import Kabasuji.DataTxtWriter;
import Kabasuji.Lightning;
import Kabasuji.PieceType;
import Kabasuji.Puzzle;

/**
 * @author Jetro
 *
 */
public class Level {
	
	private Board board;
	int number;
	private Bullpen bullpen;
	private int star;
	PieceType type;
	private boolean unlocked;
	Model model;

	
	/**
	 * @param number
	 * @param type
	 */
	public Level(int number, PieceType type, Board board, Bullpen bullpen){
		this.number = number; 
		this.type = type;
		this.setBoard(board);
		this.setBullpen(bullpen);
		setStars(0);
		
		if(number == 1)
			setUnlocked(true);
		else
			setUnlocked(false);
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
		if(starsWon > getStars())
			setStars(starsWon);
		
		if(starsWon > 0 && number + 1 < 6){
			model.getLevel(type, number + 1).unlock(true);
			try {
				if(type == PieceType.LIGHTNING)
					new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + (number + 1) + " = ," + (((Lightning) model.getLevel(type, number + 1)).getSeconds()), "LLEVEL" + (number + 1) + " = " + 0 + "," + (((Lightning) model.getLevel(type, number + 1)).getSeconds()));
				if(type == PieceType.PUZZLE)
					new DataTxtWriter("src/Data.txt").txtReplace("PLEVEL" + (number + 1) + " = ," + (((Puzzle) model.getLevel(type, number + 1)).getMoves()), "PLEVEL" + (number + 1) + " = " + 0 + "," + (((Puzzle) model.getLevel(type, number + 1)).getMoves()));
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
	
	public Bullpen getBullpen () {return bullpen; }
	
	/**
	 * @return
	 */
	public boolean isUnlocked(){return unlocked;}
	
	/**
	 * @return
	 */
	public Model getModel(){return model;}
	
	public Board getBoard(){return board;}
	
	/**
	 * @param lock
	 */
	public void unlock(boolean unlocked){this.setUnlocked(unlocked);}

	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}

	public void setBullpen(Bullpen bullpen) {
		this.bullpen = bullpen;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
