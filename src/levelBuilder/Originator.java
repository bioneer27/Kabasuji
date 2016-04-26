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
	private int pieceID;
	private int x;
	private int y;
	private int[] state = {pieceID, x, y};
	
	public void set(int pieceID, int x, int y){
		this.pieceID = pieceID;
		this.x = x;
		this.y = y;
	}
	
	public Memento saveToMemento(){
		System.out.println("Originator: Saving to Memento.");
		return new Memento(pieceID, x, y);
	}
	
	public void restorefromMemento(Memento m){
		this.state = m.getSavedState();
		System.out.println("Originator: State after restoring from Memento: "+state);
	}
}
