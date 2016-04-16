package Kabasuji;

import java.awt.Color;

public class Piece {
	Square[][] squares;
	boolean[][] canMove;
	
	public Piece(Color color, boolean[][] canMove){
		
		this.canMove = new boolean[6][6];
		this.squares = new Square[6][6];
		
	}
	
	public void setPiece(PieceType type){
		return;
	}
	
	public Square[] getPiece(){
		return this.squares[0];
	}
	
	

}
