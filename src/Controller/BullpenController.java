/*
 * 
 */
package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Kabasuji.PieceFactory;
import builderView.BuilderBullpenView;
import model.Board;
import model.Bullpen;
import model.Piece;
import view.BullpenView;

/**
 * The Class BullpenController.
 */
/*
 * 
 * @author Himanjal
 */
public class BullpenController  implements MouseListener, MouseMotionListener{
	
	/** The bp. */
	Bullpen bp;
	BullpenView bullpenView;
	/**
	 * Instantiates a new bullpen controller.
	 *
	 * @param bp
	 *            the bp
	 */
	public BullpenController(Bullpen bp, BullpenView bullpenView){
		this.bp = bp;
		this.bullpenView = bullpenView;
		
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = e.getX();
		int col = e.getY();
		col = col/200;
		if(e.getButton() ==1){
			bp.setSelectedPiece(col+1);
		}
		System.out.println(e.getButton());
		if(e.getButton() == 3){
			bp.rotate(col);
		}
		bullpenView.refresh();
		
		System.out.println(row + "    " +col);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
