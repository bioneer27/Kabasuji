package Kabasuji;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SquareView extends java.awt.event.MouseAdapter{
	
	JButton square;
	Square model;
	
	public SquareView(Square model){
		this.model = model;
		square = new JButton("Square");
		square.setBackground(new Color(255, 248, 220));
		square.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				square.setLocation(e.getXOnScreen(), e.getYOnScreen());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		square.addMouseListener(new MouseListener(){
			public void mouseClicked(java.awt.event.MouseEvent me){
				//square.setBackground(new Color(120, 248, 220));
			}
			public void mousePressed(java.awt.event.MouseEvent me){
				//square.setLocation(me.getX(), me.getY());
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		square.setVisible(true);
	}
	
	public JButton getSquareButton(){
		return square;
	}

	
	public boolean modelChanged(){
		return false;
	}
}
