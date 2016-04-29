/*
 * 
 */
package levelBuilder;

/**
 * This class knows how to save each state.
 * Used in undo & redo in level builder
 *  Add new state: originator.set(pieceID, x, y);
 *  Undo: originator.restoreFromMemento(caretaker.getMemento(states.length()-index));
 *  	index will be incremented each time undo is called,  starts at index=1;
 * 	Redo: originator.restoreFromMemento(caretaker.getMemento(states.length()));
 *
 * @author Anne
 */

public class Originator {
	
	/** The piece id. */
	private int pieceID;
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The state. */
	private int[] state = {pieceID, x, y};
	
	/**
	 * Sets the.
	 *
	 * @param pieceID
	 *            the piece id
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public void set(int pieceID, int x, int y){
		this.pieceID = pieceID;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Save to memento.
	 *
	 * @return the memento
	 */
	public Memento saveToMemento(){
		System.out.println("Originator: Saving to Memento.");
		return new Memento(pieceID, x, y);
	}
	
	/**
	 * Restorefrom memento.
	 *
	 * @param m
	 *            the m
	 */
	public void restorefromMemento(Memento m){
		this.state = m.getSavedState();
		System.out.println("Originator: State after restoring from Memento: "+state);
	}
}
