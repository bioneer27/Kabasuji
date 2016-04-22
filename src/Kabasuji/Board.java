package Kabasuji;

import java.util.ArrayList;

public class Board {
	ArrayList<Box> boxes;
	ArrayList<Square> squares;
	PieceType type;
	
	public Board(PieceType type){
		this.boxes = new ArrayList<Box>();
		this.squares = new ArrayList<Square>();
		this.type = type;
		
		
	}
	
	public void resetBoard(){
		new Board(type).squares = squares;
	}
	
	public int countEmptySquares(){
		return (this.squares.size() - this.boxes.size()*6);
	}
	
	public boolean isValid(Box newBox){
		return false;
	}

}
