package Kabasuji;

import javax.swing.JPanel;

public class BoxView {
	JPanel box1;
	PieceView piece;
	Box model;
	
	public BoxView(Box model){
		this.model = model;
		
	}
	
	public JPanel getBox(){
		return box1;
	}
	
	public PieceView getPiece(){
		return piece;
	}
	
	boolean modelChanged(){
		return false;
	}

}
