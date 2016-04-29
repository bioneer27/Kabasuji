/*
 * 
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Controller.BullpenController;
import Kabasuji.PieceView;
import Kabasuji.WindowClass;
import model.Bullpen;
import model.Piece;
import java.awt.Dimension;

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
	/*
	 * jpanel inside jscrollpane
	 * 
	 * 
	 */
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pieces. */
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	
	/** The group layout. */
	GroupLayout groupLayout;
	
	/** The panel scroll container. */
	JPanel panelScrollContainer;
	
	/** The piece view. */
	PieceView pieceView[];
	
	/** The bp. */
	Bullpen bp;
	
	
	/**
	 * Instantiates a new bullpen view.
	 */
	BullpenView(){
		super();
		this.getVerticalScrollBar().setUnitIncrement(35);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		setSize (new Dimension(140, 400));
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawString("HERE", 10, 10);
	}
	
	/**
	 * Prepare player.
	 *
	 * @param bp
	 *            the bp
	 */
	public void preparePlayer(Bullpen bp){
		this.bp = bp;
		pieces.addAll(bp.getPieces());
		pieceView = new PieceView[pieces.size()];
		for(int i=0; i < pieceView.length; i++){
			pieceView[i] = new PieceView(pieces.get(i));
		}
	setLayout();
	}
	
	/**
	 * Initialize controller.
	 */
	public void initializeController(){
		for(int i = 0 ; i < pieceView.length; i++){
			pieceView[i].addActionListener(new BullpenController(bp));
		}
	}
	

	/**
	 * Sets the layout.
	 */
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
