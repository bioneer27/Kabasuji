package Kabasuji;

import view.PuzzlePlayView;

public class Puzzle extends Level{
	

	int moves;
	int movesUsed;
	
	public Puzzle(int number, int moves){
		/* Need to add a constructor for Level*/
		super(number, PieceType.PUZZLE);
		movesUsed = 0;
		this.moves = moves;
	}
	
	public void initialize(Kabasuji suji){
		this.suji = suji;
		PuzzlePlayView view = new PuzzlePlayView(this);
		view.setVisible(true);
	}
	
	public int getMovesLeft(){
		return moves - movesUsed;
	}
	
	public int getMoves(){return moves;}
}
