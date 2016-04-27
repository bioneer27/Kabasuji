package Kabasuji;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * @author Himanjal
 *
 */
public class BoardView extends JPanel {
	
	public BoardView(){
		setPreferredSize(new Dimension(384,384));
	}
	
	SquareView[][] grid = new SquareView[Board.SIZE][Board.SIZE];
	Board board;
	
	/**
	 * @param board
	 */
	public BoardView(Board board){
		this.board = board;
//		for(int i=0; i < Board.SIZE; i++)
//			for(int j=0; j< Board.SIZE; j++){
//				grid[i][j] = new SquareView(board.getSquares()[i][j]);
//			}
		
	}
}
