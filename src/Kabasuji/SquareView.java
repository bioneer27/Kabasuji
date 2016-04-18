package Kabasuji;

import javax.swing.JButton;

public class SquareView {
	
	JButton square;
	Square model;
	
	public SquareView(Square model){
		this.model = model;
	}
	
	public JButton getSquareButton(){
		return square;
	}

	
	public boolean modelChanged(){
		return false;
	}
}
