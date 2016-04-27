package model;

import java.io.IOException;

import Kabasuji.Board;
import Kabasuji.DataTxtWriter;
import Kabasuji.PieceType;

/**
 * @author Jetro
 *
 */
public class Level {
	//general Level attributes
	private Board board;
	int number;
	private Bullpen bullpen;
	private int star;
	PieceType type;
	private boolean unlocked;
	
	//counter used for lightning and puzzle levels
	private int counter = 0;
	private int curCount = 0;
	
	//release sets for release levels
	
	/**
	 * @param number
	 * @param type
	 * Constructor for Lightning and Puzzle type levels
	 */
	public Level(int number, PieceType type, Board board, Bullpen bullpen, int counter){
		this.number = number; 
		this.type = type;
		this.setBoard(board);
		this.setBullpen(bullpen);
		setStars(0);
		
		this.setCounter(counter);
		setCurCount(0);
		
		//if this is the first level it should be unlocked by default
		if(number == 1)
			unlocked = true;
		else
			unlocked = false;
	}
	
	/**
	 * @param number
	 * @param type
	 * Constructor for Release type levels
	 */
	public Level(int number, PieceType type, Board board, Bullpen bullpen){
		this.number = number; 
		this.type = type;
		this.setBoard(board);
		this.setBullpen(bullpen);
		star = 0;
		
		//if this is the first level it should be unlocked by default
		if(number == 1)
			unlocked = true;
		else
			unlocked = false;
	}
	
	/**
	 * @param starsWon
	 */
	public void completeLevel(Model model){
		int starsWon = 3;
		
		//star logic
		//3 stars
		try {
			if(type == PieceType.LIGHTNING)
				new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + number + " = " + star + "," + getCounter(), "LLEVEL" + number + " = " + 3 + "," + getCounter());
			if(type == PieceType.PUZZLE)
				new DataTxtWriter("src/Data.txt").txtReplace("PLEVEL" + number + " = " + star + "," + getCounter(), "PLEVEL" + number + " = " + 3 + "," + getCounter());
			if(type == PieceType.RELEASE)
				new DataTxtWriter("src/Data.txt").txtReplace("RLEVEL" + number + " = " + star + ",", "RLEVEL" + number + " = " + 3 + ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//check if even need to update
		if(starsWon > star)
			star = starsWon;
		
		//unlock the next level
		if(starsWon > 0 && number + 1 < 6){
			model.getLevel(type, number + 1).unlocked = true;
			try {
				if(type == PieceType.LIGHTNING)
					new DataTxtWriter("src/Data.txt").txtReplace("LLEVEL" + (number + 1) + " = ," + model.getLevel(type, number + 1).counter, "LLEVEL" + (number + 1) + " = " + 0 + "," + model.getLevel(type, number + 1).counter);
				if(type == PieceType.PUZZLE)
					new DataTxtWriter("src/Data.txt").txtReplace("PLEVEL" + (number + 1) + " = ," + model.getLevel(type, number + 1).counter, "PLEVEL" + (number + 1) + " = " + 0 + "," + model.getLevel(type, number + 1).counter);
				if(type == PieceType.RELEASE)
					new DataTxtWriter("src/Data.txt").txtReplace("RLEVEL" + (number + 1) + " = ,", "RLEVEL" + (number + 1) + " = " + 0 + ",");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param stars
	 */
	public void setStars(int stars){
		star = stars;
	}
	
	/**
	 * @return
	 */
	public int getStars(){
		return star;
	}

	/**
	 * @return
	 */
	public int getNumber(){
		return number;
	}
	
	/**
	 * @return
	 */
	public PieceType getType(){
		return type;
	}
	
	public Bullpen getBullpen () {return bullpen; }
	
	/**
	 * @return
	 */
	public boolean isUnlocked(){return unlocked;}
	
	public Board getBoard(){return board;}

	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}

	public void setBullpen(Bullpen bullpen) {
		this.bullpen = bullpen;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getCurCount() {
		return curCount;
	}

	public void setCurCount(int curCount) {
		this.curCount = curCount;
	}
}
