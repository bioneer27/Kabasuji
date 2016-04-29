/*
 * 
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Polygon;

import javax.swing.JPanel;

import Kabasuji.Board;
import Kabasuji.Square;
import Kabasuji.SquareCopy;

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
	 
 	/** The layout. */
 	GridLayout layout;
 	
 	Image offScreenImage = null;
 	
 	Graphics offScreenGraphics = null;
 	
 	int offset = 32;
	 
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
 		for(int i=0; i<Board.SIZE; i++){
 			for(int j=0; j<Board.SIZE; j++){
 				boardView[i][j] = new SquareView(this.board.getBoard()[i][j]);
 				boardView[i][j].setBounds(SQUARE_SIZE * i, SQUARE_SIZE * j, 32, 32);
 			}
 		}


 		setLayout();
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
		g.drawImage(offScreenImage, 0, 0, this);


		
		
 		
 		

 	}
 	
 	/** Draw background and then all pieces on top of it. */
	public void redraw() {
		// Once created, draw each, with buffer.
		int x = offset;
		int y = offset;
		
		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);
		
		
		//Puzzle p = model.getPuzzle();
//		Polygon polyshape = computePolygon (x, y, p);
		offScreenGraphics.setColor(Color.black);
		offScreenGraphics.fillRect(x, y, 32, 32);
		
		
		
		
		
		// double check if no model (for WindowBuilder)
		if (board == null) { return; }
		
 		int i, j;	
 		
 		
 		boolean[][] one = new boolean[6][6];
		one[2][0] = true;
		one[2][1] = true;
		one[2][2] = true;
		one[2][3] = true;
		one[2][4] = true;
		one[2][5] = true;
		
		offScreenGraphics.setColor(Color.PINK);
		
		for (i = 0; i < 6; i++){
			for (j = 0; j < 6; j++){
				if (one[i][j]){
					
					offScreenGraphics.fillRect((i * 32) + 400, (j * 32) + 400, 32, 32);
				}
			}
		}
		
		System.out.println("FUCKTHISSHIT");
		
		// placed pieces.
//		if (model.getPlacedPieces() != null) {
//			for (PlacedPiece pp : model.getPlacedPieces()) {
//				if (pp != model.getDraggingPiece()) {
//					//offScreenGraphics.setColor(colorMapping.get(pp.getPiece()));
//					offScreenGraphics.fillPolygon(pp.getPolygon());
//				}
//			}
//		}		
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

