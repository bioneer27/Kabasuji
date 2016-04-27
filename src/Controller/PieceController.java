package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingUtilities;

import model.Piece;
import view.PieceView;

/**
 * @author xavier
 *
 */
public class PieceController implements MouseMotionListener, MouseListener{
	PieceView pv;
	Piece p;
	int tempCenterX, tempCenterY;
	int offset = 96;
	
	public PieceController(PieceView pv, Piece p){
		//addMouseListener(this);
		this.pv = pv;
		this.p = p;
		this.tempCenterX = p.getCenterX();
		this.tempCenterY = p.getCenterY();
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
if(SwingUtilities.isLeftMouseButton(e)){
			
		    if (p.containsPoint(e.getX(), e.getY())){
		 
		    	tempCenterX = e.getX() - offset;
				tempCenterY = e.getY() - offset;
				p.setCenterX(tempCenterX);
				p.setCenterY(tempCenterY);
		    	pv.updateLocation(e);
		    }
			
		}
		
		if( SwingUtilities.isRightMouseButton(e)){
			if (p.containsPoint(e.getX(), e.getY())){
				p.rotatePiece();
				pv.updateLocation(e);
			}
		}
				
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		   if (p.containsPoint(e.getX(), e.getY())){
//			   
		    	pv.updateLocation(e);
		    }
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void mouseDragged(MouseEvent e) {
		
		  if (p.containsPoint(e.getX(), e.getY())){
//			   
			    tempCenterX = e.getX() - offset;
				tempCenterY = e.getY() - offset;
				p.setCenterX(tempCenterX);
				p.setCenterY(tempCenterY);
		    	pv.updateLocation(e);
		    }
		// TODO Auto-generated method stub
		
	}









	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
