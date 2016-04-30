package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Kabasuji.PieceFactory;
import model.Board;
import model.Piece;
import view.BoardView;

public class BoardController implements MouseListener, MouseMotionListener{
	//the selected piece
	
	
	
	Board board;
	BoardView boardView;
	PieceFactory pf = new PieceFactory();
	Piece selectedPiece = pf.makePiece(1);
	
	public BoardController(Board board, BoardView boardView){
		this.board = board;
		this.boardView = boardView;
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
//		int x = arg0.getX();
//		int y = arg0.getY();
//		
//		
//		
//		boardView.setSelectedPiece(selectedPiece);
//		System.out.println(x + "  here   " + y);
//		boardView.setY(y);
//		boardView.setX(x);
//		boardView.redraw();
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println(e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		int x = e.getX();
//		int y = e.getY();
//		System.out.println(x + "  here   " + y);
//		boardView.setY(y);
//		boardView.setX(x);
//		boardView.redraw();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//selectedPiece = (Piece)e.getSource();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//Piece source = (Piece) arg0.getSource();
		int row = arg0.getX();
		int col = arg0.getY();
		
		row = row/32;
		col = col/32;
		
		board.putPieceOnBoard(selectedPiece, col , row);
		System.out.println(row + "     " +col);
		boardView.redraw();
		//board.putPieceOnBoard(source, arg0.getX(),arg0.getY());
		
		// TODO Auto-generated method stub
		
	}
}
