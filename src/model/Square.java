/*
 * 
 */
package model;

import java.awt.Color;
import java.awt.Rectangle;

import Kabasuji.PieceType;

/**
 * @author Jetro
 *
 */
public class Square extends Rectangle {
	
	/** The row. */
	int row;
	
	/** The col. */
	int col;
	
	/** The color. */
	Color color;
	
	/** The type. */
	PieceType type;
	
	/** The set number. */
	int setNumber;
	
	/** The visible. */
	boolean visible;
	
	/** The taken. */
	private boolean taken;
	
	/** The p. */
	Piece p;
	
	/** The b. */
	Board b;
	
	/** The pixel length. */
	int pixelLength = 32;
	
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
	
	public Square(int row, int col, Piece p, boolean visible, Color c){
		this.row = row;
		this.col = col;
		this.p = p;
		this.visible = visible;
		this.color = c;
	}
	
	public Square(int row, int col, PieceType type, boolean visible, boolean taken){
		this.row = row;
		this.col = col;
		this.type = type;
		this.visible = visible;
		this.setTaken(taken);
	}
	
	/**
	 * Instantiates a new square.
	 *
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @param b
	 *            the b
	 * @param visible
	 *            the visible
	 * @param taken
	 *            the taken
	 */
	public Square(int row, int col, Board b, boolean visible, boolean taken){
		this.row = row;
		this.col = col;
		this.visible = visible;
		this.setTaken(taken);
		this.b = b;
		
	}
	
	
	/**
	 * Gets the row.
	 *
	 * @return the row
	 */
	public int getRow(){
		return this.row;
	}
	
	/**
	 * Gets the col.
	 *
	 * @return the col
	 */
	public int getCol(){
		return this.col;
	}
	
	/**
	 * Update row.
	 *
	 * @param newRow
	 *            the new row
	 */
	public void updateRow(int newRow){
		this.row = newRow;
	}
	
	/**
	 * Update col.
	 *
	 * @param newCol
	 *            the new col
	 */
	public void updateCol(int newCol){
		this.col = newCol;
	}
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public Color getColor(){
		return this.color;
	}
	
	public void setColor(Color c){
		this.color = c;
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
	
	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public int getLength(){
		return this.pixelLength;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	
	public void setVisible(boolean b){
		this.visible = b;
	}
	
	/**
	 * Rotate around origin
	 * 
	 */
	public void rotateAroundOrigin(){
		int x = this.row;
		int y = this.col;
		this.row = -y;
		this.col = x;
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y){
		this.row = x;
		this.col = y;
	}
	
	/**
	 * @param i
	 */
	public void rotateHelper(int i){
		this.row += i;
		this.col += i;
	}
	
	/**
	 * 
	 */
	public void flipXHelper(){
		this.row = -this.row;
	}
	
	/**
	 * 
	 */
	public void flipYHelper(){
		this.col = -this.col;
	}
	

}
