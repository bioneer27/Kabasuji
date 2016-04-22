package Kabasuji;

import javax.swing.JPanel;

public class BoardView extends JPanel {
	SquareView[][] grid = new SquareView[Board.SIZE][Board.SIZE];
	Board board;
	
	public BoardView(Board board){
		this.board = board;
		for(int i=0; i < Board.SIZE; i++)
			for(int j=0; j< Board.SIZE; j++){
				grid[i][j] = new SquareView(board.squares[i][j]);
			}
		
	}
}
