/*
 * 
 */
package levelBuilder;


/**
 * This class holds the states that are changed in Level Builder. 
 * The states can be undone / redone using undo / redo buttons
 * 
 * @author Anne
 */

public class Memento {
	
	/** The piece id. */
	int pieceID;
	
	/** The x. */
	int x;
	
	/** The y. */
	int y;
	
	/** The state. */
	int[] state = {pieceID, x, y};
	
	/**
	 * Instantiates a new memento.
	 *
	 * @param pieceID
	 *            the piece id
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public Memento(int pieceID, int x, int y){
		 this.pieceID = pieceID;
		 this.x = x;
		 this.y = y;
		}
	
	/**
	 * Gets the saved state.
	 *
	 * @return the saved state
	 */
	public int[] getSavedState(){
		return state;
	}
	
	
}
