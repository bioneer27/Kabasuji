/*
 * 
 */
package Kabasuji;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Himanjal
 *
 */
public class Board {

	/** The Constant SIZE. */
	public static final int SIZE = 12;

	/** The board. */
	private Square[][] board = new Square[12][12];
	
	/** The pieces. */
	ArrayList<WindowClass> pieces = new ArrayList<WindowClass>();

	
	/**
	 * Instantiates a new board.
	 */
	public Board(){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				board[i][j] = new Square(i, j,  this, true, false);
				if((i+j)%2 ==0){
					board[i][j].color = Color.DARK_GRAY;
				}
				else board[i][j].color = Color.lightGray;
			}
		}
	}
	
	/**
	 * Gets the num squares rem.
	 *
	 * @return the num squares rem
	 */
	public int getNumSquaresRem(){
		int count =0;
		for(int i =0; i< SIZE; i++){
			for(int j=0; j< SIZE; j++){
				if(!board[i][j].taken){
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * Removes the piece.
	 *
	 * @param p
	 *            the p
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @return true, if successful
	 */
	@SuppressWarnings("unused")
	public boolean removePiece(WindowClass p, int row, int col){
		int index = 3;
		if(pieces.contains(p)){
			for(int i=0; i<6;i++){
				int prow = p.squareList.get(i).x;
				int pcol = p.squareList.get(i).y;
				colorBoard(row-(prow-index), col-(pcol-index));
				pieces.remove(p);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if is valid.
	 *
	 * @param p
	 *            the p
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @return true, if is valid
	 */
	public boolean isValid(WindowClass p, int row, int col){
		int index =3;
		for(int i=0; i<6;i++){
			int prow = p.squareList.get(i).x;
			int pcol = p.squareList.get(i).y;
			if(row-(prow-index)>0 || row-(prow-index) <11){
				if(col-(pcol-index)>0 || col-(pcol-index)>11){
					if(!board[row-(prow-index)][col-(pcol-index)].taken){
						if(board[row-(prow-index)][col-(pcol-index)].visible){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	

	/**
	 * Put piece on board.
	 *
	 * @param p
	 *            the p
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @return true, if successful
	 */
	public boolean putPieceOnBoard(WindowClass p, int row, int col){
		int index = 3;
		if(isValid(p,row,col)){
			for(int i=0; i<6;i++){
				int prow = p.squareList.get(i).x;
				int pcol = p.squareList.get(i).y;
				colorBoard((row-(prow-index)),(col-(pcol-index)), p.c);
			}
			pieces.add(p);
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Color board.
	 *
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 */
	public void colorBoard(int row, int col){
		board[row][col].taken = false;
		
		if((row+col)%2 == 0){
			board[row][col].color = Color.DARK_GRAY;
		}
		else board[row][col].color = Color.lightGray;
	}
	
	/**
	 * Color board.
	 *
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @param color
	 *            the color
	 */
	public void colorBoard(int row, int col, Color color){
		board[row][col].taken = true;
		board[row][col].color = color;
		
	}

	/**
	 * Gets the board.
	 *
	 * @return the board
	 */
	public Square[][] getBoard() {
		return board;
	}
	
	/**
	 * Sets the square.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param type
	 *            the type
	 * @param visible
	 *            the visible
	 * @param taken
	 *            the taken
	 */
	public void setSquare(int x, int y, PieceType type, boolean visible, boolean taken){
		board[x][y] = new Square(x, y, type, visible, taken);
	}

	/**
	 * Sets the board.
	 *
	 * @param board
	 *            the new board
	 */
	public void setBoard(Square[][] board) {
		this.board = board;
	}
	
}


