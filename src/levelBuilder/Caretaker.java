/*
 * 
 */
package levelBuilder;
import java.util.*;

/**
 * This class returns the list of states in an ArrayList. 
 * Adding states is done in this class
 * Call caretaker.addMemento(originator.saveToMenmento() );
 * 
 * @author Anne
 *
 */
public class Caretaker {
	
	/** The saved states. */
	private ArrayList<Memento> savedStates = new ArrayList<Memento>();
	
	/**
	 * Adds the memento.
	 *
	 * @param m
	 *            the m
	 */
	public void addMemento(Memento m) {
		savedStates.add(m);
	}
	
	/**
	 * Gets the memento.
	 *
	 * @param index
	 *            the index
	 * @return the memento
	 */
	public Memento getMemento(int index){
		return savedStates.get(index);
	}
	
}
