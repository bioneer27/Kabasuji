package Kabasuji;

import javax.swing.JPanel;

/**
 * @author xavier
 *
 */
public class BoardView extends JPanel {
	SquareView[][] grid = new SquareView[Board.SIZE][Board.SIZE];
	Board board;
	
	/**
	 * @param board
	 */
	public BoardView(Board board){
		this.board = board;
		for(int i=0; i < Board.SIZE; i++)
			for(int j=0; j< Board.SIZE; j++){
				grid[i][j] = new SquareView(board.getSquares()[i][j]);
			}
		
	}
}
