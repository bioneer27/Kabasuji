/*
 * 
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Controller.BullpenController;
import Kabasuji.PieceView;
import Kabasuji.WindowClass;
import model.Bullpen;
import model.Piece;
import java.awt.Dimension;

/**
 * Shows all Kabasuji pieces in single panel, meant to be scrolled over.
 * 
 * Each piece is shows in its normal orientation, assuming squareSize pixels for square length
 * 
 * Drawn so center is in middle of unit square
 */
/**
 * @author Himanjal
 *
 */
public class BullpenView extends JPanel  {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pieces. */
	ArrayList<Piece> pieces;
		
	public final int offset = 4;
	public final int squareSize = 32;
	
	/** The piece view. */
	PieceView pieceView[];
	
	/** The bp. */
	Bullpen bp;
	
	Image offScreenImage = null;
	Graphics offScreenGraphics = null;
	
	
	/**
	 * Instantiates a new bullpen view.
	 */
	BullpenView(Bullpen bp){
		super();
		this.bp = bp;
		this.pieces = bp.getPieces();
		setLayout();
		
	}
	
	
	@Override
	public Dimension getMinimumSize(){
		int width = squareSize + 2*offset;
		int height = 10 * squareSize + pieces.size()*(squareSize*offset);
		
		return new Dimension(width, height);
	}
	
	@Override
	public Dimension getPreferredSize(){
		int width = 400;
		int height = 10*offset + pieces.size()* 200;
		
		return new Dimension(width, height);
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		if(offScreenImage == null){
			Dimension s = getPreferredSize();
			offScreenImage = this.createImage(s.width,s.height);
			offScreenGraphics = offScreenImage.getGraphics();
			System.out.println("Size of pieces");
			System.out.println(pieces.size());
			redraw();
		}
		
		
		if(offScreenImage == null){
			System.err.println("Swing not ready for drawing");
			return;
		}
		g.drawImage(offScreenImage, 0, 0, this);
	}
	
	public void refresh(){
		this.pieces = bp.getPieces();
		redraw();
		repaint();
	}
	
	void redraw(){
		int x= 0;
		int y = 0;

//		for(Piece piece : pieces){
//			if(piece == bp.getSelectedPiece()){
//				offScreenGraphics.setColor(Color.RED);
//			}
//			else{
//				offScreenGraphics.setColor(piece.getC());
//			}
//		}
		//offScreenGraphics.fillRect(x, y, width, height);

		y+= squareSize + offset;
		
		boolean[][] squares;

		for (Piece p : pieces) {
			
			squares = p.getBooleans();

			
			offScreenGraphics.setColor(p.getC());	
			
			int i, j;
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (squares[i][j]){
						//Draw a piece in a specific place on the board to show you can
						offScreenGraphics.fillRect((i * 32) , (j * 32) + y, 32, 32);
					

					}
				}
			}
			y += 200;
			
			//offScreenGraphics.fillRect(0, 0, 320, 320);



		}



		// draw pieces vertically down 
		//	}



	}

	
	public void setLayout(){
		this.setSize(new Dimension(200, 1000));
	}
	
}
