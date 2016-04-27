package model;

import java.util.ArrayList;
import java.util.Random;

import Kabasuji.Piece;
import Kabasuji.PieceFactory;

/**
 * @author xavier & Himanjal
 *
 */
public class Bullpen {
	
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	PieceFactory pieceFactory = new PieceFactory();
	
	Piece selectedPiece;
	
	//bullpen constructor
	/**
	 * @param pieces
	 */
	
	public Bullpen(ArrayList<Piece> pieces){
		this.pieces.addAll(pieces);
	}
	
	//default constructor
	public Bullpen(){
	}
	
	/*
	public Bullpen(int SizeOfBullpen){
		if(SizeOfBullpen<0){
			throw new RuntimeException("Cannot create a Bullpen with Negative size");
		}
		for(int i = 0; i < SizeOfBullpen; i++){
			this.pieces.add(pieceFactory.makePiece(new Random().nextInt(35) +1));
		}
	}
	*/
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

			if(this.pieces.get(i).getID() == ID ){
				this.pieces.remove(i);
				if(this.pieceFactory.getPlace().containsValue(i)){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * @return
	 */
	public int numOfPiecesAvailable(){
		int count = 0;
		for(int i=0; i<this.pieces.size(); i++){
			count++;
		}
		return count;
	}
	
	
	public boolean isEmpty(){
		return this.pieces.size() == 0;
	}
	
	
	public Piece getSelectedPiece(){
		return selectedPiece;
	}
	
	public boolean setSelectedPiece(int ID){
		for(int i=0; i<this.pieces.size(); i++){
			if(this.pieces.get(i).getID() == ID){
				this.selectedPiece = this.pieces.get(i);
				return true;
			}
		}
		return false;
	}
	
	public void clearSelectedPiece(){
		this.selectedPiece = null;
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
