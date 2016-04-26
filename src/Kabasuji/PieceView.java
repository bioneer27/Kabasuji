package Kabasuji;

/**
 * @author Jetro
 *
 */
public class PieceView {
	
	SquareView[] square;
	Piece model;
	
	/**
	 * @param model
	 */
	public PieceView(Piece model){
		this.model = model;
	}
	
	/**
	 * @return
	 */
	public SquareView getSquare(){
		
		
		return square[0];
	}
	
	/**
	 * @return
	 */
	public boolean modelChanged(){
		return false;
	}

}
