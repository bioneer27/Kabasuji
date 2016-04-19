package Kabasuji;

import java.awt.Color;

import javax.swing.JButton;

public class SquareView {
	
	JButton square;
	Square model;
	
	public SquareView(Square model){
		this.model = model;
		square = new JButton("Square");
		square.setBackground(new Color(255, 248, 220));
		square.setVisible(true);
	}
	
	public JButton getSquareButton(){
		return square;
	}

	
	public boolean modelChanged(){
		return false;
	}
}
