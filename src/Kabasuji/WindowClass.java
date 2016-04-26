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
import javax.swing.SwingUtilities;

/**
 * @author xavier
 *
 */
public class WindowClass extends Canvas implements MouseListener, MouseMotionListener {
	  Rectangle rect = new Rectangle(-16, -16, 32, 32);

	  boolean[][] squares;
	  Rectangle rect1 = new Rectangle(0, 0, 100, 1000);
	  int width;
	  int height;
	  
	  int centerX;
	  int centerY;	  
	  List<SquareCopy> squareList;
	  Graphics2D g2;
	  int preX = 0;
	  int preY = 0;
	  boolean isFirstTime = true;
	  Rectangle area;
	  boolean pressOut = false;
      int offset = 96;


	  /**
	   * @wbp.parser.entryPoint
	 * 
	 */
	public WindowClass() {
	    setBackground(Color.white);
	    addMouseMotionListener(this);
	    addMouseListener(this);
	    centerX = 0;
	    centerY = 0;
	    squareList = new ArrayList<SquareCopy>();	    
	    squares = new boolean[6][6];
		squares[3][3] = true;
		squares[3][2] = true;
		squares[3][4] = true;
		squares[2][3] = true;
		squares[2][4] = true;
		squares[2][5] = true;
		width = getWidth();
		height = getHeight();
		
		createSquares();
	  }
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public WindowClass(int width, int height) {
	    setBackground(Color.white);
	    addMouseMotionListener(this);
	    addMouseListener(this);
	    centerX = 0;
	    centerY = 0;
	    squareList = new ArrayList<SquareCopy>();	    
	    squares = new boolean[6][6];
		squares[3][3] = true;
		squares[3][2] = true;
		squares[3][4] = true;
		squares[2][3] = true;
		squares[2][4] = true;
		squares[2][5] = true;
		this.width = width;
		this.height = height;
		
		createSquares();
	  }
	  /** (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	   * @wbp.parser.entryPoint
	 */
	@Override
	  public void mousePressed(MouseEvent e) {
		
		if(SwingUtilities.isLeftMouseButton(e)){
			
		    if (containsPoint(e.getX(), e.getY())){
//			    preX = e.getX() - centerX;
//			    preX = e.getY() - centerY;
//			    centerX = e.getX() - 96;
//			    centerY = e.getY() - 96;
//		    	updateLocation(e);
		    	centerX = e.getX() - offset;
				centerY = e.getY() - offset;
		    	updateLocation(e);
		    }
			
		}
		
		if( SwingUtilities.isRightMouseButton(e)){
			if (containsPoint(e.getX(), e.getY())){
				rotatePiece();
				updateLocation(e);
			}
		}
		

	    
	  }
	  /** (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	@Override
	  public void mouseDragged(MouseEvent e) {

	    
	    if (containsPoint(e.getX(), e.getY())){
//		    preX = e.getX() - centerX;
//		    preX = e.getY() - centerY;
		    centerX = e.getX() - 96;
		    centerY = e.getY() - 96;
	    	updateLocation(e);
	    }

	    
	  }
	  /**
	   * @wbp.parser.entryPoint
	   */
	  @Override
	  public void mouseReleased(MouseEvent e) {

		    if (containsPoint(e.getX(), e.getY())){
//			    preX = e.getX() - centerX;
//			    preX = e.getY() - centerY;
//			    centerX = e.getX() - 96;
//			    centerY = e.getY() - 96;
		    	updateLocation(e);
		    }
	    
	  }

	  /* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved(MouseEvent e) {
	  }

	  /**
	   * @wbp.parser.entryPoint
	   */
	  public void mouseClicked(MouseEvent e) {
	  }

	  public void mouseExited(MouseEvent e) {
	  }

	  public void mouseEntered(MouseEvent e) {
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
			g.fillRect(s.x + centerX, s.y + centerY, s.width, s.height);
						
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
	  /**
	 * 
	 */
	private void createSquares(){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (squares[i][j]){
						squareList.add(new SquareCopy(i*length +centerX, j*length + centerY, length, length));

					}
				}
			}
		  
	  }
	  
	  /**
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean containsPoint(double x, double y) {
		  System.out.print(x);
		  System.out.print(" ");
		  System.out.println(y);
		  System.out.println(centerX);
		  System.out.println(centerY);

		  
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
//	        	centerX = (int) (x-x0);
//	        	centerY = (int) (y- y0);
	  
	        	return true;
	        }
		  }
		  return false;
	    }
	  
	  /**
	 * 
	 */
	private void rotatePiece(){
		
		

		for (SquareCopy s: squareList){
			s.rotateAroundOrigin();							
		}
		
	}
	  
	}