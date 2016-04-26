package Kabasuji;

import java.awt.Color;

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
