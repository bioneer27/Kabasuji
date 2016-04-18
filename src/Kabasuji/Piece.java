package Kabasuji;

import java.awt.Color;


public class Piece {
	//Square[][] squares;
	boolean[][] squares;
	

	
	public Piece(Color color, boolean[][] canMove){
		
		//this.canMove = new boolean[6][6];
		this.canMove = canMove;
		
	}
	
	public void setPiece(PieceType type){
		return;
	}
	/*
	public Square[] getPiece(){
		return this.squares[0];
	}
	*/
	

}
