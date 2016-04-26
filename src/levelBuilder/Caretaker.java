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
	private ArrayList<Memento> savedStates = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		savedStates.add(m);
	}
	
	public Memento getMemento(int index){
		return savedStates.get(index);
	}
	
}
