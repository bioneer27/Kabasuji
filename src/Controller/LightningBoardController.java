package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import model.Board;
import model.Piece;
import model.SelectedPiece;
import view.BoardView;

public class LightningBoardController implements MouseListener, MouseMotionListener{	
	
	Board board;
	BoardView boardView;
	PieceFactory pf = new PieceFactory();
	SelectedPiece sp = new SelectedPiece();
	
	Piece selectedPiece; 
	
	public LightningBoardController(Board board, BoardView boardView){
		this.board = board;
		this.boardView = boardView;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		int x = arg0.getX();
		int y = arg0.getY();
		
		boardView.setY(y);
		boardView.setX(x);
		boardView.redraw();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = e.getX();
		int col = e.getY();
		
		row = row/32;
		col = col/32;
		Piece draggingPiece = boardView.getDraggingPiece();
		System.out.println("1. Dragging ID  " + draggingPiece.getId());
		
		if(draggingPiece != null){
			board.putPieceOnBoard(draggingPiece, row , col);
			boardView.setDraggingPiece(pf.makePiece(100));
			board.getBp().setSelectedPiece(100);
			board.setSelectedPiece(pf.makePiece(100));
			System.out.println("3. Dragging ID  " + draggingPiece.getId());
		}
		boardView.redraw();	
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		selectedPiece = board.getBp().getSelectedPiece();
		selectedPiece.setC(selectedPiece.getBackupColor());
		boardView.setDraggingPiece(selectedPiece);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		boardView.setDraggingPiece(pf.makePiece(100));
		boardView.redraw();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//Piece source = (Piece) arg0.getSource();
		int row = arg0.getX();
		int col = arg0.getY();
		
		row = row/32;
		col = col/32;
		
	}
}
