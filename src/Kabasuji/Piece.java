package Kabasuji;

import java.awt.Color;


public class Piece {
	Square[][] squares;
	boolean[][] pieces;
	int id;
	

	
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
