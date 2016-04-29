/*
 * 
 */
package levelBuilder;

/**
 * Class that defines the interface for processing Undo events.
 *
 * Creation date: 4/27/2016
 * @author George T. Heineman (heineman@cs.wpi.edu) 
 * @editor Anne
 */
public class UndoAdapter { 
	
	/**
	 * UndoAdapter constructor comment.
	 */
	public UndoAdapter() {
		super();
	}
	
	/**
	 * Empty method that will be overridden by subclasses with real functionality
	 *
	 * If a move can't be undone, then false must be returned; otherwise true signals success.
	 * 
	 * Creation date: 4/27/2016
	 */
	public boolean undoRequested() { 
		return false; 
	}
}


// UndoAdapter (undoRequested() ), 
// LevelBuilderUndoAdapter (undoRequested() ),
// Move (undo(Level level)),  --> repaint() instead of refreshWidgets();
// levelBuilder.Level
// levelBuilder.Model 
// levelBuilder.Container
