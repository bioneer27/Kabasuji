/*
 * 
 */
package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Kabasuji.PieceFactory;
import view.BullpenView;
import model.Bullpen;
import model.Piece;

/**
 * The Class BullpenController.
 */
/*
 * 
 * @author Himanjal
 */
public class BullpenController  implements MouseListener, MouseMotionListener, KeyListener{
	
	/** The bp. */
	private Bullpen bp;
	BullpenView bullpenView;
	
	Piece draggingPiece =  new PieceFactory().makePiece(100);
	/**
	 * Instantiates a new bullpen controller.
	 *
	 * @param bp
	 *            the bp
	 */
	public BullpenController(Bullpen bp, BullpenView bullpenView){
		this.setBp(bp);
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
		//int row = e.getX();
		int col = e.getY();
		col = col/200;
		
		System.out.println("Piece Number"+col);
		if(e.getButton() ==1){
			if((draggingPiece.getId() != 100)&& (draggingPiece != null) && (draggingPiece != bp.getSelectedPiece())){
				bp.addPiece(draggingPiece, col);
				draggingPiece = new PieceFactory().makePiece(100);
			}
			else{
			getBp().setSelectedPiece(col);
			}
		}
		if(e.getClickCount() ==1){
			getBp().rotate(col);
			}
		
		bullpenView.refresh();
		
		//System.out.println(row + "    " +col);
		
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

	public Bullpen getBp() {
		return bp;
	}

	public void setBp(Bullpen bp) {
		this.bp = bp;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.isControlDown()){
			bp.flipX();
		}
		if(arg0.isAltDown()){
			bp.flipY();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
