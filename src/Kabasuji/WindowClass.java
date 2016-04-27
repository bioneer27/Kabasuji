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
 * This class is used as a pseudo piece class to make sure the behavior is correct
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
	  Graphics2D graph1;
	  Graphics2D graph2;
	  int curGraph = 1;
	  int preX = 0;
	  int preY = 0;
	  boolean isFirstTime = true;
	  Rectangle area;
	  boolean pressOut = false;
      int offset = 96;
      int pixelLength = 32;


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
		squares[3][1] = true;
		squares[3][2] = true;
		squares[3][3] = true;
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
	    squares[3][2] = true;
		squares[3][3] = true;
		squares[3][4] = true;
		squares[2][2] = true;
		squares[2][3] = true;
		squares[2][4] = true;
		this.width = width;
		this.height = height;
		
		createSquares();
	  }
	  /** (non-Javadoc)
	   * When the mouse is pressed, checks whether the piece contains the point at which 
	   * the mouse pressed and update location if true
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	   * @wbp.parser.entryPoint
	 */
	@Override
	  public void mousePressed(MouseEvent e) {
		
		if(SwingUtilities.isLeftMouseButton(e)){
			
		    if (containsPoint(e.getX(), e.getY())){
		    	preX = centerX;
		    	preY = centerY;
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
	   * If the mouse is being dragged, check the containsPoint() and update the location of the piece
	   * if it returns true
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	@Override
	  public void mouseDragged(MouseEvent e) {

	    
	    if (containsPoint(e.getX(), e.getY())){
//		    preX = e.getX() - centerX;
//		    preX = e.getY() - centerY;
	    	preX = centerX;
	    	preY = centerY;
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
	    


//	    if (isFirstTime) {
//	      area = new Rectangle(dim);
//	      rect.setLocation(w / 2 - 50, h / 2 - 25);
//	      isFirstTime = false;
//	    }

	    // Clears the rectangle that was previously drawn.
	    g2.setPaint(new Color(255, 250, 205));
	    

			g.fillRect(0, 0, w, h);
						
		

	    g2.setColor(Color.red);
	    g2.setColor(Color.black);
		
		for (SquareCopy s: squareList){
			g.fillRect((pixelLength * s.x) + centerX, (pixelLength * s.y) + centerY, s.width, s.height);
						
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
	 * Runs through the arrayList to draw all the squares
	 */
	private void createSquares(){
		  int length = 32;
			
			int i, j;			
			
			for (i = 0; i < 6; i++){
				for (j = 0; j < 6; j++){
					if (squares[i][j]){
						squareList.add(new SquareCopy(i, j, length, length));
					}
				}
			}
		  
	  }
	  
	  /**
	   * Determines whether a point is within the piece
	 * @param x the value returned by e.getX()
	 * @param y the value returned by e.getY()
	 * @return a boolean whether or not the point is within the piece
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

			
	        x0 = (pixelLength * s.x) + centerX;
	        y0 = (pixelLength * s.y) + centerY;
			        
	        if (x >= (x0 - 10) &&
	                y >= (y0 - 10) &&
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
	 * method to rotate the piece, calls the rotate() helper function in SquareCopy
	 */
	private void rotatePiece(){
		
		for (SquareCopy s: squareList){
			s.rotateHelper(-3);							
		}

		for (SquareCopy s: squareList){
			s.rotateAroundOrigin();							
		}
		for (SquareCopy s: squareList){
			s.rotateHelper(3);							
		}
		
	}
	  
	}