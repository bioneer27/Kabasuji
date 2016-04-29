/*
 * 
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Kabasuji.Board;
import Kabasuji.Square;

/**
 * The Class BoardView.
 */
public class BoardView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The Constant BOARD_SIZE. */
	private static final int BOARD_SIZE = 384;
	
	/** The Constant SQUARE_SIZE. */
	static final int SQUARE_SIZE = 32;
	 
 	/** The board view. */
 	SquareView[][] boardView = new SquareView[Board.SIZE][Board.SIZE];
	 
 	/** The board. */
 	Board board = new Board();
	 
 	/** The layout. */
 	GridLayout layout;
	 
	 /* (non-Javadoc)
 	 * @see javax.swing.JComponent#getPreferredSize()
 	 */
 	@Override
	 public Dimension getPreferredSize(){
		 return new Dimension(400, 400);
	 }
	 
	 /**
	 * Instantiates a new board view.
	 *
	 * @param board
	 *            the board
	 */
 	public BoardView(Board board){
		 this.board = new Board();
		 for(int i=0; i<Board.SIZE; i++){
			 for(int j=0; j<Board.SIZE; j++){
				 boardView[i][j] = new SquareView(this.board.getBoard()[i][j]);
				 boardView[i][j].setBounds(SQUARE_SIZE * i, SQUARE_SIZE * j, 32, 32);
			 }
		 }
		 
		 
		 setLayout();
	 }

	 /**
	 * Sets the layout.
	 */
 	public void setLayout(){
		 //this.boardPanel = new JPanel();
		 
		 this.setLocation(1000, 1000);
		 this.setSize(new Dimension(384, 384));
		 
		 this.setBackground(Color.BLACK);
		 
		 layout = new GridLayout(12,12,1,1);
		 
		 this.setLayout(null);
		 
		 for(int i=0; i<12; i++){
			 for(int j=0;j<12;j++){
				 add(boardView[i][j]);
			 }
		 }
	 }
}

