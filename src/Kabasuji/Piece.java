package Kabasuji;

import java.awt.Color;

import javax.swing.JButton;


/**
 * @author Jetro
 *
 */
public class Piece {
	Square[][] squares;
	boolean[][] pieces;
	int id;
	

	
	/**
	 * @param color
	 * @param pieces
	 * @param id
	 */
	public Piece(Color color, boolean[][] pieces, int id){
		
		//this.canMove = new boolean[6][6];
		this.pieces = pieces;
		squares = new Square[6][6];
		int length  = pieces.length;
		int height = pieces[0].length;
		this.id = id;
		
		int i, j;
		
		for (i = 0; i < height; i++){
			for(j = 0; j < length; j++ ){
				if (pieces[i][j] == true){
					
				}
			}
		}

		
	}
	/*
	 * 
	 * Code by Himanjal
	 * I will fix it Please dont erase
	 * 
	public Piece(boolean[][] pieces, int ID){
		this.pieces = pieces;
		squares = new Square[6][6];
		this.id = ID;
		
		for(int i = 0; i<6; i++){
			for(int j=0; j<6; j++){
				if(pieces[i][j] == true){
					squares[i][j] = new Square(i, j, this, true, true);
				}
				else squares[i][j] = new Square(i, j, this, false, false);
			}
		}
	}
	
	public void rotateLeft(){
		for(int i=1; i<6; i++){
			for(int j =1; j<6; j++){
				
			int row = squares[i][j] 
		
			}
		}
	}
	*/
	public void setPiece(PieceType type){
		return;
	}
	/*
	public Square[] getPiece(){
		return this.squares[0];
	}
	*/
	public int getID(){return id;}

}
