/*
 * 
 */
package builderView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;

import builderModel.PieceFactory;
import builderModel.Board;
import builderModel.Piece;
import builderModel.SelectedPiece;
import builderModel.Square;


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
 	Board board;
 	
	private Square[][] squares;
	Piece selectedPiece;
	
	private Piece draggingPiece;
	
	PieceFactory pf = new PieceFactory();

	 
 	/** The layout. */
 	GridLayout layout;
 	
 	Image offScreenImage = null;
 	
 	Graphics offScreenGraphics = null;
 	
 	int offset = 32;
 	
 	int size = 12;
 	
 	int X = 0;
 	int Y = 0;
	 
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
 		this.board = board;
 		this.squares = board.getBoard();
 		PieceFactory pf = new PieceFactory();
 		this.selectedPiece = pf.makePiece(5);
 		/*for(int i=0; i<Board.SIZE; i++){
 			for(int j=0; j<Board.SIZE; j++){
 				boardView[i][j] = new SquareView(this.board.getBoard()[i][j]);
 				boardView[i][j].setBounds(SQUARE_SIZE * i, SQUARE_SIZE * j, 32, 32);
 			}
 		}*/
 		
 		

 		//setLayout();
 	}
 	@Override
 	public void paintComponent(Graphics g){
 		super.paintComponent(g);
 		
		if (offScreenImage == null) {
			// create on demand
			Dimension s = getPreferredSize();
			offScreenImage = this.createImage(s.width, s.height);
			offScreenGraphics = offScreenImage.getGraphics();

			redraw();
		}

		// if no offscreenImage, then Swing hasn't fully initialized; leave now
		if (offScreenImage == null) {
			System.err.println("Swing not ready for drawing.");
			return;
		}
		
		// copy image into place.

		//g.drawImage(offScreenImage, 0, 0, this);

		g.drawImage(offScreenImage, 0, 0, this);
		


		
		
 		
 		

 	}
 	

 	
 	/** Draw background and then all pieces on top of it. */
	public void redraw() {
		// Once created, draw each, with buffer.
		
		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);
		
		
		offScreenGraphics.setColor(Color.black);
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				
				if(!squares[i][j].isVisible()){
					offScreenGraphics.setColor(new Color(255, 250, 205));
					offScreenGraphics.fillRect(i * offset, j * offset, offset, offset);

				}
				else {
					offScreenGraphics.setColor(board.getBoard()[i][j].getColor());
					offScreenGraphics.fillRect(i * offset, j * offset, offset, offset);

				}
			}
		}
		
		int i, j;	
		repaint();
		
		if(draggingPiece != null){
	
			offScreenGraphics.setColor(Color.pink);
			boolean[][] abc = new boolean[6][6];
			abc = getDraggingPiece().getBooleans();
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (abc[i][j]){
					//	Draw a piece in a specific place on the board to show you can
						offScreenGraphics.fillRect((i * 32) + (this.X - 96), (j * 32) + (this.Y - 96), 32, 32);
					}
				}
			}
		}
	}
	
	
	
	
	public void setX(int x){
		this.X =x;
	}
	
	public void setY(int y){
		this.Y = y;
	}
	
	public void setSelectedPiece(Piece p){
		this.selectedPiece = p;
		
	}

	 /**
	 * Sets the layout.
	 */
 	public void setLayout(){
		 
		 this.setLocation(1000, 1000);
		 this.setSize(new Dimension(384, 384));
		 
		 this.setBackground(Color.BLACK);
 	}

	public Piece getDraggingPiece() {
		return draggingPiece;
	}

	public void setDraggingPiece(Piece draggingPiece) {
		this.draggingPiece = draggingPiece;
	}

}



