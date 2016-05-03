/*
 * 
 */
package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.List;

import javax.swing.JPanel;

import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import model.Board;
import model.Piece;
import model.Square;


/**
 * The Class BoardView.
 * 
 * @author Himanjal
 */
public class BoardView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** The Constant SQUARE_SIZE. */
	static final int SQUARE_SIZE = 32;
	 
 	/** The board. */
 	Board board;
 	
	private Square[][] squares;
	
	private Piece draggingPiece;
	
	PieceFactory pf = new PieceFactory();
 	
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
			return;
		}
		

		g.drawImage(offScreenImage, 0, 0, this);
		


		
		
 		
 		

 	}
 	

 	
 	/** Draw background and then all pieces on top of it. */
	public void redraw() {
		// Once created, draw each, with buffer.
		
		
		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);
		
		Graphics2D g2 = (Graphics2D) offScreenGraphics;

		
		
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
					
		
					
					if(PieceType.RELEASE == board.getPt()){

						if (board.getBoard()[i][j].getRS() != null && board.getBoard()[i][j].getRS().getRSetVisible()){
							offScreenGraphics.setColor(board.getBoard()[i][j].getRS().getRSColor());
							offScreenGraphics.setFont(new Font("TimesRoman", Font.PLAIN, 32)); 
							offScreenGraphics.drawString(Integer.toString(board.getBoard()[i][j].getRS().getRSInt()), (i * offset)+5, ((j+1) * offset)-5);
							
						}
					}
					
					g2.setStroke(new BasicStroke(1));							

					offScreenGraphics.setColor(Color.black);

					offScreenGraphics.drawLine(i *offset, j * offset,  (i * offset) + offset, (j * offset));
					offScreenGraphics.drawLine(i *offset, (j * offset) + offset,  (i * offset) + offset, (j * offset) + offset);
					offScreenGraphics.drawLine((i *offset) + offset, (j * offset) + offset,  (i * offset) + offset, (j * offset));
					offScreenGraphics.drawLine((i *offset) , (j * offset) + offset,  (i * offset), (j * offset));

				}
				
				if (!squares[i][j].isTaken()){
					if (squares[i][j].getHint()){

						g2.setStroke(new BasicStroke(3));							


						g2.setColor(Color.cyan);
						
						offScreenGraphics.fillRect(i * offset, j * offset, offset, offset);

						

					}
				}
			}
		}
		
		
		repaint();
		
		if(draggingPiece != null){
			
			List<Square> sq = draggingPiece.getSquareList();
			
			for(Square s: sq){
				offScreenGraphics.setColor(draggingPiece.getC());
				offScreenGraphics.fillRect((s.getRow() * offset) + (this.X - 96), (s.getCol() * offset) + (this.Y - 96), offset, offset);
			}
			
			
		}
	}
	
	
	
	
	public void setX(int x){
		this.X =x;
	}
	
	public void setY(int y){
		this.Y = y;
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



