package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Controller.BullpenController;
import Kabasuji.Piece;
import Kabasuji.PieceView;
import Kabasuji.WindowClass;
import model.Bullpen;

/**
 * Shows all Kabasuji pieces in single panel, meant to be scrolled over.
 * 
 * Each piece is shows in its normal orientation, assuming squareSize pixels for square length
 * 
 * Drawn so center is in middle of unit square
 */
/**
 * @author Himanjal
 *
 */
public class BullpenView extends JScrollPane  {
	
	private static final long serialVersionUID = 1L;
	
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	GroupLayout groupLayout;
	JPanel panelScrollContainer;
	PieceView pieceView[];
	Bullpen bp;
	
	
	BullpenView(){
		this.getVerticalScrollBar().setUnitIncrement(35);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		setSize (getPreferredSize());
	}
	
	@Override
	public void paintComponent (Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawString("HERE", 10, 10);
	}
	
	public void preparePlayer(Bullpen bp){
		this.bp = bp;
		pieces.addAll(bp.getPieces());
		pieceView = new PieceView[pieces.size()];
		for(int i=0; i < pieceView.length; i++){
			pieceView[i] = new PieceView(pieces.get(i));
		}
	setLayout();
	}
	
	public void initializeController(){
		for(int i = 0 ; i < pieceView.length; i++){
			pieceView[i].addActionListener(new BullpenController(bp));
		}
	}
	

	public void setLayout(){
		
		this.panelScrollContainer = new JPanel();
		this.panelScrollContainer.setBackground(Color.WHITE);
		this.setViewportView(panelScrollContainer);
		groupLayout = new GroupLayout(panelScrollContainer);
		GroupLayout.ParallelGroup hGroup = groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING);
		GroupLayout.ParallelGroup vGroup = groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING);

		GroupLayout.SequentialGroup sGroup = groupLayout.createSequentialGroup();
		GroupLayout.SequentialGroup s2Group = groupLayout.createSequentialGroup();
		GroupLayout.ParallelGroup pGroup = groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false);

		WindowClass wc = new WindowClass(getWidth(), getHeight());
		
		for(int i=0; i<pieceView.length; i++){
			pGroup.addComponent(wc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
			s2Group.addComponent(wc, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE);
		}

		groupLayout.setHorizontalGroup(hGroup.addGroup(sGroup.addGroup(pGroup)));
		groupLayout.setVerticalGroup(vGroup.addGroup(s2Group));
		panelScrollContainer.setLayout(groupLayout);	
	}
	
}
