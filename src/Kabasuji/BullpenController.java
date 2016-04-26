package Kabasuji;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * 
 * @author Himanjal
 */
public class BullpenController  implements ActionListener{
	Bullpen bp;
	
	public BullpenController(Bullpen bp){
		this.bp = bp;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		PieceView source = (PieceView) arg0.getSource();
		bp.setSelectedPiece(source.model.id);
		
	}

}
