/*
 * 
 */
package builderController;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import builderModel.PieceFactory;
import builderView.BullpenView;
import builderModel.Bullpen;
import builderModel.Piece;
import builderModel.Level;

/**
 * The Class BullpenController.
 */
/*
 * 
 * @author Himanjal, Xavier
 */
public class BullpenController  implements MouseListener, MouseMotionListener, KeyListener{
	
	/** The bp. */
	private Bullpen bp;
	BullpenView bullpenView;
	Level level;
	
	Piece draggingPiece =  new PieceFactory().makePiece(100);
	/**
	 * Instantiates a new bullpen controller.
	 *
	 * @param bp
	 *            the bullpen
	 * @param bullpenView
	 * 				The bullpenView
	 */
	public BullpenController(Bullpen bp, BullpenView bullpenView){
		this.setBp(bp);
		this.bullpenView = bullpenView;	
	}
	/**
	 * Instantiates a new bullpen controller.
	 *
	 * @param bp
	 *            the bullpen
	 * @param bullpenView
	 * @param level
	 */
	public BullpenController(Bullpen bp, BullpenView bullpenView, Level level){
		this.setBp(bp);
		this.bullpenView = bullpenView;	
		this.level = level;
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
		
		if(e.getButton() ==1){
			if((draggingPiece.getId() != 100)&& (draggingPiece != null) && (draggingPiece != bp.getSelectedPiece())){
				
				/** copy bullpen, send to stack before add piece */ 
				level.pushCurrentBullpen(bp.copy());
				
				bp.addPiece(draggingPiece, col);
				
				/** copy bullpen, send to stack after adding piece*/
				level.pushCurrentBullpen(bp.copy());
				
				draggingPiece = new PieceFactory().makePiece(100);
				bp.setSelectedPiece(100);
				
			}
			else{
				if(bp.samePieceClicked(col)){
					bp.setSelectedPiece(100);
				}else getBp().setSelectedPiece(col);
			}
		}
		if(e.getButton() ==3){
			getBp().rotate(col);
			}
		
		if(e.getButton() == 2){
			getBp().flipX(col);
		}
		
		bullpenView.refresh();
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
			bp.flipX(bp.getSelectedPiece().getId());
		}
		if(arg0.isAltDown()){
			bp.flipY(bp.getSelectedPiece().getId());
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
