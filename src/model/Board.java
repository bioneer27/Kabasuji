/*
 * 
 */
package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import Controller.BullpenController;
import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import view.BullpenView;
import view.LevelView;

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

	private Bullpen bp;
	
	Piece selectedPiece = new PieceFactory().makePiece(100);
	
	private PieceType pt;
	
	BullpenController bpc = new BullpenController(bp, new BullpenView());
	private int moves = 0;
	
	private boolean completed;
	
	private LevelView lvlView;
	
	/**
	 * Instantiates a new board.
	 */
	public Board(Square[][] squares, PieceType type){
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				this.board[i][j] = squares[i][j];
				this.board[i][j].p =  new PieceFactory().makePiece(100);
				
				board[i][j].setRS(new RSet(Color.RED, 3, false));
				
				if(!board[i][j].isVisible()){
					board[i][j].setColor(new Color(255, 250, 205));
				}
				else if((i+j)%2 ==0){
					board[i][j].setColor(Color.DARK_GRAY);
				}
				else board[i][j].setColor(Color.lightGray);
			}
		}
		this.setCompleted(false);
			
			board[5][5].setRS(new RSet(Color.RED, 5 , true ));
			board[7][5].setRS(new RSet(Color.RED, 5 , true ));
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
			int pcol = p.getSquareList().get(i).getRow();
			int prow = p.getSquareList().get(i).getCol();
			//System.out.println(col-(pcol-index) + "   " + (row -(prow-index)) );
			if(col+(pcol-index)>=0 && col+(pcol-index) <12){
				if(row+(prow-index)>=0 && row+(prow-index)<12){
					if((!board[col+(pcol-index)][row+(prow-index)].isTaken()) || (this.pt == PieceType.LIGHTNING)){
						if(board[col+(pcol-index)][row+(prow-index)].isVisible()){
							count++;
						}
					}
				}
			}
		}
		if(count == 6){
			return true;
		}
		//System.out.println("NO, FUCK YOUR SHIT");
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
		col--;
		row--;
		if(isValid(p,col,row)){
			for(int i=0; i<6;i++){
				
				int pcol = p.getSquareList().get(i).getRow();
				int prow = p.getSquareList().get(i).getCol();
				ColorBoard((col+(pcol-index)),(row+(prow-index)), p);
			}
			p.XLocation = col;
			p.YLocation = row;
			pieces.add(p);
			
			List<Square> sq = p.getSquareList();
			for (Square s: sq){
				s.rs = new RSet(s.getColor(), s.getCol() + s.getRow());
			}
			setMoves(getMoves() + 1);
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
	public void ColorBoard(int col, int row, Piece p){
		board[col][row].setTaken(true);
		board[col][row].setColor(p.getC());
		board[col][row].p = p;
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
	 * Sets the board.
	 *
	 * @param board
	 *            the new board
	 */
	public void setBoard(Square[][] board) {
		this.board = board;
	}
	

	public void removePiece(int row, int col){
		
		Piece p = board[row][col].p;
		for(int i=0; i<12; i++){
			for(int j=0; j<12; j++){
				if(board[i][j].p == p){
					if((board[i][j].p.XLocation == p.XLocation) && (board[i][j].p.YLocation == p.YLocation)){
						board[i][j].setTaken(false);
						board[i][j].p = new PieceFactory().makePiece(100);
						ColorBoard(i,j);
					}
				}
			}
		}

		selectedPiece = p;
		pieces.remove(p);
		//setMoves(getMoves() - 1);
		
	}

	
	public void fuckedup(){
	
	}
	

	public void setSelectedPiece(Piece p){
		selectedPiece = p;
		
	}
	
	public Piece getSelectedPiece(){
		return selectedPiece;
	}

	public Bullpen getBp() {
		return bp;
	}


	public void setBp(Bullpen bp) {
		this.bp = bp;
	}

	public PieceType getPt() {
		return pt;
	}

	public void setPt(PieceType pt) {
		this.pt = pt;
	}
	
	public void setBpc(BullpenController bpc){
		this.bpc =bpc;
		this.bp = this.bpc.getBp();
	}
	public BullpenController getBpc(){
		return bpc;
	}
	
	public ArrayList<Piece> getPieces(){
		return pieces;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean getCompleted() {
		return this.completed;
	}

	public LevelView getLvlView() {
		return lvlView;
	}

	public void setLvlView(LevelView lvlView) {
		this.lvlView = lvlView;
	}
	
	public void clearBoard(){
		int i, j;
		
		for (i = 0; i < 12; i++){
			for(j = 0; j < 12; j++){
				board[i][j].setPiece(new PieceFactory().makePiece(100));
				board[i][j].setTaken(false);
				if((i+j)%2 ==0){
					board[i][j].setColor(Color.DARK_GRAY);
				}
				else 
					board[i][j].setColor(Color.lightGray);
			
			}
		}
		
		moves = 0;
	}
	
}


