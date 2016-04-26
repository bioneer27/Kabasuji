package Kabasuji;

import java.awt.Color;

public class Square {
	int row;
	int col;
	Color color;
	PieceType type;
	int setNumber;
	boolean visible;
	boolean taken;
	
	public Square(int row, int col){// Color color, PieceType type, int setNumber, boolean visible){
		this.row = row;
		this.col = col;
	}
	
	public Square(int row, int col, PieceType type, boolean visible, boolean taken){
		this.row = row;
		this.col = col;
		this.type = type;
		this.visible = visible;
		this.taken = taken;
	}
	
	public void snap(int snapRow, int snapCol){
		return;
	}
	
	public boolean isCovered(){
		return false;
	}
	
	public boolean isVisible(){return visible;}
}
