package view;
import java.awt.event.MouseEvent;

import model.Piece;


/**
 * @author xavier
 *
 */
public class PieceView {
	Piece p;


	public PieceView(Piece p){
		this.p = p;
	}

	public void updateLocation(MouseEvent e) {

	//repaint();
	}
	
	public Piece getModel(){
		return p;
	}
}
