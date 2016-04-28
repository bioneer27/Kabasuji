/*
 * 
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Kabasuji.PieceView;
import model.Bullpen;

/**
 * The Class BullpenController.
 */
/*
 * 
 * @author Himanjal
 */
public class BullpenController  implements ActionListener{
	
	/** The bp. */
	Bullpen bp;
	
	/**
	 * Instantiates a new bullpen controller.
	 *
	 * @param bp
	 *            the bp
	 */
	public BullpenController(Bullpen bp){
		this.bp = bp;
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PieceView source = (PieceView) arg0.getSource();
		bp.setSelectedPiece(source.getModel().getId());
		
	}

}
