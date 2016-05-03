package builderController;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import builderModel.Rset;
import builderView.RsetView;

public class RsetController implements MouseListener{
	
	RsetView rView;
	Rset rSet;
	
	Color draggingColor = Color.BLACK;
	int draggingNumber =0;
	boolean flag = false;
	
	public RsetController(RsetView rsetView){
		this.rView = rsetView;
		this.rSet = rsetView.getRset();
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		int row = arg0.getY()/32;
		int col = arg0.getX()/32;
		
		switch(row){
		case 0: draggingColor = Color.RED;
		case 1: draggingColor = Color.BLUE;
		case 2: draggingColor = Color.GREEN;
		}
		
		draggingNumber = col;
		
		System.out.print(draggingNumber);
		System.out.println((draggingColor.toString()));
		flag = true;
		
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

}
