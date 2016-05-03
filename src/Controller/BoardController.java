package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import builderModel.Square;
import model.Board;
import model.Piece;
import model.SelectedPiece;
import view.BoardView;

public class BoardController implements MouseListener, MouseMotionListener{	
	
	Board board;
	BoardView boardView;
	PieceFactory pf = new PieceFactory();
	SelectedPiece sp = new SelectedPiece();
	Square draggingSquare;
	
	
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
		
		processMouse(e.getButton(), e.getX(), e.getY());
		
	}
	
	public void processMouse(int button, int x, int y){
		int row = x;
		int col = y;
		
		row = row/32;
		col = col/32;
		Piece draggingPiece = boardView.getDraggingPiece();
	
		if((draggingPiece.getId() == 100) && (board.getPt() == PieceType.PUZZLE)){
			if(board.getBoard()[row][col].isTaken()){
				board.removePiece(row,col);
				board.getBpc().draggingPiece = board.getSelectedPiece();
				boardView.setDraggingPiece(board.getSelectedPiece());
			}
		}
		else{
			if((draggingPiece != null) && (draggingPiece.getId() != 100)){
				if(board.putPieceOnBoard(draggingPiece, row , col)){
					if(draggingPiece != board.getSelectedPiece()){
						board.getBp().removePiece(board.getBp().getSelectedPiece().getId());
						if(board.getLvlView().getLevel().getType() == PieceType.LIGHTNING)
							board.getBp().addRandomPiece(1);
						board.getBpc().bullpenView.refresh();
						board.getBpc().draggingPiece = pf.makePiece(100);
					}
					boardView.setDraggingPiece(pf.makePiece(100));
					board.getBp().setSelectedPiece(100);
					board.setSelectedPiece(pf.makePiece(100));
					board.getBpc().bullpenView.refresh();
				}
			}
			boardView.redraw();
		}
		
		if(board.getLvlView().getLevel().getType() == PieceType.PUZZLE){
			board.getLvlView().getCounterView().setText("" + (board.getLvlView().getCounter() - board.getMoves()));
//			board.getLvlView().setCurCount(board.getMoves());
		}
		
		if(board.getLvlView().getLevel().getType() == PieceType.RELEASE){
			board.getLvlView().getTextField().setText(board.getRedGot());
			board.getLvlView().getTextField_1().setText(board.getBlueGot());
			board.getLvlView().getTextField_2().setText(board.getGreenGot());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(board.getBp().getCounter() > board.getCounter()){
			board.getBp().setCounter(0);
			board.setMoves(board.getMoves()+ 1);
		}
		
		if((board.getSelectedPiece().getId() == 100) || (board.getPt() == PieceType.LIGHTNING) || (board.getBp().getCounter() == board.getCounter())){
			selectedPiece = board.getBp().getSelectedPiece();
			selectedPiece.setC(selectedPiece.getBackupColor());
			boardView.setDraggingPiece(selectedPiece);
		}
		else boardView.setDraggingPiece(board.getSelectedPiece());
		
		if(board.getLvlView().getLevel().getType() == PieceType.PUZZLE){
			board.getLvlView().getCounterView().setText("" + (board.getLvlView().getCounter() - board.getMoves()));
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
