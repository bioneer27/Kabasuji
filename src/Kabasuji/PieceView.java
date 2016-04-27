package Kabasuji;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Piece;

/**
 * @author Jetro
 *
 */
public class PieceView {
	
	SquareView[] square;
	private Piece model;
	JButton button;
	
	/**
	 * @param model
	 */
	public PieceView(Piece model){
		this.setModel(model);
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

	public Piece getModel() {
		return model;
	}

	public void setModel(Piece model) {
		this.model = model;
	}

}
