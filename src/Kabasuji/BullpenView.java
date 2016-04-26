package Kabasuji;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * Shows all Kabasuji pieces in single panel, meant to be scrolled over.
 * 
 * Each piece is shows in its normal orientation, assuming squareSize pixels for square length
 * 
 * Drawn so center is in middle of unit square
 */
/**
 * @author xavier & Himanjal
 *
 */
public class BullpenView extends JPanel {
	ArrayList<Box> value = new ArrayList<Box>();
	
	Bullpen bullpen;
	
	public BullpenView(Bullpen bullpen){
		super();
		this.bullpen = bullpen;
		
		setSize (getPreferredSize());
	}
	
	@Override
	public void paintComponent (Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawString("HERE", 10, 10);
	}

	public Dimension getPreferredSize () {
		return new Dimension (100, 400);
	}
	
}
