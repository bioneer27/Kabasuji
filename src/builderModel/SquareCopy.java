/*
 * 
 */
package builderModel;

/**
 * @author xavier
 *
 */
public class SquareCopy {
	
	/** The height. */
	int x, y, width, height;
	
	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public SquareCopy(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX(){
		return this.x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY(){
		return this.y;
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth(){
		return this.width;
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight(){
		return this.height;
	}
	/**
	 * Rotate around origin
	 * 
	 */
	public void rotateAroundOrigin(){
		int x = this.x;
		int y = this.y;
		this.x = -y;
		this.y = x;
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @param i
	 */
	public void rotateHelper(int i){
		this.x += i;
		this.y += i;
	}
	
	/**
	 * 
	 */
	public void flipXHelper(){
		this.x = -this.x;
	}
	
	/**
	 * 
	 */
	public void flipYHelper(){
		this.y = -this.y;
	}

}