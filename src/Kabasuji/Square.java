package Kabasuji;

import java.awt.Color;

public class Square {
	int row;
	int col;
	Color color;
	PieceType type;
	int setNumber;
	boolean visible;
	
	public Square(int row, int col, Color color, PieceType type, int setNumber, boolean visible){
		this.row = row;
		this.col = col;
		this.color = color;
		this.type = type;
		this.setNumber = setNumber;
		this.visible = visible;
	}
	
	public void snap(int snapRow, int snapCol){
		return;
	}
	
	public boolean isCovered(){
		return false;
	}
	
	

}
