package Kabasuji;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxView {
	JPanel box1;
	PieceView piece;
	protected Box model;
	
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
	
	public Box getModel(){
		return model;
	}
	
	public Component initialize(){
		model.setLayout(new GridLayout(6, 6, 0, 0));
		
		int i;
		int j;
		for ( i = 0; i < 6 ; i++){
			for ( j = 0; j < 6; j++ ){
				JButton temp = new JButton("");
				if (model.squares[i][j] == 0){
					temp.setBackground(Color.LIGHT_GRAY);
				}
				else{
					temp.setBackground(Color.ORANGE);
				}
				model.add(temp);
			}
			
		}
		return model;
		
	}

}
