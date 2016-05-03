package builderController;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import builderModel.PieceFactory;
import builderModel.PieceType;
import builderModel.Board;
import builderModel.BuilderRSet;
import builderModel.Piece;
import builderView.BoardView;

public class BoardController implements MouseListener, MouseMotionListener{	
	
	Board board;
	BoardView boardView;
	PieceFactory pf = new PieceFactory();
	RsetController rsetController;
	
	Piece selectedPiece; 
	
	public BoardController(Board board, BoardView boardView, RsetController rsetController){
		this.board = board;
		this.boardView = boardView;
		this.rsetController = rsetController;
		
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
		
		if((board.getPt() == PieceType.RELEASE) && this.rsetController.flag){
			this.rsetController.flag = false;
			board.getBoard()[row][col].setRS(new BuilderRSet(rsetController.draggingColor, rsetController.draggingNumber, true, false));
			if(board.getBoard()[row][col].getRS() == null){
				board.getBoard()[row][col].setRS(new BuilderRSet(rsetController.draggingColor, rsetController.draggingNumber, true, true));
			}
			
			boardView.redraw();
		}
		else{
			if((draggingPiece.getId() == 100) && (board.getPt() == PieceType.PUZZLE)){
				if(board.getBoard()[row][col].isTaken()){
					board.removePiece(row,col);
					boardView.setDraggingPiece(board.getSelectedPiece());
				}
			}
			else{
				if((draggingPiece != null) && (draggingPiece.getId() != 100)){
					if(board.putPieceOnBoard(draggingPiece, row , col)){
						if(draggingPiece != board.getSelectedPiece()){
							board.getBp().removePiece(board.getBp().getSelectedPiece().getId());
							board.getBpc().bullpenView.refresh();
							board.getBpc().draggingPiece = pf.makePiece(100);
						}
						board.getBp().removePiece(board.getBp().getSelectedPiece().getId());
						boardView.setDraggingPiece(pf.makePiece(100));
						board.getBp().setSelectedPiece(100);
						board.setSelectedPiece(pf.makePiece(100));
					}
				}
				boardView.redraw();
			}
		}
		
		
		
		if(e.getButton() ==3){
			board.getBoard()[row][col].setHint(true);
			boardView.redraw();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if((board.getSelectedPiece().getId() == 100) || (board.getPt() == PieceType.LIGHTNING)){
			selectedPiece = board.getBp().getSelectedPiece();
			selectedPiece.setC(selectedPiece.getBackupColor());
			boardView.setDraggingPiece(selectedPiece);
		}
		else {
			boardView.setDraggingPiece(board.getSelectedPiece());
		}
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		if(boardView.getDraggingPiece().getId() == 100){
			board.getBpc().draggingPiece = pf.makePiece(100);
		}
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



