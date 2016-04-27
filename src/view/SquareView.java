package view;

import java.awt.Color;

import Kabasuji.Square;
import java.awt.Graphics;

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
	
	
	public void paint(Graphics g){
		if(s.isVisible()){
			g.fillRect(s.getRow(), s.getCol(), s.getLength(), s.getLength());
		}
	}

}
