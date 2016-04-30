/*
 * 
 */
package model;

import java.awt.Color;
import java.util.ArrayList;

import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import builderView.BoardView;

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
	ArrayList<Piece> pieces = new ArrayList<Piece>();

	
	/**
	 * Instantiates a new board.
	 */
	public Board(Square[][] squares){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				this.board[i][j] = squares[i][j];
				if(!board[i][j].isVisible()){
					board[i][j].setColor(new Color(255, 250, 205));
				}
				else if((i+j)%2 ==0){
					board[i][j].setColor(Color.DARK_GRAY);
				}
				else board[i][j].setColor(Color.lightGray);
			}
		}
		
		for(int i =0; i<12; i++){
			for(int j =0; j<12; j++){
				if(board[i][j].isVisible()){
					System.out.print(1);
				}
				else System.out.print(0);
			}
			System.out.println("\n");
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
				if(!board[i][j].isTaken()){
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
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 * @return true, if successful
	 */
	public boolean removePiece(Piece p, int col, int row){
		int index = 2;
		int count = 0;
		if(pieces.contains(p)){
			for(int i=0; i<6;i++){
				int pcol = p.getSquareList().get(i).getX();
				int prow = p.getSquareList().get(i).getY();
				ColorBoard(col-(pcol-index), row-(prow-index));
				count++;
				}
		}
		if(count == 6){
			pieces.remove(p);
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if is valid.
	 *
	 * @param p
	 *            the p
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 * @return true, if is valid
	 */
	public boolean isValid(Piece p, int col, int row){
		int index =2;
		int count = 0;
		for(int i=0; i<6;i++){
			int pcol = p.getSquareList().get(i).getX();
			int prow = p.getSquareList().get(i).getY();
			if(col-(pcol-index)>0 || col-(pcol-index) <11){
				if(row-(prow-index)>0 || row-(prow-index)>11){
					if(!board[col-(pcol-index)][row-(prow-index)].isTaken()){
						if(board[col-(pcol-index)][row-(prow-index)].isVisible()){
							count++;
							System.out.print(col-(pcol-index)+" ");
							System.out.println(row-(prow-index)+"    loolololololololololololololol");
						}
					}
				}
			}
		}
		if(count == 6){
			return true;
		}
		System.out.println("NO, FUCK YOUR SHIT");
		return false;
	}
	

	/**
	 * Put piece on board.
	 *
	 * @param p
	 *            the p
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 * @return true, if successful
	 */
	public boolean putPieceOnBoard(Piece p, int col, int row){
		int index = 2;
		if(isValid(p,col,row)){
			for(int i=0; i<6;i++){
				int pcol = p.getSquareList().get(i).getX();
				int prow = p.getSquareList().get(i).getY();
				ColorBoard((col-(pcol-index)),(row-(prow-index)), p.getC());
			}
			pieces.add(p);
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Color board.
	 *
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 */
	public void ColorBoard(int col, int row){
		board[col][row].setTaken(false);
		
		if((col+row)%2 == 0){
			board[col][row].setColor(Color.DARK_GRAY);
		}
		else board[col][row].setColor(Color.lightGray);
	}
	
	/**
	 * Color board.
	 *
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 * @param Color
	 *            the Color
	 */
	public void ColorBoard(int col, int row, Color color){
		board[col][row].setTaken(true);
		board[col][row].setColor(color);
		
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
	

	
	
	public void fuckedup(){
		PieceFactory pf = new PieceFactory();
	
		Piece p = pf.makePiece(3);
		Piece p1 = pf.makePiece(5);
		Piece p2 = pf.makePiece(1);
		p.setC(Color.PINK);
		p1.setC(Color.CYAN);
		p2.setC(Color.GREEN);
		putPieceOnBoard(p2,0,8);
		putPieceOnBoard(p1,2,6);
		putPieceOnBoard(p, 5,4);
		removePiece(p2,0,8);
		putPieceOnBoard(p2,0,8);
		Piece p3 = pf.makePiece(32);
		p3.setC(Color.MAGENTA);
		putPieceOnBoard(p3,11,12);
		
	}

	public void fuckedup(int row, int col){
		PieceFactory pf = new PieceFactory();
		Piece p = pf.makePiece(1);
		p.setC(Color.MAGENTA);
		putPieceOnBoard(p,row,col);
	}

}

