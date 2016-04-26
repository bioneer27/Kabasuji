package Kabasuji;

import view.PuzzlePlayView;

/**
 * @author Jetro
 *
 */
public class Puzzle extends Level{
	

	int moves;
	int movesUsed;
	
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
		super(number, PieceType.PUZZLE, new Board(PieceType.PUZZLE), new Bullpen());
		movesUsed = 0;
		this.moves = moves;
	}
	
	/**
	 * @param suji
	 */
	public void initialize(Kabasuji suji){
		this.suji = suji;
		PuzzlePlayView view = new PuzzlePlayView(this);
		view.setVisible(true);
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
