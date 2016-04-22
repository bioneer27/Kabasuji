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

import javax.swing.JComponent;
import javax.swing.JFrame;

public class WindowClass extends Canvas implements MouseListener, MouseMotionListener {
	  Rectangle rect = new Rectangle(0, 0, 32, 32);

	  boolean[][] squares;
	  Rectangle rect1 = new Rectangle(0, 0, 100, 1000);
	  
	  int centerX;
	  int centerY;
	  
	  List<SquareCopy> squareList;


	  Graphics2D g2;

	  int preX, preY;

	  boolean isFirstTime = true;

	  Rectangle area;

	  boolean pressOut = false;

	  public WindowClass() {
	    setBackground(Color.white);
	    addMouseMotionListener(this);
	    addMouseListener(this);
	    centerX = 100;
	    centerY = 0;
	    squareList = new ArrayList<SquareCopy>();	    
	    squares = new boolean[6][6];
		squares[3][3] = true;
		squares[3][2] = true;
		squares[3][4] = true;
		squares[2][3] = true;
		squares[2][4] = true;
		squares[2][5] = true;
		
		createSquares();
	  }
	  @Override
	  public void mousePressed(MouseEvent e) {
	    preX = centerX - e.getX();
	    preY = centerY - e.getY();
	    
	    

	    if (contains(e.getX(), e.getY()))
	      updateLocation(e);
	    
	  }
	  @Override
	  public void mouseDragged(MouseEvent e) {
		  
	    if (contains(e.getX(), e.getY()))	    updateLocation(e);

	    
	  }
	  @Override
	  public void mouseReleased(MouseEvent e) {
	    if (contains(e.getX(), e.getY()))
	      updateLocation(e);
	    
	  }

	  public void mouseMoved(MouseEvent e) {
	  }

	  public void mouseClicked(MouseEvent e) {
	  }

	  public void mouseExited(MouseEvent e) {
	  }

	  public void mouseEntered(MouseEvent e) {
	  }

	  public void updateLocation(MouseEvent e) {
	    centerX = preX + e.getX();
	    centerY = preY + e.getY();	    

	    repaint();
	  }
	  
	  public void paint(Graphics g) {
		
	    update(g);
	  }

	  public void update(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
	    Dimension dim = getSize();
	    int w = (int) dim.getWidth();
	    int h = (int) dim.getHeight();
	    g2.setStroke(new BasicStroke(8.0f));
	    


	    if (isFirstTime) {
	      area = new Rectangle(dim);
	      rect.setLocation(w / 2 - 50, h / 2 - 25);
	      isFirstTime = false;
	    }

	    // Clears the rectangle that was previously drawn.
	    g2.setPaint(Color.white);
	    g2.fillRect(0, 0, w, h);

	    g2.setColor(Color.red);
	    g2.draw(rect);
	    g2.setColor(Color.black);
	    g2.fill(rect);
	    
		

		
		
		
		for (SquareCopy s: squareList){
			g.fillRect(s.x +centerX, s.y + centerY, s.width, s.height);
						
		}

		

	  }

//	  boolean checkRect() {
//	    if (area == null) {
//	      return false;
//	    }
//	    System.out.println("Look where I am");
//	    if (area.contains(rect.x, rect.y, 100, 50)) {
//	      return true;
//	    }
//	    int new_x = rect.x;
//	    int new_y = rect.y;
//
//	    if ((rect.x + 100) > area.getWidth()) {
//	      new_x = (int) area.getWidth() - 99;
//	    }
//	    if (rect.x < 0) {
//	      new_x = -1;
//	    }
//	    if ((rect.y + 50) > area.getHeight()) {
//	      new_y = (int) area.getHeight() - 49;
//	    }
//	    if (rect.y < 0) {
//	      new_y = -1;
//	    }
//	    rect.setLocation(new_x, new_y);
//	    return false;
//	  }
//	  
	  private void createSquares(){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (squares[i][j]){
						squareList.add(new SquareCopy(i*length + centerX, j*length + centerY, length, length));
						System.out.print(i);
						System.out.print(" ");
						System.out.println(j);
					}
				}
			}
		  
	  }
	  
	  private boolean contains(double x, double y) {
		  System.out.println("Life man");
		  double x0;
		  double y0;
		  
		  for (SquareCopy s: squareList){							
			
	        x0 = s.x;
	        y0 = s.y;
	        
	        if (x >= x0 &&
	                y >= y0 &&
	                x < x0 + s.width &&
	                y < y0 + s.height){
	        	return true;
	        }
		  }
		  return false;
	    }
	  
	  private void rotatePiece(Graphics g){
		  Graphics2D g2 = (Graphics2D) g;
		  Dimension dim = getSize();
		  
	  }
	}