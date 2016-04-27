package Kabasuji;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xavier
 *
 */
public class Board extends Canvas implements MouseListener, MouseMotionListener{

	public static final int SIZE = 12;

	List<SquareCopy> squareList;
	private Square squares[][] = new Square[SIZE][SIZE];
	ArrayList<Piece> pieces;
	ArrayList<Piece> hintPiece;
	PieceType type;
	int boardX = 300;
	int boardY = 100;


	public Dimension getPreferredSize() { 
		return new Dimension (300, 300);
	}
	
	/**
	 * @param type
	 */
	public Board(PieceType type){
		this.pieces = new ArrayList<Piece>();
		this.hintPiece = new ArrayList<Piece>();
		this.type = type;
		squareList = new ArrayList<SquareCopy>();

		for(int i=0; i<12; i++){
			for(int j= 0; j<12; j++){
				getSquares()[i][j] = new Square(i,j,type,true,false);
				if((i + j) % 2 == 0)
					getSquares()[i][j].color = Color.black;
				else
					getSquares()[i][j].color = Color.gray;
			}
		}
//		createSquares();
	}


	/**
	 * 
	 */
	public void resetBoard(){
		for(int i =0; i < getSquares().length; i++)
			for(int j=0; j< getSquares()[i].length; j++){
				getSquares()[i][j].taken = false;
			}
	}

	/**
	 * @return
	 */
	public int countEmptySquares(){
		int count = 0;
		for(int i =0; i < getSquares().length; i++)
			for(int j=0; j< getSquares()[i].length; j++){
				if(getSquares()[i][j].visible == true && getSquares()[i][j].taken == false)
					count++;
			}
		return count;
	}

	public void createSquares(){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 12; i++){
				for (j = 0; j < 12; j++){
					if (getSquares()[i][j].visible){
						squareList.add(new SquareCopy(i*length, j*length, length, length));
					}
				}
			}
		  
	  }
	
	/**
	 * @param newBox
	 * @return
	 */
	public boolean isValid(Box newBox){
		return false;
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void updateLocation(MouseEvent e) {	  

		repaint();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void paint(Graphics g) {

		update(g);
	}

	/* (non-Javadoc)
	 * @see java.awt.Canvas#update(java.awt.Graphics)
	 */
	public void update(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Dimension dim = getSize();
//		int w = (int) dim.getWidth();
//		int h = (int) dim.getHeight();
//		int cnt = 0;
		g2.setStroke(new BasicStroke(8.0f));

		for (SquareCopy s: squareList){
			if((s.x/32 + s.y/32) % 2 == 0)
				g2.setColor(Color.darkGray);
			else
				g2.setColor(Color.lightGray);
			
			
			//System.out.println("" + squareList.size());
			g.fillRect(s.x + boardX, s.y + boardY, s.width, s.height);
		}



	}

	public Square[][] getSquares() {
		return squares;
	}

	public void setSquares(Square squares[][]) {
		this.squares = squares;
	}
}
