package view;

import java.awt.Color;

import Kabasuji.Square;

public class SquareView {
	Square s;
	Color c;

	public SquareView(Square s){
		this.s = s;
		this.c = s.getColor();
	}
	
	public void setColor(Color col){
		this.c = col;
	}
	

}
