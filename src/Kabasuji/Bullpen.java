package Kabasuji;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xavier & Himanjal
 *
 */
public class Bullpen {
	
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	PieceFactory pieceFactory = new PieceFactory();
	
	//bullpen constructor
	/**
	 * @param pieces
	 */
	public Bullpen(ArrayList<Piece> pieces){
		this.pieces.addAll(pieces);
	}
	
	//default constructor
	public Bullpen(){
		for(int i = 1; i<=35; i++){
			this.pieces.add((pieceFactory.makePiece(i)));
		}
	}
	
	public Bullpen(int SizeOfBullpen){
		if(SizeOfBullpen<0){
			throw new RuntimeException("Cannot create a Bullpen with Negative size");
		}
		for(int i = 0; i < SizeOfBullpen; i++){
			this.pieces.add(pieceFactory.makePiece(new Random().nextInt(35) +1));
		}
	}
	
	/**
	 * Adds a piece to he bullpen
	 * @param piece the piece to add
	 */
	public void addPiece(int ID){
		pieces.add(pieceFactory.makePiece(ID));
	}
	
	public void addRandomPiece(int numOfPieces){
		if(numOfPieces<0){
			throw new RuntimeException("Cannot add negative number of piece");
		}
		for(int i=0; i<numOfPieces; i++){
			this.pieces.add(pieceFactory.makePiece(new Random().nextInt(35)+1));
		}
	}
	
	/**
	 * Removes the given piece from the bullpen, if present.
	 * @param piece the piece to remove.
	 * @return true if piece was found and removed, false otherwise.
	 */
	public boolean removePiece(int ID){
		for(int i=0;i<this.pieces.size(); i++){
			if(this.pieceFactory.place.containsValue(i)){
				return true;
			}
		}
		return false;
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
