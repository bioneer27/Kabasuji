/*
 * 
 */
package Kabasuji;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Piece;

/**
 * @author Jetro
 *
 */
public class PieceView {
	
	/** The square. */
	SquareView[] square;
	
	/** The model. */
	private Piece model;
	
	/** The button. */
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
	
	/**
	 * Adds the action listener.
	 *
	 * @param arg0
	 *            the arg0
	 */
	public void addActionListener(ActionListener arg0){
		this.button.addActionListener(arg0);
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public Piece getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	public void setModel(Piece model) {
		this.model = model;
	}

}
