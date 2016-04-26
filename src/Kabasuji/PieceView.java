package Kabasuji;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Jetro
 *
 */
public class PieceView {
	
	SquareView[] square;
	Piece model;
	JButton button;
	
	/**
	 * @param model
	 */
	public PieceView(Piece model){
		this.model = model;
	}
	
	/**
	 * @return
	 */
	public SquareView getSquare(){
		
		
		return square[0];
	}
	
	/**
	 * @return
	 */
	public boolean modelChanged(){
		return false;
	}
	
	public void addActionListener(ActionListener arg0){
		this.button.addActionListener(arg0);
	}

}
