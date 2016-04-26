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
	Square squares[][] = new Square[SIZE][SIZE];
	ArrayList<Piece> pieces;
	ArrayList<Piece> hintPiece;
	PieceType type;


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
				squares[i][j] = new Square(i,j,type,true,false);
				if((i + j) % 2 == 0)
					squares[i][j].color = Color.black;
				else
					squares[i][j].color = Color.gray;
			}
		}
		createSquares();
	}


	/**
	 * 
	 */
	public void resetBoard(){
		for(int i =0; i < squares.length; i++)
			for(int j=0; j< squares[i].length; j++){
				squares[i][j].taken = false;
			}
	}

	/**
	 * @return
	 */
	public int countEmptySquares(){
		int count = 0;
		for(int i =0; i < squares.length; i++)
			for(int j=0; j< squares[i].length; j++){
				if(squares[i][j].visible == true && squares[i][j].taken == false)
					count++;
			}
		return count;
	}

	private void createSquares(){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 12; i++){
				for (j = 0; j < 12; j++){
					if (squares[i][j].visible){
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
		int w = (int) dim.getWidth();
		int h = (int) dim.getHeight();
		int cnt = 0;
		g2.setStroke(new BasicStroke(8.0f));

		for (SquareCopy s: squareList){
			if(cnt % 2 == 0)
				 g2.setColor(Color.black);
			else
				 g2.setColor(Color.gray);
			
			if(cnt % 11 == 0)
				cnt+=2;
			else
				cnt+=1;
			cnt++;
			g.fillRect(s.x + 300, s.y + 100, s.width, s.height);
		}



	}
}
