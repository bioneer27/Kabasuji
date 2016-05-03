/*
 * 
 */
package builderModel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import builderModel.PieceFactory;
import builderModel.PieceType;
import builderModel.Bullpen;
import builderModel.Piece;
import builderModel.Square;
import builderModel.BuilderRSet;

/**
 * @author Himanjal
 *
 */
public class Board {

	public Board(){
		int i,j;
		this.setBp(new Bullpen());
		for (i = 0; i < 12; i++){
			for (j = 0; j < 12; j++){
				board[i][j] = new Square(i, j, this, true, false);
				if((i+j)%2 ==0){
					board[i][j].setColor(Color.DARK_GRAY);
				}
				else board[i][j].setColor(Color.lightGray);
			}
		}
	}
	/** The Constant SIZE. */
	public static final int SIZE = 12;

	/** The board. */
	private Square[][] board = new Square[12][12];
	
	/** The pieces. */
	ArrayList<Piece> pieces = new ArrayList<Piece>();

	private Bullpen bp;
	
	Piece selectedPiece = new PieceFactory().makePiece(100);
	
	private PieceType pt;
	
	private int moves = 0;

	
	/**
	 * Instantiates a new board.
	 */
	public Board(Square[][] squares, Bullpen bp, PieceType type){
		this.setBp(bp);
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				this.board[i][j] = squares[i][j];
				this.board[i][j].p =  new PieceFactory().makePiece(100);
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
			System.out.println(col-(pcol-index) + "   " + (row -(prow-index)) );
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
			p.XLocation= col;
			p.YLocation = row;
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
		
	}
	
	/**
	 * Put piece on board.
	 *
	 * @param piece
	 *            the p
	 * @param col
	 *            the col
	 * @param row
	 *            the row
	 * @return true, if successful
	 */
	public boolean putPieceOnBoardLB(builderModel.Piece piece, int col, int row){
		int index = 2;
		col--;
		row--;
		if(isValid(piece,col,row)){
			for(int i=0; i<6;i++){
				
				int pcol = piece.getSquareList().get(i).getRow();
				int prow = piece.getSquareList().get(i).getCol();
				ColorBoard((col+(pcol-index)),(row+(prow-index)), piece);
			}
			piece.XLocation = col;
			piece.YLocation = row;
			pieces.add(piece);
			
			List<Square> sq = piece.getSquareList();
			for (Square s: sq){
				s.rs = new BuilderRSet(s.getColor(), s.getCol() + s.getRow());
			}
			setMoves(getMoves() - 1);
			return true;
		}
		
		return false;
	}
	
	public String toTxt(){
		String love = "";
		for(int j=0; j<12; j++){
			for(int i=0; i<12; i++){
				if(board[i][j].isTaken()==true){
					love = love + "1";
				}
				if(board[i][j].isTaken()==false){
					love = love + "0";
				}
				if((i==11) && (j==11)){
				}else love = love + ",";
			}
		}
		return love;
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
	
	public int getMoves() {
		return moves;
	}
	
	public void setMoves(int moves) {
		this.moves = moves;
	}
	
	public ArrayList<Piece> getPieces(){
		return pieces;
	}
}