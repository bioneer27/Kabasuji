package Kabasuji;

import java.util.ArrayList;

/**
 * @author xavier
 *
 */
public class Bullpen {
	
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	
	//bullpen constructor
	/**
	 * @param pieces
	 */
	public Bullpen(ArrayList<Piece> pieces){
		this.pieces = pieces;
	}
	
	//default constructor
	public Bullpen(){
		
	}
	
	
	/**
	 * Adds a piece to he bullpen
	 * @param piece the piece to add
	 */
	public void addPiece(Piece piece){
		pieces.add(piece);
	}
	
	
	/**
	 * Removes the given piece from the bullpen, if present.
	 * @param piece the piece to remove.
	 * @return true if piece was found and removed, false otherwise.
	 */
	public boolean removePiece(Piece piece){
		return pieces.remove(piece);
	}
	
	/**
	 * @param up
	 */
	public void scroll(boolean up){
		return;
	}
	
	/**
	 * 
	 */
	public void resetBullpen(){
		return;
	}

	/**
	 * @return
	 */
	public ArrayList<Piece> getPieces(){
		return pieces;
	}
}
