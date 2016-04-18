package Kabasuji;

public class PieceView {
	
	SquareView[] square;
	Piece model;
	
	public PieceView(Piece model){
		this.model = model;
	}
	
	public SquareView getSquare(){
		
		
		return square[0];
	}
	
	public boolean modelChanged(){
		return false;
	}

}
