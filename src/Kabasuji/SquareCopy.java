package Kabasuji;

/**
 * @author xavier
 *
 */
public class SquareCopy {
	
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
	 * Rotate around origin
	 * 
	 */
	public void rotateAroundOrigin(){
		int x = this.x;
		int y = this.y;
		this.x = -y;
		this.y = x;
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void rotateHelper(int i){
		this.x += i;
		this.y += i;
	}

}
