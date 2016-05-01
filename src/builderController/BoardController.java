package builderController;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import builderModel.PieceFactory;
import builderModel.Board;
import builderModel.Piece;
import builderModel.SelectedPiece;
import builderView.BoardView;

public class BoardController implements MouseListener, MouseMotionListener{
	//the selected piece
	
	
	
	Board board;
	BoardView boardView;
	PieceFactory pf = new PieceFactory();
	SelectedPiece sp = new SelectedPiece();
	
	Piece selectedPiece; 
	
	public BoardController(Board board, BoardView boardView){
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
		//System.out.println(e.getX() + ", " + e.getY());
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
		//selectedPiece = (Piece)e.getSource();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//Piece source = (Piece) arg0.getSource();
		int row = arg0.getX();
		int col = arg0.getY();
		
		row = row/32;
		col = col/32;
		Piece draggingPiece = boardView.getDraggingPiece();
		if(!(draggingPiece == null)){
			board.putPieceOnBoard(boardView.getDraggingPiece(), row , col);
			
		}
		boardView.setDraggingPiece(pf.makePiece(100));
		board.getBp().setSelectedPiece(100);
		boardView.redraw();
		//board.putPieceOnBoard(source, arg0.getX(),arg0.getY());
		
		// TODO Auto-generated method stub
		
	}
}
