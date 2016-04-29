/*
 * 
 */
package Kabasuji;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Piece;

/**
 * @author Jetro
 *
 */
public class Box extends JPanel{
	
	/** The squares. */
	int[][] squares;
	
	/** The piece. */
	//JButton[] buttons;
	Piece piece;
	
	/** The x. */
	int x;
	
	/** The y. */
	int y;
	
	/**
	 * @param x
	 * @param y
	 * @param piece
	 */
	public Box(int x, int y, Piece piece){
		this.x = x;
		this.y = y;
		this.piece = piece;
		squares = new int[6][6];
		//buttons = new JButton[36];
	}
	
	/**
	 * Instantiates a new box.
	 *
	 * @param piece
	 *            the piece
	 */
	public Box(Piece piece){
		this.piece = piece;
		squares = new int[6][6];
	}
	
	/**
	 * 
	 */
	void rotatePiece(){
		return;
	}

}
