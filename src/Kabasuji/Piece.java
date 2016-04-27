package Kabasuji;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;


/**
 * @author Jetro
 *
 */
public class Piece {
//	Square[][] squares;
	List<SquareCopy> squareList;

	boolean[][] pieces;
	int id;
	

	
	/**
	 * @param color
	 * @param pieces
	 * @param id
	 */
	public Piece(Color color, boolean[][] pieces, int id){
		
		//this.canMove = new boolean[6][6];
		this.pieces = pieces;
		//squares = new Square[6][6];
		int length  = pieces.length;
		int height = pieces[0].length;
		this.id = id;
		
		int i, j;
		
		for (i = 0; i < height; i++){
			for(j = 0; j < length; j++ ){
				if (pieces[i][j] == true){
					
				}
			}
		}

		
	}
	/*
	 * 
	 * Code by Himanjal
	 * Please dont erase
	 * 
	public Piece(boolean[][] pieces, int ID){
		this.pieces = pieces;
		squares = new Square[6][6];
		this.id = ID;
		
		for(int i = 0; i<6; i++){
			for(int j=0; j<6; j++){
				if(pieces[i][j] == true){
					squares[i][j] = new Square(i, j, this, true, true);
				}
				else squares[i][j] = new Square(i, j, this, false, false);
			}
		}
	}
	
	public void rotateLeft(){
		Square[][] temp = new Square[6][6];
		for(int i =0;i<6;i++){
			for(int j=0; j<6;j++){
				temp[i][j] = squares[i][j];
			}
		}
		
		for(int i=1; i<6; i++){
			for(int j =1; j<6; j++){
				
			int row = temp[i][j].row;
			int col = temp[j][j].col;
			squares[i][j] = temp[5-col][row];
			}
		}
	}
	
	public void rotateRight(){
		Square[][] temp = new Square[6][6];
		for(int i =0;i<6;i++){
			for(int j=0; j<6;j++){
				temp[i][j] = squares[i][j];
			}
		}
		
		for(int i=1; i<6; i++){
			for(int j =1; j<6; j++){
				
			int row = temp[i][j].row;
			int col = temp[j][j].col;
			squares[i][j] = temp[col][5-row];
			}
		}
	}
	
	public void flipHorizontal(){
		Square[][] temp = new Square[6][6];
		for(int i =0;i<6;i++){
			for(int j=0; j<6;j++){
				temp[i][j] = squares[i][j];
			}
		}
		
		for(int i=1; i<6; i++){
			for(int j =1; j<6; j++){
				
			int row = temp[i][j].row;
			int col = temp[j][j].col;
			squares[i][j] = temp[row][5-col];
			}
		}
	}
	
	public void flipVertical(){
		Square[][] temp = new Square[6][6];
		for(int i =0;i<6;i++){
			for(int j=0; j<6;j++){
				temp[i][j] = squares[i][j];
			}
		}
		
		for(int i=1; i<6; i++){
			for(int j =1; j<6; j++){
				
			int row = temp[i][j].row;
			int col = temp[j][j].col;
			squares[i][j] = temp[5-row][col];
			}
		}
	}
	*/
	public void setPiece(PieceType type){
		return;
	}
	/*
	public Square[] getPiece(){
		return this.squares[0];
	}
	*/
	public int getID(){return id;}

}
