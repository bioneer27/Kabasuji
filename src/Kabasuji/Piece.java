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
	int centerX, centerY, pixelLength;
	
	Color c;
	boolean[][] pieces;
	private int id;
	

	
	/**
	 * @param color
	 * @param pieces
	 * @param id
	 */
	public Piece(Color color, boolean[][] pieces, int id){
		
		//this.canMove = new boolean[6][6];
		this.pieces = pieces;
		//squares = new Square[6][6];

		this.setId(id);
		
		int i, j;
		
		createSquares(pieces);

		
	}
	
	private void createSquares(boolean[][] squares){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (squares[i][j]){
						squareList.add(new SquareCopy(i, j, length, length));
					}
				}
			}
		  
	  }
	
	public boolean containsPoint(double x, double y) {
		  System.out.print(x);
		  System.out.print(" ");
		  System.out.println(y);
		  System.out.println(centerX);
		  System.out.println(centerY);

		  
		  System.out.println("Life man");
		  double x0;
		  double y0;
		  
		  for (SquareCopy s: squareList){		

			
	        x0 = (pixelLength * s.x) + centerX;
	        y0 = (pixelLength * s.y) + centerY;
			        
	        if (x >= (x0 - 10) &&
	                y >= (y0 - 10) &&
	                x < x0 + s.width &&
	                y < y0 + s.height){
//	        	
	        	return true;
	        }
		  }
		  return false;
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

	/*
	public Square[] getPiece(){
		return this.squares[0];
	}
	*/

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
