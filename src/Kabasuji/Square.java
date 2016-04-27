package Kabasuji;

import java.awt.Color;

import model.Piece;

/**
 * @author Jetro
 *
 */
public class Square {
	int row;
	int col;
	Color color;
	PieceType type;
	int setNumber;
	boolean visible;
	boolean taken;
	Piece p;
	Board b;
	
	/**
	 * @param row
	 * @param col
	 */
	public Square(int row, int col){// Color color, PieceType type, int setNumber, boolean visible){
		this.row = row;
		this.col = col;
	}
	
	/**
	 * @param row
	 * @param col
	 * @param type
	 * @param visible
	 * @param taken
	 */
	public Square(int row, int col, PieceType type, boolean visible, boolean taken){
		this.row = row;
		this.col = col;
		this.type = type;
		this.visible = visible;
		this.taken = taken;
	}
	
	public Square(int row, int col, Board b, boolean visible, boolean taken){
		this.row = row;
		this.col = col;
		this.visible = visible;
		this.taken = taken;
		this.b = b;
	}
	
	
	public int getRow(){
		return this.row;
	}
	
	public int getCol(){
		return this.col;
	}
	
	public void updateRow(int newRow){
		this.row = newRow;
	}
	
	public void updateCol(int newCol){
		this.col = newCol;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	
	/**
	 * @param snapRow
	 * @param snapCol
	 */
	public void snap(int snapRow, int snapCol){
		return;
	}
	
	/**
	 * @return
	 */
	public boolean isCovered(){
		return false;
	}
	
	/**
	 * @return
	 */
	public boolean isVisible(){return visible;}
}
