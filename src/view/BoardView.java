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
//				 boardView[i][j].setLocation(SQUARE_SIZE * i, SQUARE_SIZE * j); 
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
		 
		 
		 /*
		 add(new SquareView(new Square(2,2, board, true, true)));
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 
//		 add(new JButton(""));
//		 add(new JButton(""));
//		 add(new JButton(""));
		 
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		add(new SquareView(new Square(2,2, board, true, true)));
		//add(boardView[2][3]);
		
		//add(new JButton(""));
		*/
//		 
//		 JButton btnNewButton_1 = new JButton("New button");
//		 add(btnNewButton_1);
//		 
//		 JButton btnNewButton = new JButton("New button");
//		 add(btnNewButton);
//		 
		 
		 
		 
		 
		 /*
		 groupLayout = new GroupLayout(boardPanel);
		 GroupLayout.SequentialGroup hGroup = groupLayout.createSequentialGroup();
		 GroupLayout.SequentialGroup vGroup = groupLayout.createSequentialGroup();
		 
		 
		 
		 for(int i=0; i<Board.SIZE; i++){
			 hGroup.addGroup(groupLayout.createParallelGroup());
			 for(int j=0;j<Board.SIZE;j++){
				 hGroup.addComponent(boardView[j][i]);
				 
			 }
		 }
		 groupLayout.setHorizontalGroup(hGroup);
		 
		 for(int i=0; i<Board.SIZE; i++){
			 vGroup.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE));
			 for(int j=0;j<Board.SIZE;j++){
				 vGroup.addComponent(boardView[i][j]);				 
			 }
		 }
		 
		 groupLayout.setVerticalGroup(vGroup);
		 */
	 }
	 
//	 @Override
//		public Dimension getMinimumSize() {
//			int width = BOARD_SIZE;
//			int height = BOARD_SIZE;
//
//			return new Dimension (width, height);
//		}
//
//
//		/** 
//		 * Swing thing. We must be large enough to draw all Tangram pieces. 
//		 */
//		@Override
//		public Dimension getPreferredSize() {
//			int width = BOARD_SIZE;
//			int height = BOARD_SIZE;
//			
//			return new Dimension (width, height);
//		}


	
}

