package levelBuilder;


/**
 * This class holds the states that are changed in Level Builder. 
 * The states can be undone / redone using undo / redo buttons
 * 
 * @author Anne
 */

public class Memento {
	int pieceID;
	int x;
	int y;
	
	int[] state = {pieceID, x, y};
	
	public Memento(int pieceID, int x, int y){
		 this.pieceID = pieceID;
		 this.x = x;
		 this.y = y;
		}
	
	public int[] getSavedState(){
		return state;
	}
	
	
}
