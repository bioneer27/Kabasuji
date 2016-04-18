package Kabasuji;

public class Puzzle extends Level{
	

	int moves;
	int movesUsed;
	
	public Puzzle(int number, int moves){
		
		/*Need to add a different constructor for Level*/
		super(number, PieceType.PUZZLE);
		this.movesUsed = number;
		this.moves = moves;
	}

}
