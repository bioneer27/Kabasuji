package model;

import java.io.IOException;

import javax.swing.JFrame;

import Kabasuji.Board;
import Kabasuji.DataTxtWriter;
import Kabasuji.PieceType;
import view.AllLevelsView;
import view.PuzzlePlayView;

/**
 * @author Jetro
 *
 */
public class Puzzle extends Level{
	

	int moves;
	int movesUsed;
	PuzzlePlayView view;
	
	/**
	 * @param number
	 * @param moves
	 * @param bullpen
	 */
//	public Puzzle(int number, int moves, Bullpen bullpen){
//		/* Need to add a constructor for Level*/
//		super(number, PieceType.PUZZLE, bullpen);
//		movesUsed = 0;
//		this.moves = moves;
//		this.bullpen = bullpen;
//	}
	
	/**
	 * @param number
	 * @param moves
	 */
	public Puzzle(int number, int moves){
		/* Need to add a constructor for Level*/
		super(number, PieceType.PUZZLE, new Board(), new Bullpen());
		movesUsed = 0;
		this.moves = moves;
	}
	
	/**
	 * @param suji
	 */
	public void initialize(){
		view = new PuzzlePlayView(this);
		view.setVisible(true);
	}
	
	/**
	 * 
	 */
	public void completeLevel(){
		//star logic
		//3 stars
		try {
			new DataTxtWriter("src/Data.txt").txtReplace("PLEVEL" + number + " = " + getStars() + "," + moves, "PLEVEL" + number + " = " + 3 + "," + moves);
		} catch (IOException e) {
			e.printStackTrace();
		}
		completeLevel(3);
		
		//reopen the level view
//		AllLevelsView window = new AllLevelsView(suji, PieceType.PUZZLE);
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setVisible(true);
		view.dispose();
	}
	
	/**
	 * @return
	 */
	public int getMovesLeft(){
		return moves - movesUsed;
	}
	
	/**
	 * @return
	 */
	public int getMoves(){return moves;}
}
